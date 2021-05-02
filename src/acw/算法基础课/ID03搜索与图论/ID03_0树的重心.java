package acw.算法基础课.ID03搜索与图论;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/22 - 11:04
 */
public class ID03_0树的重心 {
    static final int N = 100010, M = 2 * N;
    static int[] h = new int[N];//链表头结点
    static int[] e = new int[M], next = new int[M];
    static boolean[] st = new boolean[N];
    static int idx, n, ans = N, m;

    static {
        for (int i = 0; i < N; i++) h[i] = -1;
    }

    //将a指向b(作为a链表的第一个结点)  头插法h[a]指向a的第一个结点
    static void add(int a, int b) {
        e[idx] = b;
        next[idx] = h[a];
        h[a] = idx++;
    }

    //求以u为根结点中点的数量
    static int dfs(int u) {
        st[u] = true;
        int sum = 1, res = 0;
        for (int i = h[u]; i != -1; i = next[i]) {
            int j = e[i];
            if (!st[j]) {
                int s = dfs(j);
                res = Math.max(res, s);
                sum += s;
            }
        }
        res = Math.max(res, m - sum);
        ans = Math.min(ans, res);
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = n;
        while (n-- > 1) {
            int a = in.nextInt();
            int b = in.nextInt();
            add(a, b);
            add(b, a);
        }
        dfs(1);
        System.out.println(ans);
    }
}
