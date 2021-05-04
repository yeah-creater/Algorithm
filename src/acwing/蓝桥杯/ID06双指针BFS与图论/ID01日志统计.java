package acwing.蓝桥杯.ID06双指针BFS与图论;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/13 - 15:40
 * 排序+双指针
 */
class PII implements Comparable{
    int t;
    int id;

    public PII(int t, int id) {
        this.t = t;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        PII last=(PII)o;
        return last.t<t?1:-1;
    }

    @Override
    public String toString() {
        return "PII{" +
                "t=" + t +
                ", id=" + id +
                '}';
    }
}
public class ID01日志统计 {
    static int n,d,k;
    static PII []log;
    static int []cnt=new int[100010];//记录每个帖子在指定时间段内出现的次数
    static boolean []st=new boolean[100010];//记录每个帖子是否是热帖
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        d=in.nextInt();
        k=in.nextInt();
        log=new PII[n];
        for(int i=0;i<n;i++){
            int t=in.nextInt();
            int id=in.nextInt();
            log[i]=new PII(t,id);
        }
        Arrays.sort(log);
        //System.out.println(Arrays.toString(log));
        // i为尾指针
        for(int i=0,j=0;i<n;i++){
            int id=log[i].id;
            cnt[id]++;
            while (log[i].t-log[j].t>=d){
                cnt[log[j].id]--;
                j++;
            }
            if(cnt[id]>=k) st[id]=true;
        }
        for(int i=0;i<=100000;i++){
            if(st[i]) System.out.println(i);
        }


    }
}
