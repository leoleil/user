package com.onps.dao;

import com.onps.model.po.PermissionPO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionDAO {
    /**
     * 插入权限
     * @param permissionPO 权限数据
     * @throws Exception 插入异常，数据库连接异常等
     */
    void insertPermission(PermissionPO permissionPO)throws Exception;

    /**
     * 删除权限
     * @param permissionPO 权限数据
     * @throws Exception 删除异常，数据连接异常等
     */
    void deletePermission(PermissionPO permissionPO)throws Exception;

    /**
     * 获取权限列表
     * @return 权限的列表数据
     */
    List<PermissionPO> getPermissionList();

    /**
     * 通过 UUID 获取权限
     * @param id 权限id
     * @return 权限对象
     */
    PermissionPO getPermission(String id);
}
