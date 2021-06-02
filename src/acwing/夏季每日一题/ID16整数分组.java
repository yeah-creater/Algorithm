package acwing.夏季每日一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID16整数分组 {
    static int n, m;
    static int[] q = new int[5010];
    //q表示从前i个数中选j组
    static int[][] f = new int[5010][5010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            q[i] = in.nextInt();
        }
        Arrays.sort(q, 1, n + 1);
        for (int i = 1, k = 1; i <= n; i++) {
            while (q[i] - q[k] > 5) {
                k++;
            }
            for (int j = 1; j <= m; j++) {
                f[i][j] = Math.max(f[i - 1][j], f[k - 1][j - 1] + (i - k + 1));
            }
        }
        System.out.println(f[n][m]);
    }
}
