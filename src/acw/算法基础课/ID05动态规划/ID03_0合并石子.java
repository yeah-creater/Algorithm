package acw.算法基础课.ID05动态规划;

import java.util.Scanner;

/**
 * f[i][j]表示将第i堆石子到第j堆石子合并成一堆的合并方案
 * 状态计算：以最后两堆的分界线为边界 分成j-i+1类
 */
public class ID03_0合并石子 {
    static final int N = 310;
    static int[] q = new int[N];
    static int[] s = new int[N];
    static int[][] f = new int[N][N];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            q[i] = in.nextInt();
            s[i] = s[i - 1] + q[i];
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 1; i + len - 1 <= n; i++) {
                int l = i, r = len + i - 1;
                f[l][r] = 1000*1000*1000;
                for (int k = l; k < r; k++) {
                    f[l][r] = Math.min(f[l][r], f[l][k] + f[k + 1][r] + s[r] - s[l - 1]);
                }
            }
        }
        System.out.println(f[1][n]);
    }
}
