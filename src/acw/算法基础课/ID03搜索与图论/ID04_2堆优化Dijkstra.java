package acw.算法基础课.ID03搜索与图论;

import java.util.PriorityQueue;

/**
 * @author Yeah
 * @date 2021/3/28 - 17:51
 *
 * 就不手写堆了 使用邻接表存储稀疏图
 */
public class ID04_2堆优化Dijkstra {
    static int N=100010;
    static int[]h=new int[N];
    static int[]e=new int[N];
    static int[]ne=new int[N];
    static int []dist=new int[N];
    static int idx;
    static void add(int a,int b){
        e[idx]=b;
        ne[idx]=h[a];
        h[a]=idx++;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();

    }
}
