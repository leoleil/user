package com.onps.service;

import com.onps.model.vo.ProjectScheduleVO;

public interface ProjectScheduleFormAService {
    /**
     * 更新表A内容
     * @param projectScheduleVO
     * @throws Exception 更新失败抛出异常
     */
    void updataASchedule(ProjectScheduleVO projectScheduleVO) throws Exception;

    /**
     * 删除表单A内容
     * @param projectScheduleVO
     * @throws Exception
     */
    void deleteASchedule(ProjectScheduleVO projectScheduleVO) throws Exception;
}
