package acwing.算法提高课.ID02搜索.ID02最短路模型;

import java.util.*;

public class ID03武士风度的牛 {
    static int N = 160;
    static char[][] g = new char[N][N];
    static int n, m;
    static int[][] dist = new int[N][N];//dist[i][j]表示起点start到(i,j)的跳跃次数
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static Pair2 start;
    static Pair2 end;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            g[i] = sc.next().toCharArray();
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 'K') {
                    start = new Pair2(i, j);
                } else if (g[i][j] == 'H') {
                    end = new Pair2(i, j);
                }
            }
        }
        int res = bfs();
        System.out.println(res);
    }

    private static int bfs() {
        Queue<Pair2> q = new LinkedList<>();
        q.add(start);
        dist[start.x][start.y] = 0;
        while (!q.isEmpty()) {
            Pair2 t = q.poll();
            for (int i = 0; i < 8; i++) {
                int x = t.x + dx[i];
                int y = t.y + dy[i];
                if (x < 0 || x >= n || y < 0 || y >= m) continue;
                if (g[x][y] == '*') continue;
                if (dist[x][y] != 0) continue;//说明(x,y)之前计算过
                dist[x][y] = dist[t.x][t.y] + 1;
                if (x == end.x && y == end.y) return dist[x][y];
                q.add(new Pair2(x, y));
            }
        }
        return -1;
    }
}

class Pair2 {
    int x;
    int y;

    public Pair2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

