package com.onps.service.serviceimpl.schedule;

import com.onps.controller.UserManageController;
import com.onps.dao.ProjectMapper;
import com.onps.dao.SubprojectMapper;
import com.onps.model.Project;
import com.onps.model.Subproject;
import com.onps.model.User;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleService;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectScheduleServiceImpl implements ProjectScheduleService {
    private static Logger logger = LoggerFactory.getLogger(UserManageController.class);//日志
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private SubprojectMapper subprojectMapper;
    /**
     * 提交项目计划
     *
     * @param projectScheduleVO
     * @throws Exception 提交失败抛出异常
     */
    @Override
    public void submitProjectSchedule(ProjectScheduleVO projectScheduleVO) throws Exception {
        //获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        Project project = new Project();//表A
        Subproject subproject = new Subproject();//表B
        project.setProjectname(projectScheduleVO.getProjectName());
        project.setDocumentdate(projectScheduleVO.getDocumentDate());

    }
}
