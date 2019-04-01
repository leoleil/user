package com.onps.service;

import com.onps.model.User;
import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;

import java.util.List;

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


}
