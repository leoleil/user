package com.onps.service;

import java.io.FileInputStream;

public interface InportExcel {
    /**
     * excel导入
     * @param file excel文件流
     * @param fileName excel文件名
     * @throws Exception 导入异常
     */
    void excelImport(FileInputStream file, String fileName) throws Exception;
}
