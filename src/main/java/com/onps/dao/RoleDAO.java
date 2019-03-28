package com.onps.dao;

import com.onps.model.po.RolePO;

import java.util.List;

public interface RoleDAO {
    void insertRole(RolePO rolePO);
    void deleteRole(RolePO rolePO);
    List<RolePO> getRoleList();
    RolePO getRole(String id);
}
