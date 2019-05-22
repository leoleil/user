package com.onps.service;

/**
 * 项目的基本操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/17
 */
public interface SubProjectService {


    /**
     * 将某个项目授予某人
     *
     * @return
     * @throws Exception
     */
    Object addSubProjectToSomeOne(String subProjectId, String userId) throws Exception;

    /**
     * 查询所有的子项目
     *
     * @return
     * @throws Exception
     */
    Object selectAllSubProject() throws Exception;
}
