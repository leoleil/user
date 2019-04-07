package com.onps.model;

import java.util.Date;

public class MyUser {
    private String id;

    private Object username;

    private Object password;

    private Object zq;

    private Object jbz;

    private Object department;

    private Date timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Object getZq() {
        return zq;
    }

    public void setZq(Object zq) {
        this.zq = zq;
    }

    public Object getJbz() {
        return jbz;
    }

    public void setJbz(Object jbz) {
        this.jbz = jbz;
    }

    public Object getDepartment() {
        return department;
    }

    public void setDepartment(Object department) {
        this.department = department;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}