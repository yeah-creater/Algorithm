package acwing.算法基础课.ID02数据结构;

import java.util.*;
import java.io.*;
/**
 * @author Yeah
 * @date 2021/2/27 - 13:46
 *
 * 对于前缀和 下标为i  要减去前面的j  满足i-j<=m 并且s[i]-s[j]最大
 */
public class ID02_4最大子序和 {
    static int[]q=new int [300010];
    static int []s=new int [300010];//前缀和
    static Deque<Integer> deque=new ArrayDeque<>();//存储前缀和下标
    public static void main(String[]args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String[]str1=br.readLine().split(" ");
        int n=Integer.parseInt(str1[0]);
        int m=Integer.parseInt(str1[1]);
        String[]str2=br.readLine().split(" ");
        for(int i=1;i<=n;i++){
            q[i]=Integer.parseInt(str2[i-1]);
            s[i]=s[i-1]+q[i];
        }
//        for(int i=1;i<=n;i++)
//            System.out.print(s[i]+" ");
        int res=Integer.MIN_VALUE;
        //初始队列编号为0 s[0]=0;
        deque.offerLast(0);
        //单调增队列
        for(int i=1;i<=n;i++){
            if(i-deque.peek()>m) deque.pollFirst();
            res=Math.max(res,s[i]-s[deque.peekFirst()]);
            while (!deque.isEmpty()&&s[i]<=s[deque.getLast()]) deque.pollLast();
            deque.addLast(i);
        }
        System.out.println(res);

    }
}
