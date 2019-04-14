package com.onps.controller;


import com.onps.model.Project;
import com.onps.model.User;
import com.onps.model.vo.ProjectScheduleSummarizeVO;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleExcelService;
import com.onps.service.ProjectScheduleService;
import com.onps.utils.ConstantString;
import com.onps.utils.resultUtils.BaseResult;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequestMapping("/schedule")
public class ProjectScheduleController {
    @Resource
    ProjectScheduleService projectScheduleService;

    @Resource
    ProjectScheduleExcelService projectScheduleExcelService;

    @RequestMapping("/submitProjectSchedule")
    @ResponseBody
    public BaseResult<ProjectScheduleVO> submitProjectSchedule(ProjectScheduleVO projectScheduleVO){
        System.out.println("进入submitProjectSchedule");
        BaseResult<ProjectScheduleVO> info = new BaseResult<ProjectScheduleVO>();
        //对进入的变量进行判断
        if(projectScheduleVO.getLevel1() == null || projectScheduleVO.getLevel1().equals("")||
                projectScheduleVO.getLevel2() == null || projectScheduleVO.getLevel2().equals("")||
                projectScheduleVO.getLevel3() == null || projectScheduleVO.getLevel3().equals("")||
                projectScheduleVO.getLevel4() == null || projectScheduleVO.getLevel4().equals("")||
                projectScheduleVO.getLevel5() == null || projectScheduleVO.getLevel5().equals("")||
                projectScheduleVO.getProjectName() == null || projectScheduleVO.getProjectName().equals("")

        ){
            info.setStatus(ConstantString.STATUS_FAIL);
            info.setMessage("提交参数有误");
            return info;
        }
        try {
            projectScheduleService.submitProjectSchedule(projectScheduleVO);
            info.setEntity(projectScheduleVO);
            info.setStatus(ConstantString.STATUS_SUCCESS);
            info.setMessage("提交成功");
        } catch (Exception e) {
            e.printStackTrace();
            info.setStatus(ConstantString.STATUS_FAIL);
            info.setMessage("提交失败");
        }
        return info;
    }
    @RequestMapping("/getProjectSchedule")
    @ResponseBody
    public BaseResult<ProjectScheduleVO> getProjectScheduleList(){
        BaseResult<ProjectScheduleVO> info = new BaseResult<ProjectScheduleVO>();
        List<ProjectScheduleVO> projectScheduleVOList = projectScheduleService.getProjectScheduleList();
        info.setList(projectScheduleVOList);
        info.setStatus(ConstantString.STATUS_SUCCESS);
        info.setMessage("项目规划详细信息数据");
        return info;
    }

    @RequestMapping("/getProjectScheduleSummarize")
    @ResponseBody
    public BaseResult<ProjectScheduleSummarizeVO> getProjectScheduleSummarize(String projectName, String level1,
                                                                              String level2, String level3,
                                                                              String level4, String level5){
        if(projectName.equals(""))projectName = null;
        if(level1.equals(""))level1 = null;
        if(level2.equals(""))level2 = null;
        if(level3.equals(""))level3 = null;
        if(level4.equals(""))level4 = null;
        if(level5.equals(""))level5 = null;
        BaseResult<ProjectScheduleSummarizeVO> info = new BaseResult<ProjectScheduleSummarizeVO>();
        ProjectScheduleSummarizeVO projectScheduleSummarizeVO = projectScheduleService.getProjectScheduleSummarize(projectName
                ,level1,level2,level3,level4,level5);
        if(projectScheduleSummarizeVO == null){
            info.setMessage("选择的关系没有数据");
            info.setStatus(ConstantString.STATUS_FAIL);
        }else {
            info.setStatus(ConstantString.STATUS_SUCCESS);
            info.setEntity(projectScheduleSummarizeVO);
            info.setMessage("获取成功");
        }
        return info;
    }
    @RequestMapping("/excel")
    public void excelOut(HttpServletResponse response){
        try {
            projectScheduleExcelService.makeProjectExcel(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
