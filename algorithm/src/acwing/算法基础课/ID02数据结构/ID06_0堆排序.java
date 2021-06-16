package acwing.算法基础课.ID02数据结构;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Yeah
 * @date 2021/2/26 - 17:51
 * 堆： 完全二叉树(逻辑结构) 物理结构是数组(从1开始存储)
 *
 *
 *  小根堆操作：
 *  1.插入一个值  heap[++size] = x; up(size)或者down(它的父亲结点)?
 *  2.求最小值    heap[1];
 *  3.删除最小值  heap[1]=heap[size--]; down(1);
 *  4.删除任意一个元素 heap[k]=heap[size--];upOrDown(k)
 *  5.修改任意一个元素  heap[k]=?;upOrDown(k)
 */
public class ID06_0堆排序 {
    static int[]heap = new int[100010];
    static int size;
    //下标为u的元素的下沉操作
    static void down(int u){
        //标记下沉后的位置
        int t = u;
        //存在左孩子并且大于左孩子
        if(u * 2 <= size && heap[u * 2] < heap[t]) t = u * 2;
        //存在左孩子并且大于左孩子
        if(u * 2 + 1 <= size && heap[u * 2 + 1] < heap[t]) t = u * 2 + 1;
        //位置发生改变了
        if(t != u){
            int tmp = heap[u];
            heap[u] = heap[t];
            heap[t] = tmp;
            //再判断后来移到的那个位置是否要下沉
            down(t);
        }
    }
    static void up(int u){
        while (u / 2 >= 1 && heap[u / 2] > heap[u]){
            int tmp = heap[u];
            heap[u] = heap[u/2];
            heap[u/2] = tmp;
            u /= 2;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        String[] str2 = br.readLine().split(" ");
        size=n;
        for(int i = 1; i <= n; i++) heap[i] = Integer.parseInt(str2[i-1]);
        //建堆 只要非叶子结点的下沉操作即可
        for(int i = n/2; i >= 0; i--) down(i);
        while (m-- > 0){
            System.out.print(heap[1]+" ");
            heap[1]=heap[size--];
            down(1);
        }

    }
}
