package acwing.算法提高课.ID02搜索.ID03多源BFS;

import leetcode.周赛.B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author: yeah
 */
class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ID01矩阵距离 {
    static int N = 1010;
    static char[][] g = new char[N][N];
    static int[][] dist = new int[N][N];
    static int n, m;

    static void bfs() {
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], -1);
        }
        Deque<Pair> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == '1') {
                    dist[i][j] = 0;
                    q.addLast(new Pair(i, j));
                }
            }
        }
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            Pair p = q.pollFirst();
            int x = p.x;
            int y = p.y;
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i];
                int b = y + dy[i];
                if (a >= 0 && a < n && b >= 0 && b < m) {
                    if (dist[a][b] == -1) {
                        dist[a][b] = dist[x][y] + 1;
                        q.addLast(new Pair(a, b));
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            for (int j = 0; j < m; j++) {
                g[i][j] = s.charAt(j);
            }
        }
        bfs();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(dist[i][j]+" ");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
