package acwing.算法提高课.ID01动态规划.ID03背包模型;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID01采药 {
    static int[][] f = new int[110][1010];
    static int[] v = new int[1010], w = new int[110];
    static int n, m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (v[i] > j) f[i][j] = f[i - 1][j];
                    //选当前草药和不选当前草药中选择最大值
                else f[i][j] = Math.max(f[i - 1][j - v[i]] + w[i], f[i - 1][j]);
            }
        }
        System.out.println(f[n][m]);
    }
}
