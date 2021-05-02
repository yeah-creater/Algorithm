package acw.算法基础课.ID05动态规划;

import java.util.Scanner;

/**
 * @purpose:
 * 每个物品的数量有限制
 */
public class ID01_3多重背包问题I {
    static final int N=1010;
    static int[]v=new int[N],w=new int[N],s=new int[N];
    static int[][]f=new int[N][N];
    static int n,m;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        for(int i=1;i<=n;i++){
            v[i]=in.nextInt();
            w[i]=in.nextInt();
            s[i]=in.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                for(int k=0;k<=s[i]&&k*v[i]<=j;k++){
                    f[i][j]=Math.max(f[i][j],f[i-1][j-k*v[i]]+k*w[i]);
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
