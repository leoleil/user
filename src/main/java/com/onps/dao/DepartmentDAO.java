package com.onps.dao;

import com.onps.model.po.DepartmentPO;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentDAO {
    /**
     * 插入部门数据
     * @param departmentPO 部门数据
     * @throws Exception
     */
    void insertDepartment(DepartmentPO departmentPO)throws Exception;

    /**
     * 根据部门 ID 删除部门
     * @param departmentPO 部门数据,ID不能为空
     * @throws Exception
     */
    void deleteDepartment(DepartmentPO departmentPO)throws Exception;

    /**
     * 返回全部部门的列表
     * @return
     */
    List<DepartmentPO> getDepartmentList();

    /**
     * 根据部门id 查找部门
     * @param id
     * @return
     */
    DepartmentPO getDepartment(String id);
}
