package com.onps.dao;

import com.onps.model.User;
import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserManagementDAO {
    void saveUserRole(String userID, String roleID);
    void saveRolePermission(String roleID, String permissionID);
    void removeUserRole(String userID, String roleID);
    void removeRolePermission(String roleID, String permissionID);
}
