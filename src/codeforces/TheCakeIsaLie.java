package codeforces;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class TheCakeIsaLie {
    static int t, n, m;
    static int[][] f = new int[110][110];

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (i == 1 && j == 1) f[i][j] = 0;
                else f[i][j] = Math.min(f[i - 1][j] + j, f[i][j - 1] + i);
            }
        }
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            int k = in.nextInt();
            if (k == f[n][m]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
