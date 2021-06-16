package acwing.算法基础课.ID05动态规划;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/26 - 23:54
 * 01背包问题
 * f[i][j]表示在j时间内选择前i个草药的最大价值
 */
public class ID01_1采药 {
    static int n, m;
    static int[] t = new int[110];//时间
    static int[] v = new int[110];//价值
    static int[][] f = new int[110][1010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            t[i] = in.nextInt();
            v[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f[i][j] = f[i - 1][j];
                if(j>=t[i])
                    f[i][j] = Math.max(f[i - 1][j], v[i] + f[i - 1][j - t[i]]);

            }
        }
        System.out.println(f[n][m]);
    }
}
