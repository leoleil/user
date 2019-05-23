package com.onps.dao;

import com.onps.model.po.PermissionPO;
import com.onps.model.po.RolePO;
import com.onps.model.vo.PermissionVo;
import com.onps.model.vo.RoleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserManagementDAO {
    void saveUserRole(String userID, String roleID);

    void saveRolePermission(String roleID, String permissionID);

    void removeUserRole(String userID, String roleID);

    void removeRolePermission(String roleID, String permissionID);

    List<PermissionPO> getPermissionByUsername(String username);



    List<RolePO> getRoleByUsername(String username);

    List<PermissionPO> getPermissionByRolename(String rolename);

    /**
     *
     * @param userId
     * @return
     */
    List<RoleVo> getRoleByUserId(@Param("userId") String userId);

    List<PermissionVo> getPermissionByRoleId(@Param("roleId") String roleId);

    /**
     * 删除用户所有的角色
     *
     * @param userId
     * @return
     */
    void deleteAllRoleFromUser(@Param("userId") String userId);

    /**
     * 删除角色所有的权限
     *
     * @param roleId
     * @return
     */
    void deleteAllPermissionFromRole(@Param("roleId") String roleId);

}
