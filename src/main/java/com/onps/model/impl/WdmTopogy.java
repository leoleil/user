package com.onps.model.impl;

import com.onps.model.AbstractLink;
import com.onps.model.vo.TopogyVO;
import com.onps.model.AbstractNode;
import com.onps.model.Topogy;

import java.util.List;

/**
 * WDM 拓扑
 * @author 陈雷雨
 * @since 2019/3/13
 */
public class WdmTopogy implements Topogy {
    @Override
    public boolean addLink(AbstractLink link) {
        return false;
    }

    @Override
    public boolean addNode(AbstractNode node) {
        return false;
    }

    @Override
    public TopogyVO getViewModel() {
        return null;
    }

    @Override
    public List<AbstractLink> getRoute(AbstractNode fromNode, AbstractNode toNode) {
        return null;
    }
}
