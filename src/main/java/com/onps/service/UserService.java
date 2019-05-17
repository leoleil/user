package com.onps.service;

import com.onps.base.PageInfo;
import com.onps.model.TMgtUser;
import com.onps.model.po.UserPO;


/**
 * 主要完成用户的基本维护的操作
 * <p>
 * 用户的增加  修改  删除
 * <p>
 * 用户的授权是权限的问题
 * <p>
 * 这两天需要实现用户添加~删除~修改的操作~还有你要给前天用户列表这些功能
 */
public interface UserService {

    /**
     * 新增用户的基本操作
     *
     * @param username   用户名
     * @param password   密码
     * @param rePassword 确认密码
     * @param ZQ         战区
     * @param JBZ        军兵种
     * @param department 部门
     * @return
     * @throws Exception
     */
    Object insertUser(String username, String password, String rePassword, String ZQ,
                      String JBZ, String department) throws Exception;

    /**
     * 删除用户
     *
     * @param userID
     * @return
     * @throws Exception
     */
    Object deleteUser(String userID) throws Exception;

    /**
     * 修改用户
     *
     * @throws Exception
     */
    Object updateUserMessage(String userId, String ZQ, String JBZ, String department) throws Exception;


    Object updateUserPassWord(String userId,String oriPassword, String password, String rePassword) throws Exception;


    /**
     * 查询用户的操作
     *
     * @param pageInfo
     * @return
     * @throws Exception
     */
    PageInfo<UserPO> getUserByPageInfo(PageInfo pageInfo) throws Exception;


}
