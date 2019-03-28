package com.onps.service.modules.topogy;

import com.onps.base.topogy.TopogyFactory;
import com.onps.model.AbstractLink;
import com.onps.model.AbstractNode;
import com.onps.model.Topogy;
import com.onps.model.vo.TopogyVO;
import com.onps.service.modules.user.IUser;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.util.List;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TopogyResManage implements ITopogyResManage{
    @Resource
    private IUser userCondition;//用户状态
    private Topogy fiberTopogy = TopogyFactory.create(TopogyFactory.FIBER);
    private Topogy wtmTopogy = TopogyFactory.create(TopogyFactory.WDM);
    private Topogy otnTopogy = TopogyFactory.create(TopogyFactory.OTN);
    private Topogy sdhTopogy = TopogyFactory.create(TopogyFactory.SDH);
    private Topogy swTopogy = TopogyFactory.create(TopogyFactory.SW);
    private Topogy satelliteTopogy = TopogyFactory.create(TopogyFactory.SATELLITE);

    /**
     * 创建拓扑视图
     *
     * @param layer 层次
     * @return 成功返回拓扑，失败返回null
     */
    @Override
    public TopogyVO createVO(String layer) {
        return null;
    }

    /**
     * 获取全部的拓扑视图数据
     *
     * @return 成功返回链表，失败返回null
     */
    @Override
    public List<TopogyVO> createVOList() {
        return null;
    }

    /**
     * 通过Node对象找到两点间的最短路由
     *
     * @param fromNode 起点
     * @param toNode   终点
     * @param layer    寻路层次
     * @return 成功返回路由链路的数组，失败返回null
     */
    @Override
    public List<AbstractLink> getRouteByNode(AbstractNode fromNode, AbstractNode toNode, String layer) {
        return null;
    }

    /**
     * 通过Node的ID找到两点间的最短路由
     *
     * @param fromNodeID 起点的id
     * @param toNodeID   终点的id
     * @param layer      寻路的层次
     * @return
     */
    @Override
    public List<AbstractLink> getRouteByNodeID(String fromNodeID, String toNodeID, String layer) {
        return null;
    }
}
