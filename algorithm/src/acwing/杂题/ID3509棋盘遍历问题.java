package acwing.杂题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3509棋盘遍历问题 {
    static int n, m, cnt;
    static long sta, end;
    static int[][] q;
    static boolean[][] st;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    static boolean dfs(int x, int y) {
        end = System.currentTimeMillis();
        if (end - sta >= 500) {
            return false;
        }
        if (cnt == n * m) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a >= 0 && a < n && b >= 0 && b < m && !st[a][b]) {
                st[a][b] = true;
                cnt++;
                if (dfs(a, b)) {
                    return true;
                }
                st[a][b] = false;
                cnt--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true) {
            n = in.nextInt();
            m = in.nextInt();
            sta = System.currentTimeMillis();
            if ((n == 1 || m == 1) && (n != m)) {
                System.out.println("N");
            } else if (n == m && n == 1) {
                System.out.println("Y");
            } else {
                q = new int[n][m];
                st = new boolean[n][m];
                cnt = 0;
                if (dfs(0, 0)) {
                    System.out.println("Y");
                } else {
                    System.out.println("N");
                }
            }
        }

    }
}
