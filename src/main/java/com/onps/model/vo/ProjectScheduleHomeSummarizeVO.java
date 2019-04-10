package com.onps.model.vo;

import java.util.List;

public class ProjectScheduleHomeSummarizeVO {
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

    private List<ProjectScheduleSummarizeVO> projectScheduleSummarizeList;//总体汇总各个单项数据


}
