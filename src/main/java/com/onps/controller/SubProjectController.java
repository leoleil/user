package com.onps.controller;

import com.onps.service.SubProjectService;
import com.onps.utils.resultUtils.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 项目的管理
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/17
 */
@Controller
@RequestMapping(value = "/manage/project/")
public class SubProjectController {

    @Resource(name = "subProjectService")
    private SubProjectService subProjectService;


    /**
     *
     * @param subProjectId  A29874323050490EAAE3D890AE29E0C7
     * @param userId  538514A3238A4EB187BFDA5072A50F47   91B388310876479AB1E6FDF7102A128B
     * @return
     */
    @RequestMapping(value = "/addSubProjectToSomeOne",method = RequestMethod.POST)
    @ResponseBody
    public Object addSubProjectToSomeOne(@RequestParam("subProjectId") String subProjectId,
                                         @RequestParam("userId") String userId) {

        try {
            /**
             * 操作成功的返回
             */
            Object o = subProjectService.addSubProjectToSomeOne(subProjectId, userId);
            return BaseResult.createSuccessResult(o);
        } catch (Exception e) {
            /**
             * 返回失败的操作信息
             */
            return BaseResult.createFailResult(e.getMessage());
        }


    }

    @RequestMapping(value = "/selectAllSubProject",method = RequestMethod.GET)
    @ResponseBody
    public Object selectAllSubProject() {

        try {
            /**
             * 操作成功的返回
             */
            Object o = subProjectService.selectAllSubProject();
            return BaseResult.createSuccessResult(o);
        } catch (Exception e) {
            /**
             * 返回失败的操作信息
             */
            return BaseResult.createFailResult(e.getMessage());
        }


    }


}
