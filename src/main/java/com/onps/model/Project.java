package com.onps.model;

import java.math.BigDecimal;
import java.util.Date;

public class Project {
    private String id;

    private Object submitcompany;

    private Object projectname;

    private Object documentname;

    private Object documentnumber;

    private Date documentdate;

    private BigDecimal investmentamount;

    private Object approvalauthority;

    private Object constructionperiod;

    private BigDecimal isimportent;

    private Object level1;

    private Object level2;

    private Object level3;

    private Object level4;

    private Object level5;

    private Date timestamp;

    private String userid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Object getSubmitcompany() {
        return submitcompany;
    }

    public void setSubmitcompany(Object submitcompany) {
        this.submitcompany = submitcompany;
    }

    public Object getProjectname() {
        return projectname;
    }

    public void setProjectname(Object projectname) {
        this.projectname = projectname;
    }

    public Object getDocumentname() {
        return documentname;
    }

    public void setDocumentname(Object documentname) {
        this.documentname = documentname;
    }

    public Object getDocumentnumber() {
        return documentnumber;
    }

    public void setDocumentnumber(Object documentnumber) {
        this.documentnumber = documentnumber;
    }

    public Date getDocumentdate() {
        return documentdate;
    }

    public void setDocumentdate(Date documentdate) {
        this.documentdate = documentdate;
    }

    public BigDecimal getInvestmentamount() {
        return investmentamount;
    }

    public void setInvestmentamount(BigDecimal investmentamount) {
        this.investmentamount = investmentamount;
    }

    public Object getApprovalauthority() {
        return approvalauthority;
    }

    public void setApprovalauthority(Object approvalauthority) {
        this.approvalauthority = approvalauthority;
    }

    public Object getConstructionperiod() {
        return constructionperiod;
    }

    public void setConstructionperiod(Object constructionperiod) {
        this.constructionperiod = constructionperiod;
    }

    public BigDecimal getIsimportent() {
        return isimportent;
    }

    public void setIsimportent(BigDecimal isimportent) {
        this.isimportent = isimportent;
    }

    public Object getLevel1() {
        return level1;
    }

    public void setLevel1(Object level1) {
        this.level1 = level1;
    }

    public Object getLevel2() {
        return level2;
    }

    public void setLevel2(Object level2) {
        this.level2 = level2;
    }

    public Object getLevel3() {
        return level3;
    }

    public void setLevel3(Object level3) {
        this.level3 = level3;
    }

    public Object getLevel4() {
        return level4;
    }

    public void setLevel4(Object level4) {
        this.level4 = level4;
    }

    public Object getLevel5() {
        return level5;
    }

    public void setLevel5(Object level5) {
        this.level5 = level5;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}