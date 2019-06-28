package com.onps.service;

import com.onps.base.PageInfo;
import com.onps.model.vo.LogsFileVo;

import java.util.List;

/**
 * shell命令的基本操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/06/28
 */
public interface LogsShellService {


    /**
     * 查询所有日志文件的位置以及名称  之后进行返回
     *
     * @return
     * @throws Exception
     */
    List<LogsFileVo> getAllLogsFileName() throws Exception;

    /**
     * 查询关键词
     *
     * @return
     * @throws Exception
     */
    PageInfo<LogsFileVo> getAllLogsFileNameByKeyWords(PageInfo pageInfo) throws Exception;

}
