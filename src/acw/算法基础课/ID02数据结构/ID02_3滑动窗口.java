package acw.算法基础课.ID02数据结构;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.ArrayList;


/**
 * @author Yeah
 * @date 2021/2/25 - 16:01
 *
 *
 * 暴力做法: n*k
 *
 * 单调队列:队列中的元素保持单调性
 */
public class ID02_3滑动窗口 {
    static int[]q=new int[1000010];
    //模拟队列  队列存的的数据在数组中是索引
    static int []queue=new int[1000010];
    static int front=0,rear=0;//rear指向可插入的下标
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str1 = br.readLine().split(" ");
        int n=Integer.parseInt(str1[0]);
        int k=Integer.parseInt(str1[1]);
        String []str2=br.readLine().split(" ");
        for(int i=0;i<n;i++) q[i]=Integer.parseInt(str2[i]);
        for(int i=0;i<n;i++){
            //判断窗口第一个元素是否要出窗口
            if(front<rear&&queue[front]<i-k+1) front++;
            while(front<rear&&q[queue[rear-1]]>q[i]) rear--;
            queue[rear++]=i;
            if(i>=k-1) bw.write(q[queue[front]]+" ");
        }
        bw.write("\n");
        front=0;rear=0;
        for(int i=0;i<n;i++){
            //判断窗口第一个元素是否要出窗口
            if(front<rear&&queue[front]<i-k+1) front++;
            //保持队列的单调性
            while(front<rear&&q[queue[rear-1]]<q[i]) rear--;
            queue[rear++]=i;
            if(i>=k-1)  bw.write(q[queue[front]]+" ");
        }
        bw.flush();
    }
}
