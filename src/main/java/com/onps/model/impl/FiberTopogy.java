package com.onps.model.impl;

import com.onps.model.AbstractLink;
import com.onps.model.AbstractNode;
import com.onps.model.Topogy;
import com.onps.model.entity.CommonNode;
import com.onps.model.entity.FiberLink;
import com.onps.model.vo.TopogyVO;

import java.util.*;

/**
 * Fiber拓扑
 * @author 陈雷雨
 * @since 2019/3/13
 */
public class FiberTopogy implements Topogy {
    Set<FiberLink> fiberLinks = new HashSet<FiberLink>();
    Set<CommonNode> commonNodes = new HashSet<CommonNode>();

    @Override
    public boolean addLink(AbstractLink link) {
        //判断类型
        if(!(link instanceof FiberLink)){
            return  false;
        }
        //类型转换
        FiberLink fiberLink = (FiberLink)link;
        return fiberLinks.add(fiberLink);
    }

    @Override
    public boolean addNode(AbstractNode node) {
        //类型判断
        if(!(node instanceof CommonNode)){
            return false;
        }
        //类型转换
        CommonNode commonNode = (CommonNode)node;
        return commonNodes.add(commonNode);
    }

    @Override
    public TopogyVO getViewModel() {
        return null;
    }

    @Override
    public List<AbstractLink> getRoute(AbstractNode fromNode, AbstractNode toNode) {
        int size = commonNodes.size();
        int[][] adjacentMatrix = new int[size][size];//邻接矩阵
        Map<Integer,CommonNode> nodeToIntMap = new HashMap<Integer,CommonNode>();//矩阵小标和点的对应关系
        Map<CommonNode,Integer> intToNodeMap = new HashMap<CommonNode,Integer>();//点与矩阵小标的对应关系
        int count = 1;//小标起点
        for (CommonNode node:
             commonNodes) {
            nodeToIntMap.put(count,node);
            intToNodeMap.put(node,count);
        }
        return null;
    }


}
