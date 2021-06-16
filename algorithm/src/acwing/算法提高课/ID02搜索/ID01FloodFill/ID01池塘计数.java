package acwing.算法提高课.ID02搜索.ID01FloodFill;

import java.util.Deque;
import java.util.Scanner;

/**
 * @author: yeah
 * floodFill 问题dfs即可
 */
public class ID01池塘计数 {
    static char[][] f = new char[1010][1010];
    static int n, m, res;

    //每个单元格视为与其上、下、左、右、左上、右上、左下、右下八个邻近单元格相连。
    static void dfs(int x, int y) {
        f[x][y] = '.';
        int[] dx = {-1, 0, 1, 0, 1, 1, -1, -1};
        int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
        for (int i = 0; i < 8; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a >= 0 && a < n && b >= 0 && b < m && f[a][b] == 'W') {
                dfs(a, b);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            for (int j = 0; j < m; j++) {
                f[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (f[i][j] == 'W') {
                    dfs(i, j);
                    res++;
                }
            }
        }
        System.out.println(res);

    }
}
