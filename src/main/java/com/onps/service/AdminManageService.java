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

    void insertRole(RolePO rolePO) throws Exception;

    void deleteRole(RolePO rolePO) throws Exception;

    List<RolePO> getRoleList();

    void saveUserRole(String userName, String roleName) throws Exception;

    void saveRolePermission(String roleName, String permissionName) throws Exception;

    void removeUserRole(String userName, String roleName) throws Exception;

    void removeRolePermission(String roleName, String permissionName) throws Exception;

    List<PermissionPO> getPermissionByUsername(String username);

    List<RolePO> getRoleByUsername(String username);

    List<PermissionPO> getPermissionByRolename(String rolename);
}
