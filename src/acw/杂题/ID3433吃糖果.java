package acw.杂题;

import java.util.Scanner;

/**
 * @author: yeah
 * f[i][j] 表示吃完i个巧克力 用j天的方案数
 * f[i][j]=f[i-1][j-1]+f[i-2][j-1]
 */
public class ID3433吃糖果 {
    static int n, left, cnt;
    static int[][] f = new int[30][30];

    //暴搜  时间复杂度 2^n
    static void dfs() {
        if (left == 0) {
            cnt++;
            return;
        }
        for (int i = 1; i <= 2; i++) {
            if (i == 2) {
                if (left > 1) {
                    left -= 2;
                    dfs();
                    left += 2;
                }
            } else {
                left -= 1;
                dfs();
                left += 1;
            }
        }
    }

    //DP  时间复杂度 n^2
    static int dp() {
        f[0][0] = 1;
        f[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                f[i][j] = f[i - 1][j - 1] + f[i - 2][j - 1];
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += f[n][i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(dp());
    }
}
