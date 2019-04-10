package com.onps.service;

import com.onps.model.vo.ProjectScheduleVO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ProjectScheduleExcelService {
    /**
     *
     * 通过选择的条件列表导出excel
     * @param projectScheduleVOList
     * @param response
     * @throws Exception
     */
    void makeProjectExcel(List<ProjectScheduleVO> projectScheduleVOList, HttpServletResponse response)throws Exception;

    /**
     * 导出全部存在的excel
     * @param response
     * @throws Exception
     */
    void makeProjectExcel(HttpServletResponse response)throws Exception;
}
