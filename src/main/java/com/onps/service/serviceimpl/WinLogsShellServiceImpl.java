package com.onps.service.serviceimpl;


import com.onps.base.PageInfo;
import com.onps.model.vo.LogsFileVo;
import com.onps.service.LogsShellService;
import com.onps.service.UserLogService;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 日志的基本操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/06/27
 */
@Service("winLogsShellService")
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class WinLogsShellServiceImpl implements LogsShellService {

    /**
     * 日志文件的位置
     */
    private static final String LOGS_FILE_PATH = "/Users/breakpoint/Downloads/logs";

    /**
     * @return
     * @throws Exception
     */
    @Override
    public List<LogsFileVo> getAllLogsFileName() throws Exception {

        /**
         * 返回基本的数据
         */
        return getAllFileMessage();
    }

    /**
     * win 的基本操作
     *
     * @param pageInfo
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<LogsFileVo> getAllLogsFileNameByKeyWords(PageInfo pageInfo) throws Exception {
        return null;
    }

    /**
     * 获取所有文件
     *
     * @return
     * @throws Exception
     */
    private List<LogsFileVo> getAllFileMessage() throws Exception {

        /**
         * 返回的数据
         */
        List<LogsFileVo> logsFileVos = null;

        File file = new File(LOGS_FILE_PATH);

        if (file.isDirectory()) {

            /**
             *  列出所有的文件名称
             */
            File[] files = file.listFiles();


            logsFileVos = new ArrayList<>(16);

            for (File file1 : files) {
                System.out.println(file1.getAbsolutePath());
                System.out.println(file1.getName());
                logsFileVos.add(new LogsFileVo(file1.getName(), file1.getAbsolutePath()));
            }

        } else {
            logsFileVos = Collections.emptyList();
        }


        return logsFileVos;

    }
}
