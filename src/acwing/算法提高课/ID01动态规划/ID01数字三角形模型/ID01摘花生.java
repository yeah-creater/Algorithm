package acwing.算法提高课.ID01动态规划.ID01数字三角形模型;

import java.util.Scanner;

/**
 * @author: yeah
 *  f[i][j] 表示从（1,1）到（i,j）的方案数
 */
public class ID01摘花生 {
    static int n, m;
    static int N = 110;
    static int[][] w = new int[N][N], f = new int[N][N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    w[i][j] = in.nextInt();
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]) + w[i][j];
                }
            }
            System.out.println(f[n][m]);
        }
    }
}
