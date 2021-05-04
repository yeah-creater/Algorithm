package acwing.算法基础课.ID05动态规划;

import java.util.Scanner;

/**
 * @purpose: 本质就是完全背包问题
 * 属性是数量
 */
public class ID04_0整数划分 {
    static final int N=1010;
    static int []f=new int[N];
    static int n;
    static final int mod=1000*1000*1000+7;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        f[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
               f[j]=(f[j]+f[j-i])%mod;
            }
        }
        System.out.println(f[n]);

    }
}
