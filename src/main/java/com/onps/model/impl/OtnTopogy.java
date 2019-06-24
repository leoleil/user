package com.onps.model.impl;

import com.onps.model.AbstractLink;
import com.onps.model.AbstractNode;
import com.onps.model.Topogy;
import com.onps.model.vo.TopogyVO;

import java.util.List;


/**
 * OTN 拓扑
 * @author 陈雷雨
 * @since 2019/3/13
 */
public class OtnTopogy implements Topogy {
    /**
     * 添加节点
     *
     * @param link 节点
     * @return 添加成功返回True 失败返回False
     */
    @Override
    public boolean addLink(AbstractLink link) {
        return false;
    }

    /**
     * 添加节点
     *
     * @param node
     * @return
     */
    @Override
    public boolean addNode(AbstractNode node) {
        return false;
    }

    /**
     * 获取拓扑视图数据
     *
     * @return 返回为null为没有拓扑资源
     */
    @Override
    public TopogyVO getViewModel() {
        return null;
    }

    /**
     * 获取两个节点间的路由
     *
     * @param fromNode 起节点
     * @param toNode   终点节点
     * @return 返回链路路由 如果没有路由返回null
     */
    @Override
    public List<AbstractLink> getRoute(AbstractNode fromNode, AbstractNode toNode) {
        return null;
    }
}
