package com.onps.dao;

import java.util.List;

import com.onps.model.ProjectCat;
import com.onps.model.ProjectCatExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectCatMapper {
    int countByExample(ProjectCatExample example);

    int deleteByExample(ProjectCatExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProjectCat record);

    int insertSelective(ProjectCat record);

    List<ProjectCat> selectByExample(ProjectCatExample example);

    ProjectCat selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProjectCat record, @Param("example") ProjectCatExample example);

    int updateByExample(@Param("record") ProjectCat record, @Param("example") ProjectCatExample example);

    int updateByPrimaryKeySelective(ProjectCat record);

    int updateByPrimaryKey(ProjectCat record);
}