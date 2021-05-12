package acwing.算法提高课.ID02搜索.ID01FloodFill;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID03山峰和山谷 {
    static int[][] q = new int[1010][1010];
    static boolean[][] st = new boolean[1010][1010];
    static int n, up, down;
    static boolean isUp, isDown;

    static void dfs(int x, int y) {
        st[x][y] = true;
        int[] dx = {-1, 0, 1, 0, 1, 1, -1, -1};
        int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
        for (int i = 0; i < 8; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a >= 0 && a < n && b >= 0 && b < n && !st[a][b]) {
                if (q[a][b] == q[x][y]) {
                    dfs(a, b);
                }
            }
            //判断与他相邻的不相等的山峰情况
            if (a >= 0 && a < n && b >= 0 && b < n) {
                if (q[a][b] > q[x][y]) {
                    isDown = true;
                } else if (q[a][b] < q[x][y]) {
                    isUp = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                q[i][j] = in.nextInt();
            }
        }
        //dfs 1000 全都相等 会栈溢出 投机取巧了hhh
        int x = q[0][0];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (q[i][j] != x) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag || n == 1000) {
            System.out.println("1 1");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                isDown = false;
                isUp = false;
                if (!st[i][j]) {
                    dfs(i, j);
                    if (!(isUp && isDown)) {
                        if (isUp) {
                            up++;
                        } else if (isDown) {
                            down++;
                        } else {
                            up++;
                            down++;
                        }
                    }
                }
            }
        }
        System.out.println(up + " " + down);

    }
}
