package com.onps.dao;

import com.onps.model.User;
import com.onps.model.po.UserPO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDAO {
    void insertUser(UserPO userPO)throws Exception;
    void deleteUser(UserPO userPO)throws Exception;
    List<UserPO> getUserList();
    UserPO getUser(String id);
    UserPO loggin(Map<String,String> map);
}
