package com.onps.controller;

import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleFormAService;
import com.onps.utils.ConstantString;
import com.onps.utils.StringUtils;
import com.onps.utils.resultUtils.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/schedule")
public class ProjectScheduleAController {

    @Resource
    ProjectScheduleFormAService projectScheduleFormAService;
    @RequestMapping("/updateA")
    public BaseResult<ProjectScheduleVO> update(ProjectScheduleVO projectScheduleVO){
        BaseResult<ProjectScheduleVO> info = new BaseResult<ProjectScheduleVO>();
        if((!projectScheduleVO.getProjectName().equals("")) && projectScheduleVO.getProjectName() != null
        && (!projectScheduleVO.getLevel1().equals("")) && projectScheduleVO.getLevel1() != null
        && (!projectScheduleVO.getLevel3().equals("")) && projectScheduleVO.getLevel3() != null
        && (!projectScheduleVO.getLevel4().equals("")) && projectScheduleVO.getLevel4() != null
        && (!projectScheduleVO.getLevel5().equals("")) && projectScheduleVO.getLevel5() != null){
            try {
                projectScheduleFormAService.updataASchedule(projectScheduleVO);
                info.setStatus(ConstantString.STATUS_SUCCESS);
                info.setMessage("修改成功");
                return info;
            } catch (Exception e) {
                info.setMessage("修改出现异常");
                info.setStatus(ConstantString.STATUS_FAIL);
                return info;
            }

        }else {
            info.setMessage("请确定你要修改的主项目路径");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
    }
    @RequestMapping("/deleteA")
    public BaseResult<ProjectScheduleVO> delete(ProjectScheduleVO projectScheduleVO){
        BaseResult<ProjectScheduleVO> info = new BaseResult<ProjectScheduleVO>();
        if((!projectScheduleVO.getProjectName().equals("")) && projectScheduleVO.getProjectName() != null
                && (!projectScheduleVO.getLevel1().equals("")) && projectScheduleVO.getLevel1() != null
                && (!projectScheduleVO.getLevel3().equals("")) && projectScheduleVO.getLevel3() != null
                && (!projectScheduleVO.getLevel4().equals("")) && projectScheduleVO.getLevel4() != null
                && (!projectScheduleVO.getLevel5().equals("")) && projectScheduleVO.getLevel5() != null){
            try {
                projectScheduleFormAService.deleteASchedule(projectScheduleVO);
                info.setStatus(ConstantString.STATUS_SUCCESS);
                info.setMessage("修改成功");
                return info;
            } catch (Exception e) {
                info.setMessage("修改出现异常");
                info.setStatus(ConstantString.STATUS_FAIL);
                return info;
            }

        }else {
            info.setMessage("请确定你要修改的主项目路径");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
    }
}
