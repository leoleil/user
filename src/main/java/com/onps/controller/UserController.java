package com.onps.controller;

import com.onps.base.PageInfo;
import com.onps.model.po.UserPO;
import com.onps.utils.ConstantString;
import com.onps.utils.resultUtils.BaseResult;
import com.onps.model.TMgtUser;
import com.onps.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * 用户的基本操作
 */
@Controller
@RequestMapping(value = "/manage/user/")
public class UserController {


    /**
     * 用户的基本操作
     */
    @Resource(name = "userService")
    private UserService userService;


    /**
     * 得到所有用户
     *
     * @param pageInfo
     * @return
     */
    @RequestMapping(value = "getUserByPageInfo", method = RequestMethod.GET)
    @ResponseBody
    public Object getUserByPageInfo(PageInfo pageInfo) {

        try {

            if (PageInfo.SUCCESS_STATUS == pageInfo.getStatus()) {
                //成功封装的操作
                PageInfo<UserPO> userByPageInfo = userService.getUserByPageInfo(pageInfo);

                return BaseResult.createSuccessResult(userByPageInfo);
            } else {
                return BaseResult.createFailResult(pageInfo.getStatusMessage());
            }

        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }


    }

    /**
     * 新增用户
     *
     * @return
     */
    @RequestMapping(value = "insertUser", method = RequestMethod.POST)
    @ResponseBody
    public Object insertUser(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             @RequestParam("rePassword") String rePassword,
                             @RequestParam("zq") String ZQ,
                             @RequestParam("jbz") String JBZ,
                             @RequestParam("department") String department) {

        try {
            Object o = userService.insertUser(username, password, rePassword, ZQ, JBZ, department);
            return BaseResult.createSuccessResult(o);

        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }


    }


    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteUser(@RequestParam("userId") String userId) {

        try {
            Object o = userService.deleteUser(userId);
            return BaseResult.createSuccessResult(o);

        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }


    }

    /**
     * 修改用户密码
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "updateUserPassWord", method = RequestMethod.POST)
    @ResponseBody
    public Object updateUserPassWord(@RequestParam("userId") String userId,
                                     @RequestParam("oriPassword") String oriPassword,
                                     @RequestParam("password") String password,
                                     @RequestParam("rePassword") String rePassword) {

        try {
            Object o = userService.updateUserPassWord(userId, oriPassword, password, rePassword);
            return BaseResult.createSuccessResult(o);

        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }


    }

    /**
     * 修改用户信息
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "updateUserMessage", method = RequestMethod.POST)
    @ResponseBody
    public Object updateUserMessage(@RequestParam("userId") String userId,
                                    @RequestParam("zq") String ZQ,
                                    @RequestParam("jbz") String JBZ,
                                    @RequestParam("department") String department) {

        try {
            Object o = userService.updateUserMessage(userId, ZQ, JBZ, department);
            return BaseResult.createSuccessResult(o);

        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }


    }













    /*@Autowired
    private UserService userService;

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    *//**
     * 登录
     *
     * @param userName 用户名
     * @param pw       密码
     * @return
     *//*
    @ResponseBody
    @RequestMapping(value = "login")
    public BaseResult<TMgtUser> login(String userName, String pw) {

        BaseResult<TMgtUser> br = new BaseResult<TMgtUser>();
        if (userName == null || userName.length() == 0 || pw == null || pw.length() == 0) {
            logger.error("用户名和密码不能为空!");
            br.setStatus(ConstantString.STATUS_FAIL);
            br.setMessage("用户名和密码不能为空!");
            return br;
        }
        if (userName.length() < 3 || userName.length() > 16) {
            br.setStatus(ConstantString.STATUS_FAIL);
            br.setMessage("用户名只能包含中文、英文字符、数字和下横线，且长度在4~16字符之间!");
            return br;
        }

        if (userName.length() < 6 || userName.length() > 16) {
            br.setStatus(ConstantString.STATUS_FAIL);
            br.setMessage("密码只能包含英文字符和数字，且长度在6~16字符之间!");
            return br;
        }

        try {
            TMgtUser user = userService.login(userName, pw);
            if (user == null) {
                br.setStatus(ConstantString.STATUS_FAIL);
                br.setMessage("用户名或密码不正确！");
                return br;
            }
            br.setEntity(user);
            br.setStatus(ConstantString.STATUS_SUCCESS);
        } catch (Exception e) {
            logger.error("登录时发生异常：" + e);
            e.printStackTrace();
            br.setStatus(ConstantString.STATUS_FAIL);
            br.setMessage("登录时发生异常!");
        }
        return br;
    }*/
}

