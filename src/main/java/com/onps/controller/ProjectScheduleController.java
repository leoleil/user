package com.onps.controller;


import com.onps.model.Project;
import com.onps.model.User;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.utils.resultUtils.BaseResult;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.shiro.subject.Subject;

import java.util.List;


@Controller
@RequestMapping("/schedule")
public class ProjectScheduleController {

    public void getProjectScheduleList(){
        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();//获取登录用户信息

    }
    @RequestMapping("/submitProjectSchedule")
    public BaseResult<ProjectScheduleVO> submitProjectSchedule(ProjectScheduleVO projectScheduleVO){

    }

}
