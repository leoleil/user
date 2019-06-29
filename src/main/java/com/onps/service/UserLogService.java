package com.onps.service;

import com.onps.base.PageInfo;
import com.onps.model.vo.LogsFileVo;


/**
 * 日志的服务操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/06/27
 */
public interface UserLogService {


    /**
     * 查询所有日志文件的位置以及名称  之后进行返回
     *
     * @return
     * @throws Exception
     */
    Object selectAllLogsFile() throws Exception;


    PageInfo<LogsFileVo> getAllLogsFileNameByKeyWords(PageInfo pageInfo) throws Exception;



}
