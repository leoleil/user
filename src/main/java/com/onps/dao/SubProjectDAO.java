package com.onps.dao;

import org.apache.ibatis.annotations.Param;

/**
 * 项目的基本操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/17
 */
public interface SubProjectDAO {

    /**
     * 将子项目为projectId  分配给  userID
     *
     * @param subProjectId 子项目的Id
     * @param userID       用户的Id
     * @return
     */
    int updateProjectToSomeOne(@Param("subProjectId") String subProjectId, @Param("userID") String userID);

}
