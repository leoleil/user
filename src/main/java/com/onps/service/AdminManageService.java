package com.onps.service;

import com.onps.model.User;
import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;
import com.onps.model.po.UserPO;

import java.util.List;

public interface AdminManageService {

    void insertUser(UserPO userPO)throws Exception;

    void deleteUser(UserPO userPO)throws Exception;

    List<UserPO> getUserList();

    User getUserById(String id);

    User getUserByUserName(String userName);

    void updateUser(UserPO userPO)throws Exception;

    void insertPermission(PermissionPO permissionPO)throws Exception;

    void deletePermission(PermissionPO permissionPO)throws Exception;

    List<PermissionPO> getPermissionList();

    PermissionPO getPermission(String id);

    void insertRole(RolePO rolePO);

    void deleteRole(RolePO rolePO);

    List<RolePO> getRoleList();

    RolePO getRole(String id);

    void saveUserRole(String userID, String roleID);

    void saveRolePermission(String roleID, String permissionID);

    void removeUserRole(String userID, String roleID);

    void removeRolePermission(String roleID, String permissionID);

    List<PermissionPO> getPermissionByUsername(String username);

    List<RolePO> getRoleByUsername(String username);

    List<PermissionPO> getPermissionByRolename(String rolename);
}
