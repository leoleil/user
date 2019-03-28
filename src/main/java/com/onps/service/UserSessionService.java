package com.onps.service;

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
}
