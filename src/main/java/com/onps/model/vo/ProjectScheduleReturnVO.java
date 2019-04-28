package com.onps.model.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ProjectScheduleReturnVO {
    //表A目录
    private String projectId;//表A的 id

    private String submitCompany;//填报单位

    private String projectName;//项目名称

    private String documentName;//文件名

    private String documentNumber;//文件号

    private Date documentDate;//填报时间

    private BigDecimal investmentamount;//计划投资

    private String approvalAuthority;//审批权限

    private String constructionPeriod;//建设周期

    private BigDecimal isimportent;//是否规划重点项目

    private String level1;//五个地理位置

    private String level2;//二级地理位置

    private String level3;//建设计划

    private String level4;//十几五建设计划

    private String level5;//军区军兵种后勤

    private Date timestamp;//时间戳

    private List<SubProjectScheduleReturnVO> SubProjects;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSubmitCompany() {
        return submitCompany;
    }

    public void setSubmitCompany(String submitCompany) {
        this.submitCompany = submitCompany;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public BigDecimal getInvestmentamount() {
        return investmentamount;
    }

    public void setInvestmentamount(BigDecimal investmentamount) {
        this.investmentamount = investmentamount;
    }

    public String getApprovalAuthority() {
        return approvalAuthority;
    }

    public void setApprovalAuthority(String approvalAuthority) {
        this.approvalAuthority = approvalAuthority;
    }

    public String getConstructionPeriod() {
        return constructionPeriod;
    }

    public void setConstructionPeriod(String constructionPeriod) {
        this.constructionPeriod = constructionPeriod;
    }

    public BigDecimal getIsimportent() {
        return isimportent;
    }

    public void setIsimportent(BigDecimal isimportent) {
        this.isimportent = isimportent;
    }

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public String getLevel4() {
        return level4;
    }

    public void setLevel4(String level4) {
        this.level4 = level4;
    }

    public String getLevel5() {
        return level5;
    }

    public void setLevel5(String level5) {
        this.level5 = level5;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<SubProjectScheduleReturnVO> getSubProjects() {
        return SubProjects;
    }

    public void setSubProjects(List<SubProjectScheduleReturnVO> subProjects) {
        SubProjects = subProjects;
    }
}
