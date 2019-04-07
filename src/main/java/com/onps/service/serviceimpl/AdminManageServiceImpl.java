package com.onps.service.serviceimpl;

import com.onps.dao.PermissionDAO;
import com.onps.dao.RoleDAO;
import com.onps.dao.UserDAO;
import com.onps.dao.UserManagementDAO;
import com.onps.model.User;
import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;
import com.onps.model.po.UserPO;
import com.onps.service.AdminManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈雷雨
 * @since 2019/4/2
 */
@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AdminManageServiceImpl implements AdminManageService {

    @Resource
    private UserDAO userDAO;
    @Resource
    private PermissionDAO permissionDAO;
    @Resource
    private RoleDAO roleDAO;
    @Resource
    private UserManagementDAO userManagementDAO;

    @Override
    public void insertUser(UserPO userPO) throws Exception {
        userDAO.insertUser(userPO);
    }

    @Override
    public void deleteUser(UserPO userPO) throws Exception {
        userDAO.deleteUser(userPO);
    }

    @Override
    public List<UserPO> getUserList() {
        return userDAO.getUserList();
    }

    @Override
    public User getUserById(String id) {
        return userDAO.getUserById(id);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userDAO.getUserByUserName(userName);
    }

    @Override
    public void updateUser(UserPO userPO) throws Exception {
        userDAO.updateUser(userPO);
    }

    @Override
    public void insertPermission(PermissionPO permissionPO) throws Exception {
        permissionDAO.insertPermission(permissionPO);
    }

    @Override
    public void deletePermission(PermissionPO permissionPO) throws Exception {
        permissionDAO.deletePermission(permissionPO);
    }

    @Override
    public List<PermissionPO> getPermissionList() {
        return permissionDAO.getPermissionList();
    }

    @Override
    public void insertRole(RolePO rolePO) throws Exception {
        roleDAO.insertRole(rolePO);
    }

    @Override
    public void deleteRole(RolePO rolePO) throws Exception {
        roleDAO.deleteRole(rolePO);
    }

    @Override
    public List<RolePO> getRoleList() {
        return roleDAO.getRoleList();
    }

    @Override
    public void saveUserRole(String userName, String roleName) throws Exception {
        User user =  userDAO.getUserByUserName(userName);
        if(user == null){
            throw new Exception("用户不存在");
        }
        RolePO rolePO = roleDAO.getRole(roleName);
        if(rolePO == null){
            throw new Exception("角色不存在");
        }
        userManagementDAO.saveUserRole(user.getUserId(),rolePO.getId());
    }

    @Override
    public void saveRolePermission(String roleName, String permissionName) throws Exception {
        RolePO rolePO = roleDAO.getRole(roleName);
        if(rolePO == null){
            throw new Exception("角色不存在");
        }
        PermissionPO permissionPO = permissionDAO.getPermission(permissionName);
        if(permissionPO == null){
            throw new Exception("权限不存在");
        }
        userManagementDAO.saveRolePermission(rolePO.getId(), permissionPO.getId());
    }

    @Override
    public void removeUserRole(String userName, String roleName) throws Exception {
        User user =  userDAO.getUserByUserName(userName);
        if(user == null){
            throw new Exception("用户不存在");
        }
        RolePO rolePO = roleDAO.getRole(roleName);
        if(rolePO == null){
            throw new Exception("角色不存在");
        }
        userManagementDAO.removeRolePermission(user.getUserId(), rolePO.getId());
    }

    @Override
    public void removeRolePermission(String roleName, String permissionName) throws Exception {
        RolePO rolePO = roleDAO.getRole(roleName);
        if(rolePO == null){
            throw new Exception("角色不存在");
        }
        PermissionPO permissionPO = permissionDAO.getPermission(permissionName);
        if(permissionPO == null){
            throw new Exception("权限不存在");
        }
        userManagementDAO.removeRolePermission(rolePO.getId(), permissionPO.getId());
    }

    @Override
    public List<PermissionPO> getPermissionByUsername(String username) {
        return userManagementDAO.getPermissionByUsername(username);
    }

    @Override
    public List<RolePO> getRoleByUsername(String username) {
        return userManagementDAO.getRoleByUsername(username);
    }

    @Override
    public List<PermissionPO> getPermissionByRolename(String rolename) {
        return userManagementDAO.getPermissionByRolename(rolename);
    }
}
