package com.onps.controller;

import com.onps.base.PageInfo;
import com.onps.model.vo.UserVo;
import com.onps.service.UserLogService;
import com.onps.utils.resultUtils.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 日志的基本操作
 * <p>
 * 查询用户输出的日志以及其他的操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/06/27
 */
@Controller
@RequestMapping(value = "/manage/logs/")
public class UserLogController {

    /**
     * 相关的操作
     */
    @Resource
    private UserLogService userLogService;


    @RequestMapping(value = "getAllLogsFile", method = RequestMethod.GET)
    @ResponseBody
    public Object getAllLogsFile() {

        try {

            Object o = userLogService.selectAllLogsFile();

            return BaseResult.createSuccessResult(o);

        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }


    }

    @RequestMapping(value = "getAllLogsFileNameByKeyWords", method = RequestMethod.GET)
    @ResponseBody
    public Object getAllLogsFileNameByKeyWords(PageInfo pageInfo) {

        try {

            Object o = userLogService.getAllLogsFileNameByKeyWords(pageInfo);

            return BaseResult.createSuccessResult(o);

        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }


    }


}
