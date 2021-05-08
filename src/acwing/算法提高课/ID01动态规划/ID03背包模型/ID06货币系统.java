package acwing.算法提高课.ID01动态规划.ID03背包模型;

import java.util.Scanner;

/**
 * @author: yeah
 * 完全背包问题
 * f[i][j]表示只用前i个币凑成j方案数
 */
public class ID06货币系统 {
    static int n, m;
    static int[][] f = new int[20][3010];
    static int[] v = new int[20];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        //属性为数量时 要初始化一些值
        for (int i = 0; i <= n; i++) f[i][0] = 0;
        for (int i = 1; i <= n; i++) v[i] = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 0; k * v[i] <= j; k++) {
                    f[i][j] += f[i - 1][j - k * v[i]];
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
