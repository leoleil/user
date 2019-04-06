package com.onps.dao;

import java.util.List;

import com.onps.model.Subproject;
import com.onps.model.SubprojectExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SubprojectMapper {
    int countByExample(SubprojectExample example);

    int deleteByExample(SubprojectExample example);

    int deleteByPrimaryKey(String id);

    int insert(Subproject record);

    int insertSelective(Subproject record);

    List<Subproject> selectByExample(SubprojectExample example);

    Subproject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Subproject record, @Param("example") SubprojectExample example);

    int updateByExample(@Param("record") Subproject record, @Param("example") SubprojectExample example);

    int updateByPrimaryKeySelective(Subproject record);

    int updateByPrimaryKey(Subproject record);
}