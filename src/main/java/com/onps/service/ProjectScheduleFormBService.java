package com.onps.service;

import com.onps.model.vo.ProjectScheduleVO;

public interface ProjectScheduleFormBService {
    /**
     * 更新表B内容
     * @param projectScheduleVO
     * @throws Exception 更新失败抛出异常
     */
    void updateBSchedule(ProjectScheduleVO projectScheduleVO) throws Exception;

    /**
     * 删除表单B内容
     * @param projectScheduleVO
     * @throws Exception 更新失败抛出异常
     */
    void deleteBSchedule(ProjectScheduleVO projectScheduleVO) throws Exception;
}
