package com.onps.dao;

import com.onps.model.UserSubproject;
import com.onps.model.UserSubprojectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserSubprojectMapper {
    int countByExample(UserSubprojectExample example);

    int deleteByExample(UserSubprojectExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserSubproject record);

    int insertSelective(UserSubproject record);

    List<UserSubproject> selectByExample(UserSubprojectExample example);

    UserSubproject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserSubproject record, @Param("example") UserSubprojectExample example);

    int updateByExample(@Param("record") UserSubproject record, @Param("example") UserSubprojectExample example);

    int updateByPrimaryKeySelective(UserSubproject record);

    int updateByPrimaryKey(UserSubproject record);
}