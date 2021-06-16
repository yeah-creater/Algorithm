package acwing.算法提高课.ID01动态规划.ID01数字三角形模型;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID04传纸条 {
    static int n, m;
    static int[][] q = new int[55][55];
    static int[][][] f = new int[110][55][55];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                q[i][j] = in.nextInt();
            }
        }
        for (int k = 2; k <= n + m; k++) {
            for (int i1 = 1; i1 <= n; i1++) {
                for (int i2 = 1; i2 <= n; i2++) {
                    int j1 = k - i1;
                    int j2 = k - i2;
                    if (j1 >= 1 && j1 <= m && j2 >= 1 && j2 <= m) {
                        int t = q[i1][j1];
                        if (i1 != i2) t += q[i2][j2];
                        int max = 0;
                        max = Math.max(max, f[k - 1][i1 - 1][i2 - 1] + t);
                        max = Math.max(max, f[k - 1][i1 - 1][i2] + t);
                        max = Math.max(max, f[k - 1][i1][i2] + t);
                        max = Math.max(max, f[k - 1][i1][i2 - 1] + t);
                        f[k][i1][i2] += max;
                        System.out.println(max);
                    }
                }
            }
        }
        System.out.println(f[n + m][n][n]);
    }
}
