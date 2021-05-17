package acwing.算法提高课.ID03图论;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author: yeah
 */
public class ID01热浪 {
    static int N = 2505;
    static int n, m, sta, ed;
    static int[][] g = new int[N][N];
    static int[] dist = new int[N];
    static boolean[] st = new boolean[N];

    static void init() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                g[i][j] = 63336;
            }
        }
    }

    static void dijkstra() {
        Arrays.fill(dist,65536);
        //源点到各个点的距离
        dist[sta] = 0;
        //进行的次数
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

    public static void main(String[] args) throws Exception {
        init();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        sta = Integer.parseInt(s[2]);
        ed = Integer.parseInt(s[3]);
        while (m-- > 0) {
            String[] s1 = br.readLine().split(" ");
            int a = Integer.parseInt(s1[0]);
            int b = Integer.parseInt(s1[1]);
            int c = Integer.parseInt(s1[2]);
            g[a][b] = g[b][a] = c;
        }
        dijkstra();
        System.out.println(dist[ed]);
    }
}
