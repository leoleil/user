package com.onps.service.serviceimpl;

import com.onps.dao.MyUserMapper;
import com.onps.dao.RoleDAO;
import com.onps.dao.UserManagementDAO;
import com.onps.model.MyUser;
import com.onps.service.ManageRoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * 角色的基本管理
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/18
 */
@Service("manageRoleService")
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ManageRoleServiceImpl implements ManageRoleService {

    /**
     * 一些必要的对象操作
     */
    @Resource
    private MyUserMapper myUserMapper;

    @Resource
    private UserManagementDAO userManagementDAO;

    @Resource
    private RoleDAO roleDAO;

    /**
     * 注意 这个方法也可以给用户取消权限
     *
     * @param userId  用户ID
     * @param rolesId roleId
     * @return
     * @throws Exception
     */
    @Override
    public Object grantRolesToSomeOne(String userId, String[] rolesId) throws Exception {

        /*   业务的操作逻辑   也就是 把一批的权限授予某个用户  也就是  现将用户的所有的权限删除 在进行插入新的数据   */

        /**
         * 校验基本信息
         */
        if (StringUtils.isEmpty(userId)) {
            throw new Exception("用户Id为空");
        }


        MyUser myUser = myUserMapper.selectByPrimaryKey(userId);

        if (null == myUser) {
            throw new Exception("你想授予的用户不存在");
        }

        try {
            /*   删除用户的一切权限  start */
            userManagementDAO.deleteAllRoleFromUser(userId);
            /*   删除用户的一切权限  end */

            /*  给用户增权限 start  */
            if (null != rolesId && rolesId.length > 0) {
                //有权限的时候在进行操作
                for (String roleId : rolesId) {
                    userManagementDAO.saveUserRole(userId, roleId);
                }
            }
            return "OK";
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }


    }

    /**
     * 查询所有的用户的角色
     *
     * @return
     * @throws Exception
     */
    @Override
    public Object selectAllRole() throws Exception {

        try {
            return roleDAO.getRoleList();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
