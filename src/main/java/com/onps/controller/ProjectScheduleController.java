package com.onps.controller;


import com.onps.model.Project;
import com.onps.model.User;
import com.onps.model.vo.ProjectScheduleSummarizeVO;
import com.onps.model.vo.ProjectScheduleVO;
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
import java.util.List;


@Controller
@RequestMapping("/schedule")
public class ProjectScheduleController {
    @Resource
    ProjectScheduleService projectScheduleService;

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
        info.setList(projectScheduleService.getProjectScheduleList());
        info.setStatus(ConstantString.STATUS_SUCCESS);
        info.setMessage("项目规划详细信息数据");
        return info;
    }

    public BaseResult<ProjectScheduleSummarizeVO> getProjectScheduleSummarize(String projectName, String level1,
                                                                              String level2, String level3,
                                                                              String level4, String level5){
        return null;

    }

}
