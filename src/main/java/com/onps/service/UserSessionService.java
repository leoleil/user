package com.onps.service;

import com.onps.model.User;
import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;

import java.util.List;
import java.util.Set;

public interface UserSessionService {

    /**
     * 用户登录
     * @param userName 用户名
     * @return 登录成功返回User实体，否则返回null
     */
    User loggin(String userName);

    /**
     * 通过用户名获取用户角色名列表
     * @param username 用户名
     * @return 如果没有角色返回null
     */
    List<String> getRoleListByUsername(String username);

    /**
     * 通过用户名获取权限列表
     * @param username
     * @return 如果没有权限返回null
     */
    List<String> getPermissionListByUsername(String username);

    /**
     * 判断角色
     * @param role
     * @return 是返回true
     */
    boolean isRole(String role);

    /**
     * 判断权限
     * @param permission
     * @return 有返回true
     */
    boolean hasPermission(String permission);

    /**
     * 添加角色
     * @param role
     */
    void addRole(String role);

    /**
     * 添加权限
     * @param permission
     */
    void addPermission(String permission);
}
