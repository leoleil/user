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
}
