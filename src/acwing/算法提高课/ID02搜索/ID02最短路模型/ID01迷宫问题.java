
package acwing.算法提高课.ID02搜索.ID02最短路模型;

import codeforces.CodeforcesRound719.E;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author: yeah
 * bfs即可
 */
class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ID01迷宫问题 {
    static int[][] qq = new int[1010][1010];
    static boolean[][] used = new boolean[1010][1010];
    static StringBuilder[][] dis = new StringBuilder[1010][1010];
    static int n;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    static void bfs() {
        Deque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0, 0));
        used[0][0] = true;
        dis[0][0] = new StringBuilder("0 0");
        while (!q.isEmpty()) {
            Pair pair = q.pollFirst();
            for (int i = 0; i < 4; i++) {
                int a = pair.x + dx[i];
                int b = pair.y + dy[i];
                if (a >= 0 && a < n && b >= 0 && b < n && !used[a][b]) {
                    if (qq[a][b] == 0) {
                        q.add(new Pair(a, b));
                        used[a][b] = true;
                        dis[a][b] = new StringBuilder(dis[pair.x][pair.y] + "\n" + a + " " + b);
                        if (a == n - 1 && b == n - 1) return;
                    }
                }
            }
            dis[pair.x][pair.y] = null;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                qq[i][j] = in.nextInt();
            }
        }
        bfs();
        bw.write(dis[n - 1][n - 1].toString());
        bw.flush();
    }
}
