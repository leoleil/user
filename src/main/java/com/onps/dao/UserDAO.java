package com.onps.dao;

import com.onps.model.User;
import com.onps.model.po.UserPO;
import com.onps.model.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    void insertUser(UserPO userPO) throws Exception;

    void deleteUser(UserPO userPO) throws Exception;

    List<UserPO> getUserList();

    User getUserById(String id);

    User getUserByUserName(String userName);

    User login(String username);

    void updateUser(UserPO userPO) throws Exception;

    /**
     * 查询用户的操作
     */

    List<UserVo> getUserByPageInfo(@Param("start") int start, @Param("end") int end);

    /**
     * 计算所有的用户的数量
     *
     * @return
     */
    int countAllUser();
}
