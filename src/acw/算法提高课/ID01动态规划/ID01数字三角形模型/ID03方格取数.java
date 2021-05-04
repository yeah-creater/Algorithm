package acw.算法提高课.ID01动态规划.ID01数字三角形模型;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID03方格取数 {
    static final int N = 15;
    static int n;
    static int[][] w = new int[N][N];
    static int[][][] f = new int[N * 2][N][N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int a, b, c;
        while (true) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if (a == 0 || b == 0 || c == 0) break;
            w[a][b] = c;
        }
        for (int k = 2; k <= n + n; k++) {
            for (int i1 = 1; i1 <= n; i1++) {
                for (int i2 = 1; i2 <= n; i2++) {
                    int j1 = k - i1, j2 = k - i2;
                    if (j1 >= 1 && j1 <= n && j2 >= 1 && j2 <= n) {
                        int t = w[i1][j1];
                        if (i1 != i2) t += w[i2][j2];
                        int max = 0;
                        max = Math.max(max, f[k - 1][i1 - 1][i2 - 1] + t);
                        max = Math.max(max, f[k - 1][i1 - 1][i2] + t);
                        max = Math.max(max, f[k - 1][i1][i2] + t);
                        max = Math.max(max, f[k - 1][i1][i2 - 1] + t);
                        f[k][i1][i2] += max;
                    }
                }
            }
        }
        System.out.println(f[n + n][n][n]);

    }
}
