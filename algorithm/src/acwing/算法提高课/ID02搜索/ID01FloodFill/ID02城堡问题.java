package acwing.算法提高课.ID02搜索.ID01FloodFill;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID02城堡问题 {
    static int n, m;
    static int[][] g = new int[55][55];
    static boolean[][] st = new boolean[55][55];

    static int dfs(int x, int y) {
        st[x][y] = true;
        int area = 1, val = g[x][y];
        //按照左上右下的顺序
        int[] dx = {0, -1, 0, 1}, dy = {-1, 0, 1, 0};
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            //用二进制判断上下左右哪几个方向是连通的 即不为二进制不为1
            if (a >= 0 && a < n && b >= 0 && b < m && (((val >> i) & 1) == 0) && !st[a][b]) {
                area += dfs(a, b);
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = in.nextInt();
            }
        }
        int cnt = 0, area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!st[i][j]) {
                    cnt++;
                    area = Math.max(area, dfs(i, j));
                }
            }
        }
        System.out.println(cnt);
        System.out.println(area);
    }
}
