package com.onps.service;

import com.onps.model.Project;
import com.onps.model.vo.ProjectScheduleVO;

public interface ProjectScheduleService {
    /**
     * 提交项目计划
     * @param projectScheduleVO
     * @throws Exception 提交失败抛出异常
     */
    void submitProjectSchedule(ProjectScheduleVO projectScheduleVO) throws Exception;

}
