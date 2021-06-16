package acwing.算法基础课.ID03搜索与图论;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/11 - 15:35
 */
public class ID02_3抓住那头牛 {
    static int n, k;
    static boolean[] visit = new boolean[100010];
    static int[] cnt = new int[100010];

    static int bfs(int x) {
        Deque<Integer> queue = new ArrayDeque();
        queue.add(x);
        visit[x] = true;
        while (!queue.isEmpty()) {
            Integer v = queue.pollFirst();
            if (v == k) return cnt[v];
            int[] d = {1, v, -1};
            for (int i = 0; i < 3; i++) {
                int next = v + d[i];
                if (next >= 0 && next <= 100000 && !visit[next]) {
                    queue.add(next);
                    visit[next] = true;
                    cnt[next] = cnt[v] + 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        System.out.println(bfs(n));

    }
}
