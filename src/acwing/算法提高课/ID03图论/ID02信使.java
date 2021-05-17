package acwing.算法提高课.ID03图论;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 * 其实就是求源点到各个点的最大值
 */
public class ID02信使 {
    static final int N = 110;
    static int[][] g = new int[N][N];
    static int[] dist = new int[N];
    static boolean[] st = new boolean[N];
    static int n, m;

    static void init() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                g[i][j] = i == j ? 0 : 65536;
            }
        }
    }

    static void dijkstra() {
        Arrays.fill(dist, 65536);
        dist[1] = 0;
        for (int i = 0; i < n; i++) {
            int t = -1;
            for (int j = 1; j <= n; j++) {
                if (!st[j] && (t == -1 || dist[j] < dist[t])) {
                    t = j;
                }
            }
            st[t] = true;
            for (int k = 1; k <= n; k++) {
                dist[k] = Math.min(dist[k], dist[t] + g[t][k]);
            }
        }
    }


    public static void main(String[] args) {
        init();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        while (m-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            g[a][b] = g[b][a] = k;

        }
        dijkstra();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] >= max) max = dist[i];
        }
        if (max == 65536) max = -1;
        System.out.println(max);
    }

}
