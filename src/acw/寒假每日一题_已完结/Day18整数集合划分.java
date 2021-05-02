package acw.寒假每日一题_已完结;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/5 - 21:38
 * 贪心算法
 */
public class Day18整数集合划分 {
    static int []q;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        q=new int[n];
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        Arrays.sort(q);
        int N=n%2==0?0:1;
        int s1=0,s2=0;
        for(int i=0;i<n/2;i++) s1+=q[i];
        for(int i=n/2+1;i<n;i++) s2+=q[i];
        if(N==0) s2+=q[n/2];
        if(N==1){
            if(q[n/2]<0) s1+=q[n/2];
            else s2+=q[n/2];
        }
        System.out.print(N+" "+(s2-s1));
    }
}
