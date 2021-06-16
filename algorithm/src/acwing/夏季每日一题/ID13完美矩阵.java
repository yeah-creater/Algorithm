package acwing.夏季每日一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 *  保证4个角的元素相等
 */
public class ID13完美矩阵 {
    static int t, n, m;
    static int[][] q = new int[110][110];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            long res = 0;
            n = in.nextInt();
            m = in.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    q[i][j] = in.nextInt();
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    int[] a = new int[4];
                    a[0] = q[i][j];
                    a[1] = q[i][m - j + 1];
                    a[2] = q[n - i + 1][j];
                    a[3] = q[n - i + 1][m - j + 1];
                    Arrays.sort(a);
                    for (int k = 0; k < 4; k++) {
                        res += Math.abs(a[k] - a[1]);
                    }
                }
            }
            System.out.println(res/4);

        }
    }
}
