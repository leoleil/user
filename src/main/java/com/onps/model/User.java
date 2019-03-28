package com.onps.model;

import java.util.Date;

/**
 * 用户基本类属于POJO类型，可以从前台传到后台
 * @author 陈雷雨 2019/3/16
 */
public class User {
    private String userId;//用户编号
    private String userName;//用户名称
    private String password;//密码
    private String department;//部门名称
    private String ZQ;//战区
    private String JBZ;//军兵种
    private Date date;//创建时间
    /* 其它表字段  */
    private String role;//用户角色

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
