package com.onps.model;

import com.onps.model.vo.TopogyVO;

import java.util.List;

public interface Topogy {
    /**
     * 添加节点
     * @param link 节点
     * @return 添加成功返回True 失败返回False
     */
    boolean addLink(AbstractLink link);

    /**
     * 添加节点
     * @param node
     * @return
     */
    boolean addNode(AbstractNode node);

    /**
     * 获取拓扑视图数据类
     * @return 返回为null为没有拓扑资源
     */
    TopogyVO getViewModel();

    /**
     * 获取两个节点间的路由
     * @param fromNode 起节点
     * @param toNode 终点节点
     * @return 返回链路路由 如果没有路由返回null
     */
    List<AbstractLink> getRoute(AbstractNode fromNode, AbstractNode toNode);
}
