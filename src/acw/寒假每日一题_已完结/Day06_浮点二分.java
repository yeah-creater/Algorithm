package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/24 - 21:32
 * 用浮点数二分
 * 直接上手有点难度
 * 题目是要求最长的绳子长度，但最长的绳子长度有点难求
 * 换一种思维：二分最后绳子的长度(肯定不超过最长的那条绳子)，然后再每个绳子切一切，看总共能且多少条
 */
public class Day06_浮点二分 {
    static double []q=new double[100010];
    static int n;
    static int m;
    //检测长度为x是否满足条件
    static boolean check(double x){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=q[i]/x;
        }
        return sum>=m;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        double max=0;
        for(int i=0;i<n;i++){
            q[i]=in.nextDouble();
            if(q[i]>max)
                max=q[i];
        }
        double l=0,r=max;
        while (r-l>0.0001){
            double mid=(r+l)/2;
            if(check(mid)) l=mid;
            else r=mid;
        }
        System.out.printf("%.2f",l);
    }
}
