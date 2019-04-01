package com.onps.service.serviceimpl;

import com.onps.dao.PermissionDAO;
import com.onps.dao.UserDAO;
import com.onps.model.User;
import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;
import com.onps.model.po.UserPO;
import com.onps.service.AdminManageService;

import java.util.List;

public class AdminManageServiceImpl implements AdminManageService {
    private UserDAO userDAO;
    private PermissionDAO permissionDAO;
    @Override
    public void insertUser(UserPO userPO) throws Exception {

    }

    @Override
    public void deleteUser(UserPO userPO) throws Exception {

    }

    @Override
    public List<UserPO> getUserList() {
        return null;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User getUserByUserName(String userName) {
        return null;
    }

    @Override
    public void updateUser(UserPO userPO) throws Exception {

    }

    @Override
    public void insertPermission(PermissionPO permissionPO) throws Exception {

    }

    @Override
    public void deletePermission(PermissionPO permissionPO) throws Exception {

    }

    @Override
    public List<PermissionPO> getPermissionList() {
        return null;
    }

    @Override
    public PermissionPO getPermission(String id) {
        return null;
    }

    @Override
    public void insertRole(RolePO rolePO) {

    }

    @Override
    public void deleteRole(RolePO rolePO) {

    }

    @Override
    public List<RolePO> getRoleList() {
        return null;
    }

    @Override
    public RolePO getRole(String id) {
        return null;
    }

    @Override
    public void saveUserRole(String userID, String roleID) {

    }

    @Override
    public void saveRolePermission(String roleID, String permissionID) {

    }

    @Override
    public void removeUserRole(String userID, String roleID) {

    }

    @Override
    public void removeRolePermission(String roleID, String permissionID) {

    }

    @Override
    public List<PermissionPO> getPermissionByUsername(String username) {
        return null;
    }

    @Override
    public List<RolePO> getRoleByUsername(String username) {
        return null;
    }

    @Override
    public List<PermissionPO> getPermissionByRolename(String rolename) {
        return null;
    }
}
