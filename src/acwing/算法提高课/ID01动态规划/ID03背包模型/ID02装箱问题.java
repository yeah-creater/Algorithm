package acwing.算法提高课.ID01动态规划.ID03背包模型;

import java.util.Scanner;

/**
 * @author: yeah
 * f[i][j]表示只选前i个物品且体积不超过j
 */
public class ID02装箱问题 {
    static int[][] f = new int[35][20010];
    static int[] v = new int[35];
    static int n, m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            v[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (v[i] > j) f[i][j] = f[i - 1][j];
                else f[i][j] = Math.max(f[i - 1][j - v[i]] + v[i], f[i - 1][j]);
            }
        }
        System.out.println(m - f[n][m]);
    }
}
