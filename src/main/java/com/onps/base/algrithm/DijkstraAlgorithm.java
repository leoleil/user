package com.onps.base.algrithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Dijkstra算法
 * @author 陈雷雨
 * @since 2019/3/20
 */
public class DijkstraAlgorithm implements ShortestPathAlgorithm {
    //私有化构造函数
    private DijkstraAlgorithm(){}

    /**
     * 路由计算
     *
     * @param adjacentMatrix 整个图的邻接矩阵
     * @param origin         起点
     * @param destination    终点
     * @return 路由的数组 没有路径数组为空
     */
    @Override
    public List<Integer> routeCalculation(int[][] adjacentMatrix, int origin, int destination) {
        int size = adjacentMatrix[1].length;//获取邻接矩阵大小
        int[] distance= new int[size];//最短路长度
        boolean[] flag= new boolean[size];//标记i顶点最短路有无找到
        int[] prev=new int[size];//前驱数组
        ArrayList<Integer> route = new ArrayList<Integer>();//路由数组
        //初始化
        for(int i = 0 ;i < size ;i++) {
            distance[i] = adjacentMatrix[origin][i];//初始化距离都为起点到各个点的权值
            flag[i]=false;//起点到各个点的最短路径还没获取到
            prev[i]=0;//各个顶点的前驱点为0
        }
        //对起点进行初始化
        flag[origin]=true;
        distance[origin]=0;//起点到起点的距离为0

        //遍历邻接矩阵size-1次；每次找出一个顶点的最短路径
        int k=0;
        for(int i =1;i<size;i++) {
            //寻找当前的最短路径
            //即在为获取最短路径的顶点中，找到离起点最近的顶点（k）
            int min=Integer.MAX_VALUE;
            for(int j=0;j<size;j++) {
                if(flag[j]==false && distance[j] < min) {
                    min=distance[j];
                    k=j;
                }
            }
            //标记"节点k"为已经获取到最短路径
            flag[k]=true;
            //修正当前最短路径和前驱节点
            for(int j=0;j<size;i++) {
                int tmp=(adjacentMatrix[k][j]==Integer.MAX_VALUE ? Integer.MAX_VALUE:(min+adjacentMatrix[k][j]));
                if(flag[j]==false && (tmp < distance[j])) {
                    distance[j]=tmp;
                    prev[j]=k;
                }
            }
        }
        //获取路由数组
        Stack<Integer> stack= new Stack<Integer>();
        int topPtr=destination;
        stack.push(topPtr);
        while(topPtr!=origin) {
            topPtr=prev[topPtr];
            stack.push(topPtr);

        }
        while(!stack.empty()) {
            route.add(stack.pop());
        }

        return route;
    }
}
