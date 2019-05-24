package com.onps.service;

/**
 * 用户权限的基本管理
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/18
 */
public interface ManagePermissionsService {

    /**
     * 给某个角色授予某个权限
     *
     * @param roleId        角色Id
     * @param permissionIds 权限
     * @return
     */
    Object grantPermissionsToSomeRole(String roleId, String[] permissionIds) throws Exception;


    /**
     * 删除权限
     *
     * @param roleId        角色Id
     * @param permissionIds 权限
     * @return
     * @throws Exception
     */
    Object revokePermissionsFromSomeRole(String roleId, String[] permissionIds) throws Exception;

    /**
     * 查询所有的权限
     *
     * @return
     * @throws Exception
     */
    Object selectAllPermission() throws Exception;
}
