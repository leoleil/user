package com.onps.service;

import com.onps.model.vo.ProjectScheduleVO;

public interface ProjectScheduleFormCService {
    /**
     * 更新表C内容
     * @param projectScheduleVO
     * @throws Exception 更新失败抛出异常
     */
    void updateBSchedule(ProjectScheduleVO projectScheduleVO) throws Exception;

    /**
     * 删除表C内容
     * @param projectScheduleVO
     * @throws Exception 删除失败抛出异常
     */
    void deleteBSchedule(ProjectScheduleVO projectScheduleVO) throws Exception;
}
