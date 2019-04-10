package com.onps.model.vo;

import java.math.BigDecimal;
import java.util.Date;

public class ProjectScheduleVO {
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

    //表B目录
    private String subprojectId;//表B的ID

    private String subName;//子项目名

    private String startTimeCon;//建设开工时间

    private String endTimeCon;//建设竣工时间

    private String submitFileName;//计划书送审文件名

    private String submitDepartment;//计划书送审单位

    private String submitNumber;//计划书送审文号

    private Date submitDate;//计划书送审时间

    private String approvalName;//计划书批复文件名

    private String approvalDepartment;//计划书批复单位

    private String approvalNumber;//计划书批复文号

    private Date approvalDate;//计划书批复时间

    private String submitFileNameTa;//任务书送审文件名

    private String submitDepartmentTa;//任务书送审单位

    private String submitNumberTa;//任务书送审文号

    private Date submitDateTa;//任务书送审时间

    private String approvalNameTa;//任务书批复文件名

    private String approvalDepartmentTa;//任务书批复单位

    private String approvalNumberTa;//任务书批复文号

    private Date approvalDateTa;//任务书批复时间

    private Date replyDate;//军委机关回复时间

    private String approvalProgress;//审批进展

    private String constructionContent;//主要建设内容以及发展

    private String projectNumber;//工程代号

    private String constructionPlace;//建设地点

    private String constructionCompany;//建设单位

    private BigDecimal releaseInvestment;//下达投资（万元）

    //C表
    private String constructionPhase;//建设阶段

    private String firstDesign;//初步设计

    private String bidding;//招标采购

    private String constructionDesign;//施工图设计

    private Date startTime;//开工时间

    private String testTime;//初验时间

    private Date endTime;//竣工时间

    private String projectProgress;//工程进度

    private BigDecimal completedInvestment;//已经完成投资

    private String formedAbility;//已经形成能力

    private String designedAbility;//完工后预期形成能力

    private String remarks;//备注

    private String reason;//未完成原因

    private String department;//提交部门


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

    public BigDecimal getIsIsimportent() {
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

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getSubmitFileName() {
        return submitFileName;
    }

    public void setSubmitFileName(String submitFileName) {
        this.submitFileName = submitFileName;
    }

    public String getSubmitDepartment() {
        return submitDepartment;
    }

    public void setSubmitDepartment(String submitDepartment) {
        this.submitDepartment = submitDepartment;
    }

    public String getSubmitNumber() {
        return submitNumber;
    }

    public void setSubmitNumber(String submitNumber) {
        this.submitNumber = submitNumber;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public String getApprovalName() {
        return approvalName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }

    public String getApprovalDepartment() {
        return approvalDepartment;
    }

    public void setApprovalDepartment(String approvalDepartment) {
        this.approvalDepartment = approvalDepartment;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getSubmitFileNameTa() {
        return submitFileNameTa;
    }

    public void setSubmitFileNameTa(String submitFileNameTa) {
        this.submitFileNameTa = submitFileNameTa;
    }

    public String getSubmitDepartmentTa() {
        return submitDepartmentTa;
    }

    public void setSubmitDepartmentTa(String submitDepartmentTa) {
        this.submitDepartmentTa = submitDepartmentTa;
    }

    public String getSubmitNumberTa() {
        return submitNumberTa;
    }

    public void setSubmitNumberTa(String submitNumberTa) {
        this.submitNumberTa = submitNumberTa;
    }

    public Date getSubmitDateTa() {
        return submitDateTa;
    }

    public void setSubmitDateTa(Date submitDateTa) {
        this.submitDateTa = submitDateTa;
    }

    public String getApprovalNameTa() {
        return approvalNameTa;
    }

    public void setApprovalNameTa(String approvalNameTa) {
        this.approvalNameTa = approvalNameTa;
    }

    public String getApprovalDepartmentTa() {
        return approvalDepartmentTa;
    }

    public void setApprovalDepartmentTa(String approvalDepartmentTa) {
        this.approvalDepartmentTa = approvalDepartmentTa;
    }

    public String getApprovalNumberTa() {
        return approvalNumberTa;
    }

    public void setApprovalNumberTa(String approvalNumberTa) {
        this.approvalNumberTa = approvalNumberTa;
    }

    public Date getApprovalDateTa() {
        return approvalDateTa;
    }

    public void setApprovalDateTa(Date approvalDateTa) {
        this.approvalDateTa = approvalDateTa;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public String getApprovalProgress() {
        return approvalProgress;
    }

    public void setApprovalProgress(String approvalProgress) {
        this.approvalProgress = approvalProgress;
    }

    public String getConstructionContent() {
        return constructionContent;
    }

    public void setConstructionContent(String constructionContent) {
        this.constructionContent = constructionContent;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getConstructionPlace() {
        return constructionPlace;
    }

    public void setConstructionPlace(String constructionPlace) {
        this.constructionPlace = constructionPlace;
    }

    public String getConstructionCompany() {
        return constructionCompany;
    }

    public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getReleaseInvestment() {
        return releaseInvestment;
    }

    public void setReleaseInvestment(BigDecimal releaseInvestment) {
        this.releaseInvestment = releaseInvestment;
    }

    public String getConstructionPhase() {
        return constructionPhase;
    }

    public void setConstructionPhase(String constructionPhase) {
        this.constructionPhase = constructionPhase;
    }

    public String getFirstDesign() {
        return firstDesign;
    }

    public void setFirstDesign(String firstDesign) {
        this.firstDesign = firstDesign;
    }

    public String getBidding() {
        return bidding;
    }

    public void setBidding(String bidding) {
        this.bidding = bidding;
    }

    public String getConstructionDesign() {
        return constructionDesign;
    }

    public void setConstructionDesign(String constructionDesign) {
        this.constructionDesign = constructionDesign;
    }

    public String getStartTimeCon() {
        return startTimeCon;
    }

    public void setStartTimeCon(String startTimeCon) {
        this.startTimeCon = startTimeCon;
    }

    public String getProjectProgress() {
        return projectProgress;
    }

    public void setProjectProgress(String projectProgress) {
        this.projectProgress = projectProgress;
    }

    public BigDecimal getCompletedInvestment() {
        return completedInvestment;
    }

    public void setCompletedInvestment(BigDecimal completedInvestment) {
        this.completedInvestment = completedInvestment;
    }

    public String getFormedAbility() {
        return formedAbility;
    }

    public void setFormedAbility(String formedAbility) {
        this.formedAbility = formedAbility;
    }

    public String getDesignedAbility() {
        return designedAbility;
    }

    public void setDesignedAbility(String designedAbility) {
        this.designedAbility = designedAbility;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSubprojectId() {
        return subprojectId;
    }

    public void setSubprojectId(String subprojectId) {
        this.subprojectId = subprojectId;
    }

    public BigDecimal getIsimportent() {
        return isimportent;
    }

    public String getEndTimeCon() {
        return endTimeCon;
    }

    public void setEndTimeCon(String endTimeCon) {
        this.endTimeCon = endTimeCon;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
