package com.onps.service.serviceimpl;

import com.onps.service.InportExcel;
import com.onps.service.ProjectScheduleService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.IOException;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class InportExcelImpl implements InportExcel {
    @Resource
    private ProjectScheduleService projectScheduleService;

    /**
     * excel导入
     *
     * @param file     excel文件流
     * @param fileName excel文件名
     * @throws Exception 导入异常
     */
    @Override
    public void excelImport(FileInputStream file, String fileName) throws Exception {
        Workbook book = null;
        //兼容 .xls Microsoft Excel
        if(fileName.toLowerCase().endsWith("xls")) {
            System.out.println("兼容xls");
            try {
                book = new HSSFWorkbook(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.err.println("文件后缀有误");
            book=null;
        }
        if(book == null){//防止跳过页面直接访问报错
            file.close();
            System.err.println("请选择excel格式文件");
            throw new IOException("文件无法识别");
        }

        //关闭文件
        file.close();

    }
}
