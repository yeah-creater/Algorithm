package acwing.夏季每日一题;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID04不同路径数 {
    static int n, m, k;
    static int[][] q = new int[10][10];
    static HashSet<String> set = new HashSet<>();
    static StringBuilder sb;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    static void dfs(int x, int y, int u) {
        if (u == k + 1) {
            set.add(sb.toString());
            return;
        }
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a >= 0 && a < n && b >= 0 && b < m) {
                sb.append(q[x][y]);
                dfs(a, b, u + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                q[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb = new StringBuilder("");
                dfs(i, j, 0);
            }
        }
        System.out.println(set.size());

    }
}
