package com.onps.service.serviceimpl;

import com.onps.dao.SubProjectDAO;
import com.onps.dao.SubprojectMapper;
import com.onps.model.Subproject;
import com.onps.service.SubProjectService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * 项目的基本操作
 * <p>
 * 1。将某个项目分配某人
 *
 * @author :breakpoint/赵立刚
 * @date : 2019/05/17
 */
@Service("subProjectService")
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SubProjectServiceImpl implements SubProjectService {

    /**
     * 子项目的的基本操作
     */
    @Resource
    private SubProjectDAO subProjectDAO;


    @Resource
    private SubprojectMapper subprojectMapper;


    /**
     * @return
     * @throws Exception
     */
    @Override
    public Object addSubProjectToSomeOne(String subProjectId, String userId) throws Exception {

        /**
         * 校验基本信息
         */

        if (StringUtils.isEmpty(subProjectId)) {
            throw new Exception("子项目Id为空");
        }

        if (StringUtils.isEmpty(userId)) {
            throw new Exception("用户Id为空");
        }


        try {

            /**
             * 查询更新的项目
             */
            Subproject subproject = subprojectMapper.selectByPrimaryKey(subProjectId);

            if (null == subproject) {
                throw new Exception("查询不到更新的项目");
            }

            //TODO 是否可以分配给其他人

//            if (!StringUtils.isEmpty(subproject.getUserid())) {
//
//            }


            int i = subProjectDAO.updateProjectToSomeOne(subProjectId, userId);

            return "OK";

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
