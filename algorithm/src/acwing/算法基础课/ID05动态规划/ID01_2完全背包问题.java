package acwing.算法基础课.ID05动态规划;


import java.util.Scanner;

/**
 * @purpose:
 * 状态计算：第i个物品选选多少个来划分
 */
public class ID01_2完全背包问题 {
    static final int N=1010;
    static int[]v=new int[N],w=new int[N];
    static int[][]f=new int[N][N];
    static int n,m;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        for(int i=1;i<=n;i++){
            v[i]=in.nextInt();
            w[i]=in.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                f[i][j]=f[i-1][j];
                if(j>=v[i])
                    f[i][j]=Math.max(f[i-1][j],f[i][j-v[i]]+w[i]);
            }
        }
        System.out.println(f[n][m]);
    }
}
