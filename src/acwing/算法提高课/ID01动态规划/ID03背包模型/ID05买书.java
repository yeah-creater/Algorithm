package acwing.算法提高课.ID01动态规划.ID03背包模型;

import java.util.Scanner;

/**
 * @author: yeah
 * 完全背包问题
 * f[i][j]表示只卖前i种书且价格不超过j的方案集合
 * 属性：数量
 */
public class ID05买书 {
    static int[][] f = new int[10][1010];
    static int[] g = new int[1010];
    static int m;
    static int[] v = new int[10];

    //朴素DP
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        v[1] = 10;
        v[2] = 20;
        v[3] = 50;
        v[4] = 100;
        /*
        for (int i = 1; i <= 4; i++) f[i][0] = 1;
        f[0][0] = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 0; k * v[i] <= j; k++) {
                    f[i][j] += f[i - 1][j - k * v[i]];
                }
            }
        }
        */
        //空间优化版
        g[0] = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = v[i]; j <= m; j++) {
                g[j] += g[j - v[i]];
            }
        }
        System.out.println(g[m]);
    }
}
