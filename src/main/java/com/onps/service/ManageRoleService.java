package com.onps.service;

/**
 * 角色的基本管理
 * <p>
 * 1。将某个  或者一些角色 授予给一个用户
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/18
 */
public interface ManageRoleService {

    /**
     * 将一批角色授予给某人
     *
     * @param userId  用户ID
     * @param rolesId roleId
     * @return
     * @throws Exception
     */
    Object grantRolesToSomeOne(String userId, String[] rolesId) throws Exception;


    /**
     * 取消用户权限
     *
     * @param userId 用户ID
     * @param rolesId roleId
     * @return
     * @throws Exception
     */
    Object revokeRolesFromSomeOne(String userId, String[] rolesId) throws Exception;

    /**
     * 查询所有角色
     *
     * @return
     * @throws Exception
     */
    Object selectAllRole() throws Exception;


    /**
     * 查询roleId 下面的所包含的权限
     *
     * @param roleId
     * @return
     * @throws Exception
     */
    Object selectPermissionByRoleId(String roleId) throws Exception;
}
