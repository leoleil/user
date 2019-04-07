package com.onps.dao;
import java.util.List;

import com.onps.model.MyUser;
import com.onps.model.MyUserExample;
import org.apache.ibatis.annotations.Param;

public interface MyUserMapper {
    int countByExample(MyUserExample example);

    int deleteByExample(MyUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(MyUser record);

    int insertSelective(MyUser record);

    List<MyUser> selectByExample(MyUserExample example);

    MyUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MyUser record, @Param("example") MyUserExample example);

    int updateByExample(@Param("record") MyUser record, @Param("example") MyUserExample example);

    int updateByPrimaryKeySelective(MyUser record);

    int updateByPrimaryKey(MyUser record);
}