package com.onps.dao;

import com.onps.model.po.RolePO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RoleDAO {
    void insertRole(RolePO rolePO);

    void deleteRole(RolePO rolePO);

    List<RolePO> getRoleList();

    RolePO getRole(String roleName);

    /**
     *
     * @param roleId
     * @return
     */
    RolePO getRoleByRoleId(@Param("roleId") String roleId);


}
