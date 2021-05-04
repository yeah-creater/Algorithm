package acwing.算法基础课.ID05动态规划;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @purpose: 线性DP
 */
public class ID02_0数字三角形 {
    static final int N = 510;
    static int[][] q = new int[N][N];

    public static void main(String[] args) {
        for(int i=0;i<N;i++) Arrays.fill(q[i],-65536);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                q[i][j] = in.nextInt();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //从左上方或右上方下来
                q[i][j] += Math.max(q[i - 1][j - 1], q[i - 1][j]);
            }
        }
        int max = 0;
        for(int i=1;i<=n;i++)
            if(q[n][i]>max) max=q[n][i];
        System.out.println(max);

    }
}
