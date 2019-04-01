package com.onps.utils;

import com.onps.model.User;
import com.onps.service.UserSessionService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyShrio extends AuthorizingRealm {

    @Autowired
    private UserSessionService userSessionService;

    @Override
    public String getName() {
        return "myShrio";
    }

    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("进入授权逻辑");
        User user =(User) principalCollection.getPrimaryPrincipal();
        if(user == null){
            return null;
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<String> roleList =  userSessionService.getRoleListByUsername(user.getUserName());
        if(roleList != null){
            for (String role: roleList
                 ) {
                info.addRole(role);
            }
        }
        List<String> permissionList = userSessionService.getPermissionListByUsername(user.getUserName());
        if(permissionList != null){
            for (String permission: permissionList
                 ) {
                info.addStringPermission(permission);
            }
        }
        return info;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("进入身份认证");
        //判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User user = userSessionService.loggin(token.getUsername());
        if(user == null){
            return null;//用户不存在返回null
        }
        //判断密码
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getPassword(),getName());
        return info;
    }
}
