package com.onps.model.vo;

import java.util.Date;
import java.util.List;

/**
 * 与前台交互的用户类
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/21
 */
public class UserVo {

    private String id;//用户ID
    private String username;//用户名
    private String password;//密码
    private String ZQ;//战区
    private String JBZ;//军兵种
    private String department;//部门
    private Date date;//时间

    private List<RoleVo> roleVoList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getZQ() {
        return ZQ;
    }

    public void setZQ(String ZQ) {
        this.ZQ = ZQ;
    }

    public String getJBZ() {
        return JBZ;
    }

    public void setJBZ(String JBZ) {
        this.JBZ = JBZ;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<RoleVo> getRoleVoList() {
        return roleVoList;
    }

    public void setRoleVoList(List<RoleVo> roleVoList) {
        this.roleVoList = roleVoList;
    }
}
