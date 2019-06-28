package com.onps.service.serviceimpl;

import com.onps.base.PageInfo;
import com.onps.model.vo.LogsFileVo;
import com.onps.service.LogsShellService;
import com.onps.service.UserLogService;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * 日志的基本操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/06/28
 */
@Service("userLogService")
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserLogServiceImpl implements UserLogService {


    @Resource(name = "linuxLogsShellService")
    private LogsShellService linuxLogsShellService;


    @Resource(name = "winLogsShellService")
    private LogsShellService winLogsShellService;


    /**
     * 获取到底层的执行方法
     *
     * @return
     */
    private LogsShellService getUseFulShellService() {
        String property = System.getProperty("os.name");
        System.out.println("os.name" + property);
        if (property.contains("win")) {
            return winLogsShellService;
        } else {
            return linuxLogsShellService;
        }

    }


    /**
     * 直接返回操作结果
     *
     * @return
     * @throws Exception
     */
    @Override
    public Object selectAllLogsFile() throws Exception {
        /**
         * 获取到文件名
         */
        return getUseFulShellService().getAllLogsFileName();
    }

    @Override
    public PageInfo<LogsFileVo> getAllLogsFileNameByKeyWords(PageInfo pageInfo) throws Exception {
        /**
         * 直接返回数据
         */
        return getUseFulShellService().getAllLogsFileNameByKeyWords(pageInfo);
    }


}
