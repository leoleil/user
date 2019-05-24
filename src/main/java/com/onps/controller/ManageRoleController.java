package com.onps.controller;

import com.onps.service.ManageRoleService;
import com.onps.utils.resultUtils.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 角色的基本操作
 * <p>
 * 1.将某个角色授予某个用户
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/18
 */
@Controller
@RequestMapping("/manage/role")
public class ManageRoleController {

    /**
     * 角色的管理操作
     */
    @Resource(name = "manageRoleService")
    private ManageRoleService manageRoleService;

    /**
     * 给某人授予角色
     * <p>
     * 测试数据
     *
     * @param userId  用户Id 538514A3238A4EB187BFDA5072A50F47
     * @param roleIds 角色的
     *                FA77D4F2C2504C3F8AE45C25EC30D557
     *                6DE1871DBBFB4CC6A86481EE1601FC3F
     * @return
     */
    @RequestMapping(value = "/grantRolesToSomeOne", method = RequestMethod.POST)
    @ResponseBody
    public Object grantRolesToSomeOne(@RequestParam("userId") String userId,
                                      @RequestParam("roleIds") String[] roleIds) {

        try {
            /**
             * 请求操作
             */
            Object o = manageRoleService.grantRolesToSomeOne(userId, roleIds);
            return BaseResult.createSuccessResult(o);
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }

    }

    /**
     * 取消权限
     *
     * @param userId
     * @param roleIds
     * @return
     */
    @RequestMapping(value = "/revokeRolesFromSomeOne", method = RequestMethod.POST)
    @ResponseBody
    public Object revokeRolesFromSomeOne(@RequestParam("userId") String userId,
                                         @RequestParam("roleIds") String[] roleIds) {
        try {
            /**
             * 请求操作
             */
            Object o = manageRoleService.revokeRolesFromSomeOne(userId, roleIds);
            return BaseResult.createSuccessResult(o);
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }

    }

    /**
     * 查询所有的角色
     *
     * @return
     */
    @RequestMapping(value = "/selectAllRole", method = RequestMethod.GET)
    @ResponseBody
    public Object selectAllRole() {

        try {
            /**
             * 请求操作
             */
            Object o = manageRoleService.selectAllRole();
            return BaseResult.createSuccessResult(o);
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }

    }

    /**
     * 查询角色的权限
     *
     * @param roleId FA77D4F2C2504C3F8AE45C25EC30D557
     * @return
     */
    @RequestMapping(value = "/getPermissionByRoleId", method = RequestMethod.GET)
    @ResponseBody
    public Object getPermissionByRoleId(@RequestParam("roleId") String roleId) {

        try {
            /**
             * 请求操作
             */
            Object o = manageRoleService.selectPermissionByRoleId(roleId);
            return BaseResult.createSuccessResult(o);
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }

    }

}
