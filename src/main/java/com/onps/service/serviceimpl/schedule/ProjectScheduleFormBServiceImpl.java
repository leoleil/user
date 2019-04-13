package com.onps.service.serviceimpl.schedule;

import com.onps.dao.ProjectMapper;
import com.onps.dao.SubprojectMapper;
import com.onps.model.Project;
import com.onps.model.ProjectExample;
import com.onps.model.Subproject;
import com.onps.model.SubprojectExample;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleFormBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProjectScheduleFormBServiceImpl implements ProjectScheduleFormBService {
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private SubprojectMapper subprojectMapper;
    /**
     * 更新表B内容
     *
     * @param projectScheduleVO
     * @throws Exception 更新失败抛出异常
     */
    @Override
    public void updateBSchedule(ProjectScheduleVO projectScheduleVO) throws Exception {
        Subproject subproject=new Subproject();
        //从表B中找出对应的project
             //projectExample用来匹配五个level,和主项目名称，通过这几个字段得到对应的projectID
        ProjectExample projectExample=new ProjectExample();
        ProjectExample.Criteria criteria1=projectExample.createCriteria();
        criteria1. andProjectnameEqualTo(projectScheduleVO.getProjectName())
                .andLevel1EqualTo(projectScheduleVO.getLevel1())
                .andLevel3EqualTo(projectScheduleVO.getLevel3())
                .andLevel4EqualTo(projectScheduleVO.getLevel4())
                .andLevel5EqualTo(projectScheduleVO.getLevel5());
        //对Level2需要进行判空，如果不为空，再进行筛选
                if(projectScheduleVO.getLevel2() !=null && !projectScheduleVO.getLevel2().equals("")){
                    criteria1.andLevel2EqualTo(projectScheduleVO.getLevel2());
                }
        String projectId=projectMapper.selectByExample(projectExample).get(0).getId();
            //subprojectExample 通过projectID和subprojectName匹配子项目
        SubprojectExample subprojectExample=new SubprojectExample();
        SubprojectExample.Criteria criteria2=subprojectExample.createCriteria();
        criteria2.andSubnameEqualTo(projectScheduleVO.getSubName())
                 .andProjectidEqualTo(projectId);

        //对每个字段进行判空，把非空的字段进行update
        if(projectScheduleVO.getSubName() !=null){
        subproject.setSubname(projectScheduleVO.getSubName());}
        if(projectScheduleVO.getStartTime() !=null){
       subproject.setStarttime(projectScheduleVO.getStartTime());}
        if(projectScheduleVO.getSubmitFileName() !=null){
       subproject.setSubmitfilename(projectScheduleVO.getSubmitFileName());}
        if(projectScheduleVO.getSubmitDepartment() !=null){
       subproject.setSubmitdepartment(projectScheduleVO.getSubmitDepartment());}
        if(projectScheduleVO.getSubmitNumber() !=null){
       subproject.setSubmitnumber(projectScheduleVO.getSubmitNumber());}
        if(projectScheduleVO.getSubmitDate() !=null){
       subproject.setSubmitdate(projectScheduleVO.getSubmitDate());}
        if(projectScheduleVO.getApprovalName() !=null){
       subproject.setApprovalname(projectScheduleVO.getApprovalName());}
        if(projectScheduleVO.getApprovalDepartment() !=null){
       subproject.setApprovaldepartment(projectScheduleVO.getApprovalDepartment());}
        if(projectScheduleVO.getApprovalNumber() !=null){
       subproject.setApprovalnumber(projectScheduleVO.getApprovalNumber());}
        if(projectScheduleVO.getApprovalDate() !=null){
       subproject.setApprovaldate(projectScheduleVO.getApprovalDate());}
        if(projectScheduleVO.getSubmitFileNameTa() !=null){
       subproject.setSubmitfilenameTa(projectScheduleVO.getSubmitFileNameTa());}
        if(projectScheduleVO.getSubmitDepartmentTa() !=null){
       subproject.setSubmitdepartmentTa(projectScheduleVO.getSubmitDepartmentTa());}
        if(projectScheduleVO.getSubmitNumberTa() !=null){
       subproject.setSubmitnumberTa(projectScheduleVO.getSubmitNumberTa());}
        if(projectScheduleVO.getSubmitDateTa() !=null){
       subproject.setSubmitdateTa(projectScheduleVO.getSubmitDateTa());}
        if(projectScheduleVO.getApprovalNameTa() !=null){
       subproject.setApprovalnameTa(projectScheduleVO.getApprovalNameTa());}
        if(projectScheduleVO.getApprovalDepartmentTa() !=null){
       subproject.setApprovaldepartmentTa(projectScheduleVO.getApprovalDepartmentTa());}
        if(projectScheduleVO.getApprovalNumberTa() !=null){
       subproject.setApprovalnumberTa(projectScheduleVO.getApprovalNumberTa());}
        if(projectScheduleVO.getApprovalDateTa() !=null){
       subproject.setApprovaldateTa(projectScheduleVO.getApprovalDateTa());}
        if(projectScheduleVO.getReplyDate() !=null){
       subproject.setReplydate(projectScheduleVO.getReplyDate());}
        if(projectScheduleVO.getApprovalProgress() != null){
       subproject.setApprovalprogress(projectScheduleVO.getApprovalProgress());}
        if(projectScheduleVO.getConstructionContent() != null){
       subproject.setConstructioncontent(projectScheduleVO.getConstructionContent());}
        if(projectScheduleVO.getProjectNumber() != null){
       subproject.setProjectnumber(projectScheduleVO.getProjectNumber());}
        if(projectScheduleVO.getConstructionPlace() != null){
       subproject.setConstructionplace(projectScheduleVO.getConstructionPlace());}
        if(projectScheduleVO.getConstructionCompany() !=null){
       subproject.setConstructioncompany(projectScheduleVO.getConstructionCompany());}
        if(projectScheduleVO.getEndTime() != null){
       subproject.setEndtime(projectScheduleVO.getEndTime());}
        if(projectScheduleVO.getReleaseInvestment() !=null){
       subproject.setReleaseinvestment(projectScheduleVO.getReleaseInvestment());}
        if(projectScheduleVO.getConstructionPhase() !=null){
       subproject.setConstructionphase(projectScheduleVO.getConstructionPhase());}
        if(projectScheduleVO.getFirstDesign() !=null){
       subproject.setFirstdesign(projectScheduleVO.getFirstDesign());}
        if(projectScheduleVO.getBidding() !=null){
       subproject.setBidding(projectScheduleVO.getBidding());}
        if(projectScheduleVO.getConstructionDesign() !=null){
       subproject.setConstructiondesign(projectScheduleVO.getConstructionDesign());}
        if(projectScheduleVO.getStartTimeCon() !=null){
       subproject.setStarttimeCon(projectScheduleVO.getStartTimeCon());}
        if(projectScheduleVO.getProjectProgress()!=null){
       subproject.setProjectprogress(projectScheduleVO.getProjectProgress());}
        if(projectScheduleVO.getCompletedInvestment() !=null){
       subproject.setCompletedinvestment(projectScheduleVO.getCompletedInvestment());}
        if(projectScheduleVO.getFormedAbility()!=null){
       subproject.setFormedability(projectScheduleVO.getFormedAbility());}
        if(projectScheduleVO.getDesignedAbility() !=null){
       subproject.setDesignedability(projectScheduleVO.getDesignedAbility());}
        if(projectScheduleVO.getRemarks()!=null){
       subproject.setRemarks(projectScheduleVO.getRemarks());}
        if(projectScheduleVO.getProjectId() !=null){
       subproject.setProjectid(projectScheduleVO.getProjectId());}
        if(projectScheduleVO.getDepartment() !=null){
       subproject.setDepartment(projectScheduleVO.getDepartment());}
        subprojectMapper.updateByExampleSelective(subproject,subprojectExample);
    }

    /**
     * 删除表单B内容
     *
     * @param projectScheduleVO
     * @throws Exception 删除失败抛出异常
     */
    @Override
    public void deleteBSchedule(ProjectScheduleVO projectScheduleVO) throws Exception {
            Subproject subproject=new Subproject();
            Project project=new Project();
            ProjectExample projectExample=new ProjectExample();
            ProjectExample.Criteria criteria=projectExample.createCriteria();
            SubprojectExample subprojectExample=new SubprojectExample();
            SubprojectExample.Criteria subCriteria=subprojectExample.createCriteria();
            //通过几个条件拿到projectID，查出对应的子项目列表
            criteria.andProjectnameEqualTo(projectScheduleVO.getProjectName())
                    .andLevel1EqualTo(projectScheduleVO.getLevel1())
                    .andLevel3EqualTo(projectScheduleVO.getLevel3())
                    .andLevel4EqualTo(projectScheduleVO.getLevel4())
                    .andLevel5EqualTo(projectScheduleVO.getLevel5());
            if(projectScheduleVO.getLevel2() !=null){
                criteria.andLevel2EqualTo(projectScheduleVO.getLevel2()); }
            String projectId=projectMapper.selectByExample(projectExample).get(0).getId();
            //通过project ID和子项目名称唯一确定子项目，并取得子项目的主键
             subCriteria.andSubnameEqualTo(projectScheduleVO.getSubName())
                     .andProjectidEqualTo(projectId);
             String subId=subprojectMapper.selectByExample(subprojectExample).get(0).getId();
             //通过主键进行delete
             subprojectMapper.deleteByPrimaryKey(subId);


    }
}
