package com.onps.service.serviceimpl.schedule;

import com.onps.controller.UserManageController;
import com.onps.dao.ProjectMapper;
import com.onps.dao.SubprojectMapper;
import com.onps.model.*;
import com.onps.model.vo.ProjectScheduleSummarizeVO;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleService;
import com.onps.service.UserSessionService;
import com.onps.utils.RoleString;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProjectScheduleServiceImpl implements ProjectScheduleService {
    private static Logger logger = LoggerFactory.getLogger(UserManageController.class);//日志
    @Resource
    private UserSessionService userSessionService;
    @Resource
    private ProjectMapper projectMapper;
    @Resource
    private SubprojectMapper subprojectMapper;
    /**
     * 提交项目计划
     * 一次性全部提交方式
     * @param projectScheduleVO
     * @throws Exception 提交失败抛出异常
     */
    @Override
    public void submitProjectSchedule(ProjectScheduleVO projectScheduleVO) throws Exception {
        //获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        Project project = new Project();//表A
        Subproject subproject = new Subproject();//表B

        //先查询表A 寻找是否有父项目
        ProjectExample projectExample = new ProjectExample();
        projectExample.createCriteria()
                .andProjectnameEqualTo(projectScheduleVO.getProjectName())
                .andLevel1EqualTo(projectScheduleVO.getLevel1())
                .andLevel2EqualTo(projectScheduleVO.getLevel2())
                .andLevel3EqualTo(projectScheduleVO.getLevel3())
                .andLevel4EqualTo(projectScheduleVO.getLevel4())
                .andLevel5EqualTo(projectScheduleVO.getLevel5());
        List<Project> projectList = projectMapper.selectByExample(projectExample);
        //如果不是相同的父项目创建一个父项目
        if(projectList.size() == 0){
            project.setProjectname(projectScheduleVO.getProjectName());
            project.setDocumentname(projectScheduleVO.getDocumentName());
            project.setDocumentnumber(projectScheduleVO.getDocumentNumber());
            project.setDocumentdate(projectScheduleVO.getDocumentDate());
            project.setInvestmentamount(projectScheduleVO.getInvestmentamount());
            project.setApprovalauthority(projectScheduleVO.getApprovalAuthority());
            project.setConstructionperiod(projectScheduleVO.getConstructionPeriod());
            project.setIsimportent(projectScheduleVO.getIsIsimportent());
            project.setLevel1(projectScheduleVO.getLevel1());
            project.setLevel2(projectScheduleVO.getLevel2());
            project.setLevel3(projectScheduleVO.getLevel3());
            project.setLevel4(projectScheduleVO.getLevel4());
            project.setLevel5(projectScheduleVO.getLevel5());
            project.setUserid(user.getUserId());
            projectMapper.insertSelective(project);
            //获取到各个创建的父项目
            projectList = projectMapper.selectByExample(projectExample);
        }
        //如果子项目的名字为空或者没有则不对子项目进行创建
        if(projectScheduleVO.getSubName() != null && !projectScheduleVO.getSubName().equals("")){
            if(projectList.size() != 0 ){
                subproject.setProjectid(projectList.get(0).getId());
                subproject.setSubname(projectScheduleVO.getSubName());
                subproject.setStarttime(projectScheduleVO.getStartTime());
                subproject.setSubmitfilename(projectScheduleVO.getSubmitFileName());
                subproject.setSubmitdepartment(projectScheduleVO.getSubmitDepartment());
                subproject.setSubmitnumber(projectScheduleVO.getSubmitNumber());
                subproject.setSubmitdate(projectScheduleVO.getSubmitDate());
                subproject.setApprovalname(projectScheduleVO.getApprovalName());
                subproject.setApprovaldepartment(projectScheduleVO.getApprovalDepartment());
                subproject.setApprovalnumber(projectScheduleVO.getApprovalNumber());
                subproject.setApprovaldate(projectScheduleVO.getApprovalDate());
                subproject.setSubmitfilenameTa(projectScheduleVO.getSubmitFileNameTa());
                subproject.setSubmitdepartmentTa(projectScheduleVO.getSubmitDepartmentTa());
                subproject.setSubmitnumberTa(projectScheduleVO.getSubmitNumberTa());
                subproject.setSubmitdateTa(projectScheduleVO.getSubmitDateTa());
                subproject.setApprovaldateTa(projectScheduleVO.getApprovalDateTa());
                subproject.setApprovaldepartmentTa(projectScheduleVO.getApprovalDepartmentTa());
                subproject.setApprovalnumberTa(projectScheduleVO.getApprovalNumberTa());
                subproject.setApprovaldateTa(projectScheduleVO.getApprovalDateTa());
                subproject.setReplydate(projectScheduleVO.getReplyDate());
                subproject.setApprovalprogress(projectScheduleVO.getApprovalProgress());
                subproject.setConstructioncontent(projectScheduleVO.getConstructionContent());
                subproject.setProjectnumber(projectScheduleVO.getProjectNumber());
                subproject.setConstructionplace(projectScheduleVO.getConstructionPlace());
                subproject.setConstructioncompany(projectScheduleVO.getConstructionCompany());
                subproject.setEndtime(projectScheduleVO.getEndTime());
                subproject.setReleaseinvestment(projectScheduleVO.getReleaseInvestment());
                subproject.setConstructionphase(projectScheduleVO.getConstructionPhase());
                subproject.setFirstdesign(projectScheduleVO.getFirstDesign());
                subproject.setBidding(projectScheduleVO.getBidding());
                subproject.setConstructiondesign(projectScheduleVO.getConstructionDesign());
                subproject.setStarttimeCon(projectScheduleVO.getStartTimeCon());
                subproject.setProjectprogress(projectScheduleVO.getProjectProgress());
                subproject.setCompletedinvestment(projectScheduleVO.getCompletedInvestment());
                subproject.setFormedability(projectScheduleVO.getFormedAbility());
                subproject.setDesignedability(projectScheduleVO.getDesignedAbility());
                subproject.setRemarks(projectScheduleVO.getRemarks());
                subproject.setDepartment(projectScheduleVO.getDepartment());
                subproject.setUserid(user.getUserId());
                subprojectMapper.insertSelective(subproject);
            }
            else {
                throw new Exception("ProjectScheduleService：创建B表出错");
            }
        }
    }

    /**
     * 获取项目数据
     *
     * @return 返回项目数据的列表
     */
    @Override
    public List<ProjectScheduleVO> getProjectScheduleList() {
        //获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        List<ProjectScheduleVO> projectScheduleVOList = new ArrayList<>();
        if(userSessionService.isRole(RoleString.USER_1)){
            //一级用户返回全部项目
            ProjectExample projectExample = new ProjectExample();
            projectExample.createCriteria()
                    .andIdIsNotNull();
            List<Project> projectList = projectMapper.selectByExample(projectExample);
            for (Project project:projectList
            ) {
                SubprojectExample subprojectExample = new SubprojectExample();
                subprojectExample.createCriteria()
                        .andProjectidEqualTo(project.getId());
                List<Subproject> subprojectList = subprojectMapper.selectByExample(subprojectExample);
                for (Subproject subproject:subprojectList
                ) {
                    //获取表A内容
                    ProjectScheduleVO projectScheduleVO = new ProjectScheduleVO();
                    projectScheduleVO.setProjectName((String) project.getProjectname());
                    projectScheduleVO.setDocumentName((String) project.getDocumentname());
                    projectScheduleVO.setDocumentNumber((String) project.getDocumentname());
                    projectScheduleVO.setDocumentDate((Date) project.getDocumentdate());
                    projectScheduleVO.setInvestmentamount(project.getInvestmentamount());
                    projectScheduleVO.setApprovalAuthority((String) project.getApprovalauthority());
                    projectScheduleVO.setConstructionPeriod((String) project.getConstructionperiod());
                    projectScheduleVO.setIsimportent(project.getIsimportent());
                    projectScheduleVO.setLevel1((String) project.getLevel1());
                    projectScheduleVO.setLevel2((String) project.getLevel2());
                    projectScheduleVO.setLevel3((String) project.getLevel3());
                    projectScheduleVO.setLevel4((String) project.getLevel4());
                    projectScheduleVO.setLevel5((String) project.getLevel5());
                    projectScheduleVO.setTimestamp((Date) project.getTimestamp());
                    //获取表内容
                    projectScheduleVO.setSubName((String) subproject.getSubname());
                    projectScheduleVO.setStartTime(subproject.getStarttime());
                    projectScheduleVO.setSubmitFileName((String)subproject.getSubmitfilename());
                    projectScheduleVO.setSubmitDepartment((String)subproject.getSubmitdepartment());
                    projectScheduleVO.setSubmitNumber((String)subproject.getSubmitnumber());
                    projectScheduleVO.setSubmitDate(subproject.getSubmitdate());
                    projectScheduleVO.setApprovalName((String)subproject.getApprovalname());
                    projectScheduleVO.setApprovalDepartment((String) subproject.getApprovaldepartment());
                    projectScheduleVO.setApprovalNumber((String)subproject.getApprovalnumber());
                    projectScheduleVO.setApprovalDate(subproject.getApprovaldate());
                    projectScheduleVO.setSubmitFileNameTa((String)subproject.getSubmitfilenameTa());
                    projectScheduleVO.setSubmitDepartmentTa((String)subproject.getSubmitdepartmentTa());
                    projectScheduleVO.setSubmitNumberTa((String)subproject.getSubmitnumberTa());
                    projectScheduleVO.setSubmitDate(subproject.getSubmitdate());
                    projectScheduleVO.setApprovalNameTa((String)subproject.getApprovalnameTa());
                    projectScheduleVO.setApprovalDepartmentTa((String)subproject.getApprovaldepartmentTa());
                    projectScheduleVO.setApprovalNameTa((String)subproject.getApprovalnumberTa());
                    projectScheduleVO.setApprovalDateTa(subproject.getApprovaldateTa());
                    projectScheduleVO.setReplyDate(subproject.getReplydate());
                    projectScheduleVO.setApprovalProgress((String)subproject.getApprovalprogress());
                    projectScheduleVO.setConstructionContent((String)subproject.getConstructioncontent());
                    projectScheduleVO.setProjectNumber((String)subproject.getProjectnumber());
                    projectScheduleVO.setConstructionPlace((String)subproject.getConstructionplace());
                    projectScheduleVO.setConstructionCompany((String)subproject.getConstructioncompany());
                    projectScheduleVO.setEndTime(subproject.getEndtime());
                    projectScheduleVO.setReleaseInvestment(subproject.getReleaseinvestment());
                    projectScheduleVO.setConstructionPhase((String)subproject.getConstructionphase());
                    projectScheduleVO.setFirstDesign((String)subproject.getFirstdesign());
                    projectScheduleVO.setBidding((String)subproject.getBidding());
                    projectScheduleVO.setConstructionDesign((String)subproject.getConstructiondesign());
                    projectScheduleVO.setStartTimeCon((String)subproject.getStarttimeCon());
                    projectScheduleVO.setProjectProgress((String)subproject.getProjectprogress());
                    projectScheduleVO.setCompletedInvestment(subproject.getCompletedinvestment());
                    projectScheduleVO.setFormedAbility((String)subproject.getFormedability());
                    projectScheduleVO.setDesignedAbility((String)subproject.getDesignedability());
                    projectScheduleVO.setRemarks((String)subproject.getRemarks());
                    projectScheduleVO.setTimestamp(subproject.getTimestamp());
                    //累死我啦
                    //那么多项
                    //->_->??
                    projectScheduleVOList.add(projectScheduleVO);
                }
            }
            return projectScheduleVOList;

        }
        else if(userSessionService.isRole(RoleString.USER_2)){
            //二级用户返回所在战区的内容
            ProjectExample projectExample = new ProjectExample();
            projectExample.or()
                    .andLevel1EqualTo(user.getZQ());
            List<Project> projectList = projectMapper.selectByExample(projectExample);
            for (Project project:projectList
            ) {
                SubprojectExample subprojectExample = new SubprojectExample();
                subprojectExample.or().andProjectidEqualTo(project.getId());
                List<Subproject> subprojectList = subprojectMapper.selectByExample(subprojectExample);
                for (Subproject subproject:subprojectList
                ) {
                    //获取表A内容
                    ProjectScheduleVO projectScheduleVO = new ProjectScheduleVO();
                    projectScheduleVO.setProjectName((String) project.getProjectname());
                    projectScheduleVO.setDocumentName((String) project.getDocumentname());
                    projectScheduleVO.setDocumentNumber((String) project.getDocumentname());
                    projectScheduleVO.setDocumentDate((Date) project.getDocumentdate());
                    projectScheduleVO.setInvestmentamount(project.getInvestmentamount());
                    projectScheduleVO.setApprovalAuthority((String) project.getApprovalauthority());
                    projectScheduleVO.setConstructionPeriod((String) project.getConstructionperiod());
                    projectScheduleVO.setIsimportent(project.getIsimportent());
                    projectScheduleVO.setLevel1((String) project.getLevel1());
                    projectScheduleVO.setLevel2((String) project.getLevel2());
                    projectScheduleVO.setLevel3((String) project.getLevel3());
                    projectScheduleVO.setLevel4((String) project.getLevel4());
                    projectScheduleVO.setLevel5((String) project.getLevel5());
                    projectScheduleVO.setTimestamp((Date) project.getTimestamp());
                    //获取表内容
                    projectScheduleVO.setSubName((String) subproject.getSubname());
                    projectScheduleVO.setStartTime(subproject.getStarttime());
                    projectScheduleVO.setSubmitFileName((String)subproject.getSubmitfilename());
                    projectScheduleVO.setSubmitDepartment((String)subproject.getSubmitdepartment());
                    projectScheduleVO.setSubmitNumber((String)subproject.getSubmitnumber());
                    projectScheduleVO.setSubmitDate(subproject.getSubmitdate());
                    projectScheduleVO.setApprovalName((String)subproject.getApprovalname());
                    projectScheduleVO.setApprovalDepartment((String) subproject.getApprovaldepartment());
                    projectScheduleVO.setApprovalNumber((String)subproject.getApprovalnumber());
                    projectScheduleVO.setApprovalDate(subproject.getApprovaldate());
                    projectScheduleVO.setSubmitFileNameTa((String)subproject.getSubmitfilenameTa());
                    projectScheduleVO.setSubmitDepartmentTa((String)subproject.getSubmitdepartmentTa());
                    projectScheduleVO.setSubmitNumberTa((String)subproject.getSubmitnumberTa());
                    projectScheduleVO.setSubmitDate(subproject.getSubmitdate());
                    projectScheduleVO.setApprovalNameTa((String)subproject.getApprovalnameTa());
                    projectScheduleVO.setApprovalDepartmentTa((String)subproject.getApprovaldepartmentTa());
                    projectScheduleVO.setApprovalNameTa((String)subproject.getApprovalnumberTa());
                    projectScheduleVO.setApprovalDateTa(subproject.getApprovaldateTa());
                    projectScheduleVO.setReplyDate(subproject.getReplydate());
                    projectScheduleVO.setApprovalProgress((String)subproject.getApprovalprogress());
                    projectScheduleVO.setConstructionContent((String)subproject.getConstructioncontent());
                    projectScheduleVO.setProjectNumber((String)subproject.getProjectnumber());
                    projectScheduleVO.setConstructionPlace((String)subproject.getConstructionplace());
                    projectScheduleVO.setConstructionCompany((String)subproject.getConstructioncompany());
                    projectScheduleVO.setEndTime(subproject.getEndtime());
                    projectScheduleVO.setReleaseInvestment(subproject.getReleaseinvestment());
                    projectScheduleVO.setConstructionPhase((String)subproject.getConstructionphase());
                    projectScheduleVO.setFirstDesign((String)subproject.getFirstdesign());
                    projectScheduleVO.setBidding((String)subproject.getBidding());
                    projectScheduleVO.setConstructionDesign((String)subproject.getConstructiondesign());
                    projectScheduleVO.setStartTimeCon((String)subproject.getStarttimeCon());
                    projectScheduleVO.setProjectProgress((String)subproject.getProjectprogress());
                    projectScheduleVO.setCompletedInvestment(subproject.getCompletedinvestment());
                    projectScheduleVO.setFormedAbility((String)subproject.getFormedability());
                    projectScheduleVO.setDesignedAbility((String)subproject.getDesignedability());
                    projectScheduleVO.setRemarks((String)subproject.getRemarks());
                    projectScheduleVO.setTimestamp(subproject.getTimestamp());
                    //累死我啦
                    //那么多项
                    //->_->??
                    projectScheduleVOList.add(projectScheduleVO);
                }
            }
            return projectScheduleVOList;

        }
        else {
            //普通用户返回自己的项目
            ProjectExample projectExample = new ProjectExample();
            List<Project> projectList = projectMapper.selectByExample(projectExample);
            for (Project project:projectList
            ) {
                SubprojectExample subprojectExample = new SubprojectExample();
                subprojectExample.or()
                        .andProjectidEqualTo(project.getId())
                        .andUseridEqualTo(user.getUserId());
                List<Subproject> subprojectList = subprojectMapper.selectByExample(subprojectExample);
                for (Subproject subproject:subprojectList
                ) {
                    //获取表A内容
                    ProjectScheduleVO projectScheduleVO = new ProjectScheduleVO();
                    projectScheduleVO.setProjectName((String) project.getProjectname());
                    projectScheduleVO.setDocumentName((String) project.getDocumentname());
                    projectScheduleVO.setDocumentNumber((String) project.getDocumentname());
                    projectScheduleVO.setDocumentDate((Date) project.getDocumentdate());
                    projectScheduleVO.setInvestmentamount(project.getInvestmentamount());
                    projectScheduleVO.setApprovalAuthority((String) project.getApprovalauthority());
                    projectScheduleVO.setConstructionPeriod((String) project.getConstructionperiod());
                    projectScheduleVO.setIsimportent(project.getIsimportent());
                    projectScheduleVO.setLevel1((String) project.getLevel1());
                    projectScheduleVO.setLevel2((String) project.getLevel2());
                    projectScheduleVO.setLevel3((String) project.getLevel3());
                    projectScheduleVO.setLevel4((String) project.getLevel4());
                    projectScheduleVO.setLevel5((String) project.getLevel5());
                    projectScheduleVO.setTimestamp((Date) project.getTimestamp());
                    //获取表内容
                    projectScheduleVO.setSubName((String) subproject.getSubname());
                    projectScheduleVO.setStartTime(subproject.getStarttime());
                    projectScheduleVO.setSubmitFileName((String)subproject.getSubmitfilename());
                    projectScheduleVO.setSubmitDepartment((String)subproject.getSubmitdepartment());
                    projectScheduleVO.setSubmitNumber((String)subproject.getSubmitnumber());
                    projectScheduleVO.setSubmitDate(subproject.getSubmitdate());
                    projectScheduleVO.setApprovalName((String)subproject.getApprovalname());
                    projectScheduleVO.setApprovalDepartment((String) subproject.getApprovaldepartment());
                    projectScheduleVO.setApprovalNumber((String)subproject.getApprovalnumber());
                    projectScheduleVO.setApprovalDate(subproject.getApprovaldate());
                    projectScheduleVO.setSubmitFileNameTa((String)subproject.getSubmitfilenameTa());
                    projectScheduleVO.setSubmitDepartmentTa((String)subproject.getSubmitdepartmentTa());
                    projectScheduleVO.setSubmitNumberTa((String)subproject.getSubmitnumberTa());
                    projectScheduleVO.setSubmitDate(subproject.getSubmitdate());
                    projectScheduleVO.setApprovalNameTa((String)subproject.getApprovalnameTa());
                    projectScheduleVO.setApprovalDepartmentTa((String)subproject.getApprovaldepartmentTa());
                    projectScheduleVO.setApprovalNameTa((String)subproject.getApprovalnumberTa());
                    projectScheduleVO.setApprovalDateTa(subproject.getApprovaldateTa());
                    projectScheduleVO.setReplyDate(subproject.getReplydate());
                    projectScheduleVO.setApprovalProgress((String)subproject.getApprovalprogress());
                    projectScheduleVO.setConstructionContent((String)subproject.getConstructioncontent());
                    projectScheduleVO.setProjectNumber((String)subproject.getProjectnumber());
                    projectScheduleVO.setConstructionPlace((String)subproject.getConstructionplace());
                    projectScheduleVO.setConstructionCompany((String)subproject.getConstructioncompany());
                    projectScheduleVO.setEndTime(subproject.getEndtime());
                    projectScheduleVO.setReleaseInvestment(subproject.getReleaseinvestment());
                    projectScheduleVO.setConstructionPhase((String)subproject.getConstructionphase());
                    projectScheduleVO.setFirstDesign((String)subproject.getFirstdesign());
                    projectScheduleVO.setBidding((String)subproject.getBidding());
                    projectScheduleVO.setConstructionDesign((String)subproject.getConstructiondesign());
                    projectScheduleVO.setStartTimeCon((String)subproject.getStarttimeCon());
                    projectScheduleVO.setProjectProgress((String)subproject.getProjectprogress());
                    projectScheduleVO.setCompletedInvestment(subproject.getCompletedinvestment());
                    projectScheduleVO.setFormedAbility((String)subproject.getFormedability());
                    projectScheduleVO.setDesignedAbility((String)subproject.getDesignedability());
                    projectScheduleVO.setRemarks((String)subproject.getRemarks());
                    projectScheduleVO.setTimestamp(subproject.getTimestamp());
                    //累死我啦
                    //那么多项
                    //->_->??
                    projectScheduleVOList.add(projectScheduleVO);
                }
            }
            return projectScheduleVOList;
        }

    }

    /**
     * 分层次获取项目的汇总信息
     *
     * @param projectName 项目名字
     * @param level1      战略方向
     * @param level2      方向附属信息
     * @param level3      建设计划
     * @param level4      建设计划附属信息
     * @param level5      附加备注
     * @return
     */
    @Override
    public List<ProjectScheduleSummarizeVO> getProjectScheduleSummarize(String projectName, String level1,
                                                                        String level2, String level3,
                                                                        String level4, String level5) {

        return null;
    }
}
