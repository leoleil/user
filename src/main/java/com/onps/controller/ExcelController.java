package com.onps.controller;

import com.onps.service.InportExcel;
import com.onps.utils.ConstantString;
import com.onps.utils.resultUtils.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("/excel")
public class ExcelController {
    @Resource
    private InportExcel inportExcel;

    @RequestMapping("/upload")
    public BaseResult<String> importExcel(@RequestParam("excelFile") MultipartFile excelFile, HttpServletRequest request, HttpServletResponse response ){
        BaseResult<String> info = new  BaseResult<String>();
        if(excelFile.isEmpty()){
            info.setMessage("传入文件为空");
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
        System.out.println("*************excel导入启动*************");

        try {
            FileInputStream fis = (FileInputStream) excelFile.getInputStream();
            inportExcel.excelImport(fis,"ok.xls");
            info.setMessage("成功");
            info.setStatus(ConstantString.STATUS_SUCCESS);
            return info;
        } catch (IOException e) {
            info.setMessage(e.getMessage());
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        } catch (Exception e){
            info.setMessage(e.getMessage());
            info.setStatus(ConstantString.STATUS_FAIL);
            return info;
        }
    }
}
