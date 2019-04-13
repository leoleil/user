package com.onps.controller;

import com.onps.model.vo.ProjectScheduleVO;
import com.onps.service.ProjectScheduleFormBService;
import com.onps.utils.ConstantString;
import com.onps.utils.resultUtils.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ProjectScheduleBController {
    @Resource
    ProjectScheduleFormBService projectScheduleFormBService;

    @RequestMapping("/updateB")
    public BaseResult<ProjectScheduleVO> update(ProjectScheduleVO projectScheduleVO){
        BaseResult<ProjectScheduleVO> info = new BaseResult<ProjectScheduleVO>();
        if((!projectScheduleVO.getProjectName().equals("")) && projectScheduleVO.getProjectName() != null
                && (!projectScheduleVO.getLevel1().equals("")) && projectScheduleVO.getLevel1() != null
                && (!projectScheduleVO.getLevel3().equals("")) && projectScheduleVO.getLevel3() != null
                && (!projectScheduleVO.getLevel4().equals("")) && projectScheduleVO.getLevel4() != null
                && (!projectScheduleVO.getLevel5().equals("")) && projectScheduleVO.getLevel5() != null){
            try {
                projectScheduleFormBService.updateBSchedule(projectScheduleVO);
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
    @RequestMapping("/deleteB")
    public BaseResult<ProjectScheduleVO> delete(ProjectScheduleVO projectScheduleVO){
        BaseResult<ProjectScheduleVO> info = new BaseResult<ProjectScheduleVO>();
        if((!projectScheduleVO.getProjectName().equals("")) && projectScheduleVO.getProjectName() != null
                && (!projectScheduleVO.getLevel1().equals("")) && projectScheduleVO.getLevel1() != null
                && (!projectScheduleVO.getLevel3().equals("")) && projectScheduleVO.getLevel3() != null
                && (!projectScheduleVO.getLevel4().equals("")) && projectScheduleVO.getLevel4() != null
                && (!projectScheduleVO.getLevel5().equals("")) && projectScheduleVO.getLevel5() != null){
            try {
                projectScheduleFormBService.deleteBSchedule(projectScheduleVO);
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
