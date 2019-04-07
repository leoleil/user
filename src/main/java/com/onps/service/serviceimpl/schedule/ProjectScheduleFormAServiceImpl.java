package com.onps.service.serviceimpl.schedule;

import com.onps.dao.ProjectMapper;
import com.onps.model.Project;
import com.onps.model.ProjectExample;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleFormAService;
import com.onps.service.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectScheduleFormAServiceImpl implements ProjectScheduleFormAService {

    @Autowired
    private ProjectMapper projectMapper;
    @Override
    public void updataASchedule(ProjectScheduleVO projectScheduleVO) throws Exception {
        Project project=new Project();
        //从表A 中找出对应的project
        ProjectExample projectExp=new ProjectExample();
        ProjectExample.Criteria criteria1=projectExp.createCriteria();

        criteria1.
                andProjectnameEqualTo(projectScheduleVO.getProjectName())
                .andLevel1EqualTo(projectScheduleVO.getLevel1())
                .andLevel2EqualTo(projectScheduleVO.getLevel2())
                .andLevel3EqualTo(projectScheduleVO.getLevel3())
                .andLevel4EqualTo(projectScheduleVO.getLevel4())
                .andLevel5EqualTo(projectScheduleVO.getLevel5());

        if(projectScheduleVO.getProjectName() != null){
        project.setProjectname(projectScheduleVO.getProjectName());
        }
        if(projectScheduleVO.getDocumentName()!=null){
        project.setDocumentname(projectScheduleVO.getDocumentName());}
        if(projectScheduleVO.getDocumentNumber()!=null){
            project.setDocumentnumber(projectScheduleVO.getDocumentNumber());
        }
        if(projectScheduleVO.getDocumentDate()!=null) {
            project.setDocumentdate(projectScheduleVO.getDocumentDate());
        }
        if(projectScheduleVO.getInvestmentamount()!=null) {
            project.setInvestmentamount(projectScheduleVO.getInvestmentamount());
        }
        if(projectScheduleVO.getApprovalAuthority()!=null) {
            project.setApprovalauthority(projectScheduleVO.getApprovalAuthority());
        }
        if(projectScheduleVO.getConstructionPeriod()!=null){
            project.setConstructionperiod(projectScheduleVO.getConstructionPeriod());
        }
        if(projectScheduleVO.getIsIsimportent()!=null){
            project.setIsimportent(projectScheduleVO.getIsIsimportent());
        }
        if(projectScheduleVO.getLevel1()!=null){
            project.setLevel1(project.getLevel1());
        }
        if(projectScheduleVO.getLevel2()!=null){
            project.setLevel2(project.getLevel2());
        }
        if(projectScheduleVO.getLevel3()!=null){
            project.setLevel3(project.getLevel3());
        }
        if(projectScheduleVO.getLevel4()!=null){
            project.setLevel4(project.getLevel4());
        }
        if(projectScheduleVO.getLevel5()!=null){
            project.setLevel5(project.getLevel5());
        }
        if(projectScheduleVO.getSubmitCompany()!=null){
            project.setSubmitcompany(project.getSubmitcompany());
        }

        projectMapper.updateByExampleSelective(project,projectExp);


    }
}
