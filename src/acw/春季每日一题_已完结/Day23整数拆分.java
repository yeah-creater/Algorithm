package acw.春季每日一题_已完结;

import java.util.Scanner;

/**
 * 是一个完全背包问题
 */
public class Day23整数拆分 {
    static final int MOD=1000*1000*1000;
    static final int N=20;
    static int []f=new int[1000010];//log(1000000)不超过20

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        f[0]=1;
        //枚举物品
        for(int i=1;i<=n;i*=2){
            //枚举体积
            for(int j=i;j<=n;j++){
                f[j]=(f[j]+f[j-i])%MOD;
            }
        }
        System.out.println(f[n]);
    }
}
