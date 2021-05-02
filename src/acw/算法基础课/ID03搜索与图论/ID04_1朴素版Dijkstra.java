package acw.算法基础课.ID03搜索与图论;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/28 - 16:56
 */
public class ID04_1朴素版Dijkstra {
    static final int N = 510;
    static int n, m;
    static int[][] g = new int[N][N];//稠密图(边数比较多)使用邻接矩阵
    static int[] dist = new int[N];//各个点到源点的距离
    static boolean[] st = new boolean[N];//确定到源点距离已经最短的点

    static {
        for (int i = 1; i < N; i++)
            Arrays.fill(g[i], 65536);
    }

    static int dijkstra() {
        Arrays.fill(dist, 65536);
        dist[1] = 0;
        for (int i = 0; i < n; i++) {
            int t = -1;
            //确定没确定的最短路
            for (int j = 1; j <= n; j++) {
                if (!st[j] && (t == -1 || dist[j] < dist[t]))
                    t = j;
            }
            st[t] = true;
            for (int j = 1; j <= n; j++)
                dist[j] = Math.min(dist[t] + g[t][j], dist[j]);
        }
        if (dist[n] == 65536) return -1;
        return dist[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            g[a][b] = Math.min(g[a][b], c);
        }
        System.out.println(dijkstra());
    }
}
