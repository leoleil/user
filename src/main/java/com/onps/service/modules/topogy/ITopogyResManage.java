package com.onps.service.modules.topogy;

import com.onps.model.AbstractLink;
import com.onps.model.AbstractNode;
import com.onps.model.vo.TopogyVO;

import java.util.List;

public interface ITopogyResManage {
    //视图部分
    /**
     * 创建拓扑视图
     * @param layer 层次
     * @return 成功返回拓扑，失败返回null
     */
    TopogyVO createVO(String layer);

    /**
     * 获取全部的拓扑视图数据
     * @return 成功返回链表，失败返回null
     */
    List<TopogyVO> createVOList();

    //算路部分
    /**
     * 通过Node对象找到两点间的最短路由
     * @param fromNode 起点
     * @param toNode 终点
     * @param layer 寻路层次
     * @return 成功返回路由链路的数组，失败返回null
     */
    List<AbstractLink> getRouteByNode(AbstractNode fromNode,AbstractNode toNode,String layer);

    /**
     * 通过Node的ID找到两点间的最短路由
     * @param fromNodeID 起点的id
     * @param toNodeID 终点的id
     * @param layer 寻路的层次
     * @return
     */
    List<AbstractLink> getRouteByNodeID(String fromNodeID,String toNodeID,String layer);
}
