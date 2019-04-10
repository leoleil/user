package com.onps.model.vo;

public class ProjectScheduleSummarizeVO {
    private String projectName;//项目名

    private String level1;//五个地理位置

    private String level2;//二级地理位置

    private String level3;//建设计划

    private String level4;//十几五建设计划

    private String level5;//军区军兵种后勤

    private int subProjectNumber;//子项目数量

    private int startWorkingNumber;//开工数量

    private double starWorkingRatio;//开工率

    private double progress;//总体进度

    private int finishWorkingNumber;//完工数量

    private double finishWorkingRatio;//完工率

    private int approvalProgressNumber;//审批进展


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public int getSubProjectNumber() {
        return subProjectNumber;
    }

    public void setSubProjectNumber(int subProjectNumber) {
        this.subProjectNumber = subProjectNumber;
    }

    public int getStartWorkingNumber() {
        return startWorkingNumber;
    }

    public void setStartWorkingNumber(int startWorkingNumber) {
        this.startWorkingNumber = startWorkingNumber;
    }

    public double getStarWorkingRatio() {
        return starWorkingRatio;
    }

    public void setStarWorkingRatio(double starWorkingRatio) {
        this.starWorkingRatio = starWorkingRatio;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public int getFinishWorkingNumber() {
        return finishWorkingNumber;
    }

    public void setFinishWorkingNumber(int finishWorkingNumber) {
        this.finishWorkingNumber = finishWorkingNumber;
    }

    public double getFinishWorkingRatio() {
        return finishWorkingRatio;
    }

    public void setFinishWorkingRatio(double finishWorkingRatio) {
        this.finishWorkingRatio = finishWorkingRatio;
    }

    public void setApprovalProgressNumber(int approvalProgressNumber) {
        this.approvalProgressNumber = approvalProgressNumber;
    }

    public int getApprovalProgressNumber() {
        return approvalProgressNumber;
    }
}
