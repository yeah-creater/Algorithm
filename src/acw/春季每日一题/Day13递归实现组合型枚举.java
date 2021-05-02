package acw.春季每日一题;

import java.util.Scanner;

/**
 * @purpose:
 */
public class Day13递归实现组合型枚举 {
    static int n, m;
    static int[] path = new int[50];
    static boolean[] used = new boolean[50];

    static void dfs(int u) {
        if (u == m + 1) {
            for (int i = 1; i <= m; i++)
                System.out.print(path[i] + " ");
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!used[i] && path[u - 1] < i) {
                path[u] = i;
                used[i] = true;
                dfs(u + 1);
                //还原现场
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        dfs(1);

    }
}
