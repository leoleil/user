package com.onps.service.serviceimpl;


import com.onps.base.PageInfo;
import com.onps.model.vo.LogsFileVo;
import com.onps.service.LogsShellService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 日志的基本操作   linux系统命令
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/06/27
 */
@Service("linuxLogsShellService")
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LinuxLogsShellServiceImpl implements LogsShellService {

    /**
     * 日志文件的位置
     */
    private static final String LOGS_FILE_PATH = "/Users/breakpoint/Downloads/logs";


    /**
     * 获取到resource项目的文件夹
     *
     * @return
     * @throws Exception
     */
    private String getProjectResourcePath() throws Exception {
        Resource res = new ClassPathResource("/shellDir/");
        File file = res.getFile();
        return file.getAbsolutePath() + "/";
    }


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
     * 具体的基本操作
     *
     * @param pageInfo
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<LogsFileVo> getAllLogsFileNameByKeyWords(PageInfo pageInfo) throws Exception {


        /**
         * 返回的对象的基本操作
         */

        List<LogsFileVo> logsFileVos = null;

        if (StringUtils.isBlank(pageInfo.getKeyWord())) {
            throw new Exception("查询关键字为空");
        }

        /**
         * 分页查询基本操作
         */
        int currentPage = pageInfo.getCurrentPage();

        int pageSize = pageInfo.getPageSize();

        int pageStart = (currentPage - 1) * pageSize + 1;

        /**
         * 访问  之后统计
         */

        System.out.println("'" + pageInfo.getKeyWord() + "'");

        ProcessBuilder processBuilder = new ProcessBuilder(getProjectResourcePath() + "/linuxPs.sh", pageInfo.getKeyWord(), LOGS_FILE_PATH, pageStart + "", pageSize + "");

        Process start = processBuilder.start();

        start.waitFor();

        InputStream in = start.getInputStream();

        /**
         * 修改编码的问题
         */
        BufferedReader read = new BufferedReader(new InputStreamReader(in, "utf-8"));

        logsFileVos = new ArrayList<>(16);

        String line = null;
        while ((line = read.readLine()) != null) {
            /**
             * 总个数
             */
            if (line.contains("pages")) {
                /**
                 * 分页的基本操作
                 */
                System.out.println(line.split("[ ]+")[1]);

                int dataTotal = Integer.valueOf(line.split("[ ]+")[1]);

                pageInfo.setDataTotal(dataTotal);

                int pageTotal = dataTotal / pageSize + 1;

                pageInfo.setPageTotal(pageTotal);

                int nextPage = (currentPage == pageTotal) ? pageTotal : (currentPage + 1);

                pageInfo.setNextPage(nextPage);

            } else {
                /**
                 * 其他的数据的处理
                 */

                String[] split = line.split(":");

                if (split.length > 1) {
                    logsFileVos.add(new LogsFileVo(split[0], line, line));
                }

            }


            // System.out.println(line);
        }

        if (null == logsFileVos) {
            logsFileVos = Collections.emptyList();
        }

        pageInfo.setData(logsFileVos);

        return pageInfo;
    }


    /**
     * 获取所有文件  名称以及其他的基本操作
     *
     * @return
     * @throws Exception
     */
    private List<LogsFileVo> getAllFileMessage() throws Exception {

        /**
         * 返回的数据
         */
        List<LogsFileVo> logsFileVos = null;


        /**
         * 执行具体的处理
         */

        String projectResourcePath = getProjectResourcePath();

        /**
         * 执行命令
         */
        ProcessBuilder processBuilder = new ProcessBuilder(projectResourcePath + "/linuxDir.sh", LOGS_FILE_PATH);

        Process start = processBuilder.start();

        start.waitFor();

        InputStream in = start.getInputStream();
        BufferedReader read = new BufferedReader(new InputStreamReader(in));
        String line = null;

        logsFileVos = new ArrayList<>(16);


        while ((line = read.readLine()) != null) {

            //System.out.println(line);
            /**
             * 返回的基本数据
             */
            String[] split = line.split(" ");

            if (split.length == 2) {
                logsFileVos.add(new LogsFileVo(split[0], line));
            }

        }

        return logsFileVos;

    }
}
