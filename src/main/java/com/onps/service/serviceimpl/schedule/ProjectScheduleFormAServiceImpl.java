package com.onps.service.serviceimpl.schedule;

import com.onps.dao.ProjectMapper;
import com.onps.model.Project;
import com.onps.model.ProjectExample;
import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleFormAService;
import com.onps.service.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@Service
public class ProjectScheduleFormAServiceImpl implements ProjectScheduleFormAService {

    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private SubprojectMapper subprojectMapper;
    /**
     * 更新表A内容
     *  通过            andProjectnameEqualTo(projectScheduleVO.getProjectName())
     *                 .andLevel1EqualTo(projectScheduleVO.getLevel1())
     *                 .andLevel2EqualTo(projectScheduleVO.getLevel2())
     *                 .andLevel3EqualTo(projectScheduleVO.getLevel3())
     *                 .andLevel4EqualTo(projectScheduleVO.getLevel4())
     *                 .andLevel5EqualTo(projectScheduleVO.getLevel5());
     *  定位表A
     * @param projectScheduleVO
     * @throws Exception 更新失败抛出异常
     */
    @Override
    public void updataASchedule(ProjectScheduleVO projectScheduleVO) throws Exception {
        Project project=new Project();
        //从表A 中找出对应的project
        ProjectExample projectExp=new ProjectExample();
        ProjectExample.Criteria criteria1=projectExp.createCriteria();
        //通过5个level和projectname唯一一条主项目
        criteria1.andProjectnameEqualTo(projectScheduleVO.getProjectName())
                .andLevel1EqualTo(projectScheduleVO.getLevel1())
               // .andLevel2EqualTo(projectScheduleVO.getLevel2())
                .andLevel3EqualTo(projectScheduleVO.getLevel3())
                .andLevel4EqualTo(projectScheduleVO.getLevel4())
                .andLevel5EqualTo(projectScheduleVO.getLevel5());
        if (projectScheduleVO.getLevel2()!=null){
            criteria1.andLevel2EqualTo(projectScheduleVO.getLevel2());
        }

        //把传入的PO类每个字段进行判空，如果不为空，则写入project对象
        if(projectScheduleVO.getDocumentName()!=null){
        project.setDocumentname(projectScheduleVO.getDocumentName());
        }
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
        if(projectScheduleVO.getSubmitCompany()!=null){
            project.setSubmitcompany(project.getSubmitcompany());
        }

        projectMapper.updateByExampleSelective(project,projectExp);


    }

    /**
     * 删除表单A内容
     * 需要做到级联删除，将A相关的子项目（如果有的话全部删除）
     * @param projectScheduleVO
     * @throws Exception 删除失败抛出异常
     */
    @Override
    public void deleteASchedule(ProjectScheduleVO projectScheduleVO) throws Exception {
        Project project=new Project();
        ProjectExample projectExp1=new ProjectExample();//用来select projct
        ProjectExample.Criteria criteria2=projectExp1.createCriteria();
        SubprojectExample subprojectExp1=new SubprojectExample();//用来delete subproject
        SubprojectExample.Criteria subcriteria=subprojectExp1.createCriteria();
        //通过5个level和projectname唯一一条主项目
        criteria2.andProjectnameEqualTo(projectScheduleVO.getProjectName())
                .andLevel1EqualTo(projectScheduleVO.getLevel1())
             //   .andLevel2EqualTo(projectScheduleVO.getLevel2())
                .andLevel3EqualTo(projectScheduleVO.getLevel3())
                .andLevel4EqualTo(projectScheduleVO.getLevel4())
                .andLevel5EqualTo(projectScheduleVO.getLevel5());
        if (projectScheduleVO.getLevel2()!=null){
            criteria2.andLevel2EqualTo(projectScheduleVO.getLevel2());
        }

        List<Project> projectList= projectMapper.selectByExample(projectExp1);
        String id=projectList.get(0).getId();//得到主项目id
        subcriteria.andProjectidEqualTo(id);
        subprojectMapper.deleteByExample(subprojectExp1);//删除projectId=主项目id的所有子项目

    }
}
