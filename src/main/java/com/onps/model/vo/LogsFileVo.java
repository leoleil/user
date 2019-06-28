package com.onps.model.vo;

/**
 * 日志的文件明返回
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/06/27
 */
public class LogsFileVo {

    private String fileName;

    private String absolutePath;


    private String mainMessage;

    public LogsFileVo() {
    }

    public LogsFileVo(String fileName, String absolutePath) {
        this.fileName = fileName;
        this.absolutePath = absolutePath;
    }

    public LogsFileVo(String fileName, String absolutePath, String mainMessage) {
        this.fileName = fileName;
        this.absolutePath = absolutePath;
        this.mainMessage = mainMessage;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public String getMainMessage() {
        return mainMessage;
    }

    public void setMainMessage(String mainMessage) {
        this.mainMessage = mainMessage;
    }
}
