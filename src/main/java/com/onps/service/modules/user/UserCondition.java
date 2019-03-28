package com.onps.service.modules.user;

import com.onps.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserCondition implements IUser {
    private User user;
    /**
     * 登录
     *
     * @param user 传入登录的User对象
     */
    @Override
    public void login(User user) {
        this.user = user;
    }

    /**
     * 登出
     *
     * @param user 传入登出的User对象
     * @return 登出成功返回true, 否则为false
     */
    @Override
    public boolean logout(User user) {
        if(user == null || this.user == null){
            return false;
        }else {
            if(user.getUserName().equals(this.user.getUserName())){
                this.user = null;
                return true;
            } else{
                return false;
            }
        }
    }

    /**
     * 获取登录的User对象
     *
     * @return 返回null为没有用户登录
     */
    @Override
    public User getLoginUser() {
        return this.user;
    }
}
