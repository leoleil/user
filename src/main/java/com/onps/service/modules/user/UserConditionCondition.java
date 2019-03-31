package com.onps.service.modules.user;

import com.onps.dao.UserDAO;
import com.onps.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserConditionCondition implements IUserCondition {
    private User user;
    private Map<String,String> roles = new HashMap<>();
    private Map<String,String> permissions = new HashMap<>();

    @Autowired
    private UserDAO userDAO;


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
     * 获取登录的User对象
     *
     * @return 返回null为没有用户登录
     */
    @Override
    public User getLoginUser() {
        return this.user;
    }

    /**
     * 判断用户是某个角色吗
     *
     * @param role 角色名字
     * @return true为真
     */
    @Override
    public boolean isRole(String role) {
        String myRole = roles.get(role);
        if(myRole == null){
            return false;
        }
        return true;
    }

    /**
     * 判断用户是否有权限
     *
     * @param permission 权限名字
     * @return true为真
     */
    @Override
    public boolean havePermission(String permission) {
        String myPermission = permissions.get(permission);
        if(myPermission == null){
            return false;
        }
        return true;
    }

    /**
     * 获取角色的list
     *
     * @return
     */
    @Override
    public List<String> getRoleList() {
        return null;
    }

    /**
     * 获取权限的list
     *
     * @return
     */
    @Override
    public List<String> getPermissionList() {
        return null;
    }
}
