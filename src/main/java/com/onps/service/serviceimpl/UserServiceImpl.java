package com.onps.service.serviceimpl;

import com.onps.base.PageInfo;
import com.onps.dao.*;
import com.onps.model.*;
import com.onps.model.po.UserPO;
import com.onps.model.vo.PermissionVo;
import com.onps.model.vo.RoleVo;
import com.onps.model.vo.UserVo;
import com.onps.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author :breakpoint/赵立刚
 * @date : 2019/05/16
 */
@Service("userService")
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserServiceImpl implements UserService {


    /**
     * 用户的基本操作
     */
    @Resource
    private MyUserMapper myUserMapper;

    @Resource
    private UserDAO userDAO;

    /**
     * 查询用户的权限的基本操作
     */
    @Resource
    private UserManagementDAO userManagementDAO;

    @Resource
    private SubprojectMapper subprojectMapper;

    @Resource
    private ProjectMapper projectMapper;


    /**
     * 新增用户的基本操作
     *
     * @param username   用户名
     * @param password   密码
     * @param rePassword 确认密码
     * @param ZQ         战区
     * @param JBZ        军兵种
     * @param department 部门
     * @return
     * @throws Exception
     */
    @Override
    public Object insertUser(String username, String password, String rePassword,
                             String ZQ, String JBZ, String department) throws Exception {

        /**
         * 校验必要的信息
         */

        if (StringUtils.isEmpty(username)) {
            throw new Exception("用户名为空");
        }

        if (StringUtils.isEmpty(password)) {
            throw new Exception("密码为空");
        }

        if (!password.equals(rePassword)) {
            throw new Exception("两次输入密码不一致");
        }

        if (StringUtils.isEmpty(ZQ)) {
            throw new Exception("战区为空");
        }

        if (StringUtils.isEmpty(JBZ)) {
            throw new Exception("军兵种为空");
        }

        if (StringUtils.isEmpty(department)) {
            throw new Exception("部门为空");
        }


        synchronized (UserServiceImpl.class) {
            /**
             * 校验重复性
             */
            MyUserExample myUserExample = new MyUserExample();

            myUserExample.createCriteria().andUsernameEqualTo(username);

            List<MyUser> myUsers = myUserMapper.selectByExample(myUserExample);

            if (null != myUsers && myUsers.size() > 0) {
                throw new Exception("用户已经存在");
            }


            /**
             * 服务器的时间
             */

            Date nowTime = new Date();


            MyUser myUser = new MyUser();
            myUser.setUsername(username);
            myUser.setPassword(password);
            myUser.setZq(ZQ);
            myUser.setJbz(JBZ);
            myUser.setDepartment(department);
            myUser.setTimestamp(nowTime);


            try {
                int i = myUserMapper.insertSelective(myUser);
                return "OK";
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }

    }


    /**
     * 2。如果该用户被授予子项目~不能删除~
     * * 1。就要讲这个用户的所有角色删除掉
     * *
     * *
     *
     * @param userID
     * @return
     * @throws Exception
     */
    @Override
    public Object deleteUser(String userID) throws Exception {

        /**
         * 校验基本信息
         */
        if (StringUtils.isEmpty(userID)) {
            throw new Exception("请求参数里面没有userID");
        }
        try {

            /**
             * 2。校验该用户有没有分配子项目
             */

            ProjectExample projectExample=new ProjectExample();

            projectExample.createCriteria().andUseridEqualTo(userID);

            List<Project> projects = projectMapper.selectByExample(projectExample);

            if (null != projects && projects.size() > 0) {
                //说明 用户已经分配子项目了  所以不能进行删除
                throw new Exception("用户已经分配项目，不能删除");
            }


            SubprojectExample subprojectExample = new SubprojectExample();

            subprojectExample.createCriteria().andUseridEqualTo(userID);

            List<Subproject> subprojects = subprojectMapper.selectByExample(subprojectExample);

            if (null != subprojects && subprojects.size() > 0) {
                //说明 用户已经分配子项目了  所以不能进行删除
                throw new Exception("用户已经分配子项目，不能删除");
            }
            //没有分配子项目的情况  我们这时候应当关注删除用户的角色
            userManagementDAO.deleteAllRoleFromUser(userID,null);
            // 删除成功后  再次删除  用户的本身的信息
            int i = myUserMapper.deleteByPrimaryKey(userID);
            return "OK";
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * 更新用户的信息
     *
     * @param userId
     * @return
     * @throws Exception
     */
    @Override
    public Object updateUserMessage(String userId, String ZQ, String JBZ, String department) throws Exception {

        /**
         * 校验基本信息
         *
         *      * @param ZQ         战区
         *      * @param JBZ        军兵种
         *      * @param department 部门
         */

        if (StringUtils.isEmpty(userId)) {
            throw new Exception("请求参数里面没有userId");
        }

        if (StringUtils.isEmpty(ZQ)) {
            throw new Exception("战区为空");
        }

        if (StringUtils.isEmpty(JBZ)) {
            throw new Exception("军兵种为空");
        }

        if (StringUtils.isEmpty(department)) {
            throw new Exception("部门为空");
        }


        /**
         * 查询用户
         */
        MyUser myUser = myUserMapper.selectByPrimaryKey(userId);

        if (null == myUser) {
            throw new Exception("系统没有更新的用户");
        }

        myUser.setZq(ZQ);

        myUser.setJbz(JBZ);

        myUser.setDepartment(department);


        try {
            int i = myUserMapper.updateByPrimaryKeySelective(myUser);

            return "Ok";

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * 修改用户的登陆密码
     *
     * @return
     * @throws Exception
     */
    @Override
    public Object updateUserPassWord(String userId, String oriPassword, String password, String rePassword) throws Exception {

        /**
         * 校验基本信息
         */

        if (StringUtils.isEmpty(userId)) {
            throw new Exception("请求参数里面没有userId");
        }

        if (StringUtils.isEmpty(oriPassword)) {
            throw new Exception("原来的密码为空");
        }

        if (StringUtils.isEmpty(password)) {
            throw new Exception("新密码为空");
        }

        if (!password.equals(rePassword)) {
            throw new Exception("两次输入密码不一致");
        }

        /**
         * 查询用户
         */
        MyUser myUser = myUserMapper.selectByPrimaryKey(userId);

        if (null == myUser) {
            throw new Exception("系统没有更新的用户");
        }


        if (!oriPassword.equals(myUser.getPassword())) {
            throw new Exception("原密码输入错误");
        }

        /*    校验完毕  下面是更新数据部分   */

        myUser.setPassword(password);

        try {
            int i = myUserMapper.updateByPrimaryKeySelective(myUser);

            return "Ok";

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }


    /**
     * 查询用户的操作
     *
     * @param pageInfo
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<UserVo> getUserByPageInfo(PageInfo pageInfo) throws Exception {


        int allUserCount = userDAO.countAllUser();


        int currentPage = pageInfo.getCurrentPage();

        int pageSize = pageInfo.getPageSize();
        System.out.println(pageSize);

        int start = (currentPage - 1) * pageSize + 1;

        int end = start + pageSize;

        List<UserVo> userByPageInfo = userDAO.getUserByPageInfo(start, end);

        /**
         * 查询数据并且进行返回
         */
        if (null != userByPageInfo && userByPageInfo.size() > 0) {
            for (UserVo userVo : userByPageInfo) {
                List<RoleVo> roleByUserId = userManagementDAO.getRoleByUserId(userVo.getId());
                userVo.setRoleVoList(roleByUserId);
                if (null != roleByUserId && roleByUserId.size() > 0) {
                    for (RoleVo roleVo : roleByUserId) {
                        List<PermissionVo> permissionByRoleId = userManagementDAO.getPermissionByRoleId(roleVo.getId());
                        roleVo.setPermissionVoList(permissionByRoleId);
                    }

                }
            }

        } else {
            userByPageInfo = Collections.emptyList();
        }


        pageInfo.setData(userByPageInfo);

        pageInfo.setDataTotal(allUserCount);

        int pageTotal = allUserCount / pageSize + 1;

        pageInfo.setPageTotal(pageTotal);

        int nextPage = (currentPage == pageTotal) ? pageTotal : (currentPage + 1);

        pageInfo.setNextPage(nextPage);

        return pageInfo;
    }


}
