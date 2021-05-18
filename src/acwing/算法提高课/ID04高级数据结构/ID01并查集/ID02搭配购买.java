package acwing.算法提高课.ID04高级数据结构.ID01并查集;

import java.util.Scanner;

/**
 * @author: yeah
 * <p>
 * 并查集+DP  niu
 * <p>
 * 将每个连通块看成一个物品
 * 再通过祖宗节点维护一下每个联通块的价钱与价值
 */
public class ID02搭配购买 {
    static int N = 10010;
    static int n, m, k;
    static int[] v = new int[N], w = new int[N], p = new int[N];
    static int[] f = new int[N];

    static int find(int x) {
        if (x != p[x]) p[x] = find(p[x]);
        return p[x];
    }

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) p[i] = i;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }
        while (m-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            a--;
            b--;//我是从0开始
            int pa = find(a);
            int pb = find(b);
            if (pa != pb) {
                v[pa] += v[pb];
                w[pa] += w[pb];
                p[pb] = p[pa];
            }
        }
        //01 背包
        for (int i = 0; i < n; i++) {
            if (p[i] == i) {
                for (int j = k; j >= v[i]; j--) {
                    f[j] = Math.max(f[j], f[j - v[i]] + w[i]);
                }
            }
        }
        System.out.println(f[k]);
    }
}
