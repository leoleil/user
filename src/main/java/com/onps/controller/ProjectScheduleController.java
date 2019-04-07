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
        return null;
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
