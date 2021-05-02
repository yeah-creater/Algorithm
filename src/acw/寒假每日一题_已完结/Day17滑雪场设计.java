package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/5 - 20:51
 * 思路：调整后的山峰肯定是在0到100范围内  因为如果小于0的话，肯定可以是等于0 ，这样代价比较小，100是同理
 *      所以方法 1 ：枚举所有可能的区间  0~17 1~18 ...    (反思：自己还是不能抽象化问题 转化成数轴上的区间问题)
 */
public class Day17滑雪场设计 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []m=new int[n];
        long fCost=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) m[i]=in.nextInt();
        for(int l=0;l<=83;l++){
            int r=l+17;
            long cost=0;
            for(int i=0;i<n;i++){
                if(m[i]<l) cost+=(l-m[i])*(l-m[i]);
                if(m[i]>r) cost+=(m[i]-r)*(m[i]-r);
            }
            fCost=Math.min(cost,fCost);
        }
        System.out.println(fCost);
    }
}
