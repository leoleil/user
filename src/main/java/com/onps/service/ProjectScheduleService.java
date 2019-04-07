package com.onps.service;

import com.onps.model.Project;
import com.onps.model.vo.ProjectScheduleSummarizeVO;
import com.onps.model.vo.ProjectScheduleVO;

import java.util.List;

public interface ProjectScheduleService {
    /**
     * 提交项目计划
     * @param projectScheduleVO
     * @throws Exception 提交失败抛出异常
     */
    void submitProjectSchedule(ProjectScheduleVO projectScheduleVO) throws Exception;

    /**
     * 获取项目数据
     * @return 返回项目数据的列表
     */
    List<ProjectScheduleVO> getProjectScheduleList();

    /**
     * 分层次获取项目的汇总信息
     * @param projectName 项目名字
     * @param level1 战略方向
     * @param level2 方向附属信息
     * @param level3 建设计划
     * @param level4 建设计划附属信息
     * @param level5 附加备注
     * @return
     */
    List<ProjectScheduleSummarizeVO> getProjectScheduleSummarize(String projectName, String level1,
                                                                 String level2, String level3,
                                                                 String level4, String level5);

}
