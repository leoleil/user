package com.onps.service.modules.user;

import com.onps.model.User;

import java.util.List;

public interface IUserCondition {
    /**
     * 登录
     * @param user 传入登录的User对象
     */
    void login(User user);

    /**
     * 获取登录的User对象
     * @return 返回null为没有用户登录
     */
    User getLoginUser();

    /**
     * 判断用户是某个角色吗
     * @param role 角色名字
     * @return true为真
     */
    boolean isRole(String role);

    /**
     * 判断用户是否有权限
     * @param permission 权限名字
     * @return true为真
     */
    boolean havePermission(String permission);

    /**
     * 获取角色的list
     * @return
     */
    List<String> getRoleList();

    /**
     * 获取权限的list
     * @return
     */
    List<String> getPermissionList();

}
