package com.onps.dao;

import com.onps.model.Subproject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 统计所有的项目
     *
     * @return
     */
    int countAllSubProject();

    /**
     * 查询用户的操作
     */

    List<Subproject> getSubProjectByPageInfo(@Param("start") int start, @Param("end") int end);

}
