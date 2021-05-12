package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID03序列最大收益 {
    static int n, k, m;
    static int[][] w = new int[210][210];
    static int[] q = new int[210];
    //前i个数中去掉了j个数，且保留第i个数的所有方案中的最大收益
    static int[][] f = new int[210][210];


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= m; i++) {
            q[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                w[i][j] = in.nextInt();
            }
        }

        int res = 0;
        for (int i = 2; i <= m; i++) {
            for (int j = 1; j <= k; j++) {
                for (int u = 1; u < i; u++) {
                    if (j >= i - u + 1) {
                        f[i][j] = Math.max(f[i][j], f[i - u][j - (i - u - 1)] + w[q[u]][q[i]]);
                    }
                }
            }
        }
        for (int i = 0; i < k; i++) {
            res = Math.max(res, f[m][i]);
        }
        System.out.println(res);
    }
}
