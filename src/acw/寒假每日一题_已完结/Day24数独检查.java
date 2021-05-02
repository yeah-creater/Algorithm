package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/10 - 20:41
 */
public class Day24数独检查 {
    static int[][] q = new int[40][40];

    static boolean check(int n) {
        boolean[] visit;
        //行
        for (int i = 1; i <= n * n; i++) {
            visit = new boolean[40];
            for (int j = 1; j <= n * n; j++) {
                if (q[i][j] > n * n || q[i][j] < 0 || visit[q[i][j]])//visi写在后面，防止数组越界
                    return false;
                visit[q[i][j]] = true;
            }

        }
        //列
        for (int i = 1; i <= n * n; i++) {
            visit = new boolean[40];
            for (int j = 1; j <= n * n; j++) {
                if (q[j][i] > n * n || q[j][i] < 1 || visit[q[j][i]])
                    return false;
                visit[q[j][i]] = true;
            }

        }

        //小方块
        for (int x = 1; x <= n * n; x += n) {
            for (int y = 1; y <= n * n; y += n) {
                visit = new boolean[40];
                for (int dx = 0; dx < n; dx++) {
                    for (int dy = 0; dy < n; dy++) {
                        int t = q[dx + x][dy + y];
                        if (t > n * n || t < 1 || visit[t])
                            return false;
                        visit[t] = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = 1;
        while (n-- > 0) {
            int m = in.nextInt();
            for (int i = 1; i <= m * m; i++)
                for (int j = 1; j <= m * m; j++)
                    q[i][j] = in.nextInt();
            if (check(m)) System.out.println("Case #" + index + ": Yes");
            else System.out.println("Case #" + index + ": No");
            index++;

        }
    }
}
