package com.onps.controller;


import com.onps.model.Project;
import com.onps.model.User;
import com.onps.model.vo.ProjectScheduleSummarizeVO;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.utils.resultUtils.BaseResult;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/schedule")
public class ProjectScheduleController {

    @RequestMapping("/submitProjectSchedule")
    @ResponseBody
    public BaseResult<ProjectScheduleVO> submitProjectSchedule(ProjectScheduleVO projectScheduleVO){
        return null;
    }
    @RequestMapping("/getProjectSchedule")
    @ResponseBody
    public BaseResult<ProjectScheduleVO> getProjectScheduleList(){
        return null;
    }

    public BaseResult<ProjectScheduleSummarizeVO> getProjectScheduleSummarize(String projectName, String level1,
                                                                              String level2, String level3,
                                                                              String level4, String level5){
        return null;

    }

}
