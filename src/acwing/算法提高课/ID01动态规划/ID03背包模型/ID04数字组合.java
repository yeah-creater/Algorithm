package acwing.算法提高课.ID01动态规划.ID03背包模型;

import java.util.Scanner;

/**
 * @author: yeah
 * f[i][j]是从前i个数中选且和为j的方案集合
 * 属性是数量
 */
public class ID04数字组合 {
    static int n, m;
    static int[][] f = new int[110][10010];
    static int[] g = new int[10010];
    static int[] v = new int[110];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) v[i] = in.nextInt();
        for (int i = 0; i <= n; i++) f[i][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (v[i] > j) f[i][j] = f[i - 1][j];
                    //选这个数和不选这个数的和
                else f[i][j] = f[i - 1][j - v[i]] + f[i - 1][j];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= v[i]; j--) {
                g[j] += g[j - v[i]];
            }
        }
        System.out.println(g[m]);
    }
}
