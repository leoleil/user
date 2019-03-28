package com.onps.dao;

import com.onps.model.po.RolePO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleDAO {
    void insertRole(RolePO rolePO);
    void deleteRole(RolePO rolePO);
    List<RolePO> getRoleList();
    RolePO getRole(String id);
}
