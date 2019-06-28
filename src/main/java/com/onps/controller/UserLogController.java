package com.onps.controller;

import com.onps.base.PageInfo;
import com.onps.model.vo.UserVo;
import com.onps.service.UserLogService;
import com.onps.utils.resultUtils.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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


    /**
     * 获取到所有的日志文件的名称
     *
     * @return
     */
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

    /**
     * 根据关键字查找基本的日志内容
     *
     * @param pageInfo
     * @return
     */
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
