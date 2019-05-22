package com.onps.service.serviceimpl;

import com.onps.dao.PermissionDAO;
import com.onps.dao.RoleDAO;
import com.onps.dao.UserManagementDAO;
import com.onps.model.po.RolePO;
import com.onps.service.ManagePermissionsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * 权限的基本操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/18
 */
@Service("managePermissionsService")
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ManagePermissionsServiceImpl implements ManagePermissionsService {

    /**
     * 一些必要的操作
     */
    @Resource
    private RoleDAO roleDAO;

    @Resource
    private UserManagementDAO userManagementDAO;

    @Resource
    private PermissionDAO permissionDAO;


    /**
     * @param roleId        角色Id
     * @param permissionIds 权限
     * @return
     */
    @Override
    public Object grantPermissionsToSomeRole(String roleId, String[] permissionIds) throws Exception {

        /**
         * 校验基本信息
         */
        if (StringUtils.isEmpty(roleId)) {
            throw new Exception("角色ID为空");
        }

        RolePO roleByRoleId = roleDAO.getRoleByRoleId(roleId);

        if (null == roleByRoleId) {
            throw new Exception("该角色不存在");
        }


        try {

            userManagementDAO.deleteAllPermissionFromRole(roleId);


            if (null != permissionIds) {
                for (String permissionId : permissionIds) {
                    userManagementDAO.saveRolePermission(roleId, permissionId);
                }

            }

            return "OK";
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }


    }

    /**
     * 查询所有的权限
     *
     * @return
     * @throws Exception
     */
    @Override
    public Object selectAllPermission() throws Exception {
        try {
            return permissionDAO.getPermissionList();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
