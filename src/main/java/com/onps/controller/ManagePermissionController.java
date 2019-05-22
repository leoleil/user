package com.onps.controller;

import com.onps.service.ManagePermissionsService;
import com.onps.utils.resultUtils.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 用户权限的管理操作
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/18
 */
@Controller
@RequestMapping("/manage/permission")
public class ManagePermissionController {

    @Resource(name = "managePermissionsService")
    private ManagePermissionsService managePermissionsService;


    /**
     * 授权的基本操作
     * 下面是测试数据
     *
     * @param roleId        FA77D4F2C2504C3F8AE45C25EC30D557
     * @param permissionIds C1A637389DA2412C8457844EE04BE5B0
     *                      3385EBB25C3B40A1B0205572EB0E5272
     *                      DE8374AAC1F2432AADF6862C9779E17E
     *                      351FEC8C01FC4AE58DAB54B49E75BEBF
     * @return
     */
    @RequestMapping(value = "/grantPermissionsToSomeRole", method = RequestMethod.POST)
    @ResponseBody
    public Object grantPermissionsToSomeRole(@RequestParam("roleId") String roleId,
                                             @RequestParam("permissionIds") String[] permissionIds) {
        try {
            /**
             * 请求操作
             */
            Object o = managePermissionsService.grantPermissionsToSomeRole(roleId, permissionIds);
            return BaseResult.createSuccessResult(o);
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }

    }

    /**
     * 查询所有的权限
     * @return
     */
    @RequestMapping(value = "/selectAllPermission", method = RequestMethod.GET)
    @ResponseBody
    public Object selectAllPermission() {
        try {
            /**
             * 请求操作
             */
            Object o = managePermissionsService.selectAllPermission();
            return BaseResult.createSuccessResult(o);
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }

    }


}
