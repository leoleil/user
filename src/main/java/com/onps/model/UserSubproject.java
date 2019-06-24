package com.onps.model;

import java.util.Date;

public class UserSubproject {
    private String id;

    private String projectid;

    private String subprojectid;

    private String level1;

    private String level2;

    private String level3;

    private String level4;

    private String level5;

    private String iscorrect;

    private String userid;

    private String defaultdescription;

    private Date updatetime;

    private Date timestap;

    private String add1;

    private String add2;

    private Date add3;

    private String add4;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public String getSubprojectid() {
        return subprojectid;
    }

    public void setSubprojectid(String subprojectid) {
        this.subprojectid = subprojectid == null ? null : subprojectid.trim();
    }

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1 == null ? null : level1.trim();
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2 == null ? null : level2.trim();
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3 == null ? null : level3.trim();
    }

    public String getLevel4() {
        return level4;
    }

    public void setLevel4(String level4) {
        this.level4 = level4 == null ? null : level4.trim();
    }

    public String getLevel5() {
        return level5;
    }

    public void setLevel5(String level5) {
        this.level5 = level5 == null ? null : level5.trim();
    }

    public String getIscorrect() {
        return iscorrect;
    }

    public void setIscorrect(String iscorrect) {
        this.iscorrect = iscorrect == null ? null : iscorrect.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getDefaultdescription() {
        return defaultdescription;
    }

    public void setDefaultdescription(String defaultdescription) {
        this.defaultdescription = defaultdescription == null ? null : defaultdescription.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getTimestap() {
        return timestap;
    }

    public void setTimestap(Date timestap) {
        this.timestap = timestap;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1 == null ? null : add1.trim();
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2 == null ? null : add2.trim();
    }

    public Date getAdd3() {
        return add3;
    }

    public void setAdd3(Date add3) {
        this.add3 = add3;
    }

    public String getAdd4() {
        return add4;
    }

    public void setAdd4(String add4) {
        this.add4 = add4 == null ? null : add4.trim();
    }
}