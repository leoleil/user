package com.onps.service;

import com.onps.model.User;

public interface UserSessionService {
    /**
     * 判断是否有用户登录
     * @return
     */
    boolean isLogin();

    /**
     * 用户登出
     * @param userName 用户名
     * @return
     */
    boolean logout(String userName);

    /**
     * 用户登录
     * @param userName 用户名
     * @return 登录成功返回User实体，否则返回null
     */
    User loggin(String userName);
}
