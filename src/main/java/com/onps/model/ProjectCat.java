package com.onps.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProjectCat {
    private String id;

    private String parentId;

    private Object projectname;

    private BigDecimal isParent;

    private Date timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Object getProjectname() {
        return projectname;
    }

    public void setProjectname(Object projectname) {
        this.projectname = projectname;
    }

    public BigDecimal getIsParent() {
        return isParent;
    }

    public void setIsParent(BigDecimal isParent) {
        this.isParent = isParent;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}