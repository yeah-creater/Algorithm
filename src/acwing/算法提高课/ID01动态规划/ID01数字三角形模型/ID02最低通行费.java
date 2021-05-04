package acwing.算法提高课.ID01动态规划.ID01数字三角形模型;

import java.util.Scanner;

/**
 * @author: yeah
 * f[i][j] 表示从（1,1）到（i,j）数量
 * 商人必须在(2N-1)个单位时间穿越出去:说明只能向下或向右走
 */
public class ID02最低通行费 {
    static int n;
    static int N = 110;
    static int[][] w = new int[N][N], f = new int[N][N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        //初始化边界
        for (int i = 0; i <= n; i++) {
            f[i][0] = 65536;
            f[0][i] = 65536;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                w[i][j] = in.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                f[i][j] = Math.min(f[i - 1][j], f[i][j - 1]) + w[i][j];
            }
        }
        System.out.println(f[n][n]);
    }
}

