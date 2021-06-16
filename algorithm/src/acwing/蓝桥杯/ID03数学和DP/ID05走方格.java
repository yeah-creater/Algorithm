package acwing.蓝桥杯.ID03数学和DP;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/8 - 19:42
 * f[i][j]表示从1,1 走到这里的路径数 i和j不同为偶数
 */
public class ID05走方格 {
    static int n,m;
    static int[][]q=new int[35][35];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        q[1][1]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i%2==1||j%2==1){
                    q[i][j]+=q[i-1][j]+q[i][j-1];
                }
            }
        }
        System.out.println(q[n][m]);

    }
}
