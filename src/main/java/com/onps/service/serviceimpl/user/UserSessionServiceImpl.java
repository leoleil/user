package com.onps.service.serviceimpl.user;

import com.onps.dao.UserDAO;
import com.onps.dao.UserManagementDAO;
import com.onps.model.User;
import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;
import com.onps.service.UserSessionService;
import com.onps.service.modules.user.IUserCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;


@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserSessionServiceImpl implements UserSessionService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserManagementDAO userManagementDAO;


    /**
     * 用户登录
     *
     * @param userName 用户名
     * @return 登录成功返回User实体，否则返回null
     */
    @Override
    public User loggin(String userName) {
        User user = userDAO.login(userName);
        return user;
    }

    /**
     * 通过用户名获取用户角色名列表
     *
     * @param username 用户名
     * @return 如果没有角色返回null
     */
    @Override
    public List<String> getRoleListByUsername(String username) {
        List<RolePO> rolePOList = userManagementDAO.getRoleByUsername(username);
        if(rolePOList == null){
            return null;
        }
        rolePOList =(ArrayList<RolePO>) rolePOList;
        List<String> roleStringList = new ArrayList<String>();

        for(int i=0 , length = rolePOList.size(); i < length; i++){
            RolePO rolePO = rolePOList.get(i);
            roleStringList.add(rolePO.getName());
        }
        return roleStringList;
    }

    /**
     * 通过用户名获取权限列表
     *
     * @param username
     * @return 如果没有权限返回null
     */
    @Override
    public List<String> getPermissionListByUsername(String username) {
        List<PermissionPO> permissionPOList = userManagementDAO.getPermissionByUsername(username);
        if(permissionPOList == null){
            return null;
        }
        List<String> permissionStringList = new ArrayList<>();
        for (PermissionPO permissionPO: permissionPOList
             ) {
            permissionStringList.add(permissionPO.getName());
        }
        return permissionStringList;
    }

}
