package com.onps.service.serviceimpl.user;

import com.onps.dao.UserDAO;
import com.onps.model.User;
import com.onps.service.UserSessionService;
import com.onps.service.modules.user.IUserCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserSessionServiceImpl implements UserSessionService {
    @Autowired
    private IUserCondition userCondition;

    @Autowired
    private UserDAO userDAO;

    /**
     * 判断是否有用户登录
     *
     * @return
     */
    @Override
    public boolean isLogin() {
        return false;
    }

    /**
     * 用户登出
     *
     * @param userName 用户名
     * @return
     */
    @Override
    public boolean logout(String userName) {
        return false;
    }

    /**
     * 用户登录
     *
     * @param userName 用户名
     * @return 登录成功返回User实体，否则返回null
     */
    @Override
    public User loggin(String userName) {
        User user = userDAO.login(userName);
        if(user != null){
            userCondition.login(user);
        }
        return user;
    }
}
