package acwing.算法提高课.ID04高级数据结构.ID01并查集;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID04银河英雄传说 {
    static int N = 30010;
    static int n, m;
    static int[] p = new int[N];
    static int[] d = new int[N];//每个战舰到根结点的距离
    static int[] cnt = new int[N];//每列战舰的数量

    static int find(int x) {
        if (x != p[x]) {
            int t = find(p[x]);
            d[x] += d[p[x]];
            p[x] = t;
        }
        return p[x];
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        for (int i = 1; i <= 30000; i++) {
            p[i] = i;
            cnt[i] = 1;
            d[i] = 0;
        }
        while (m-- > 0) {
            String t = in.next();
            int a = in.nextInt();
            int b = in.nextInt();
            if (t.equals("M")) {
                int pa = find(a);
                int pb = find(b);
                //更新插入队尾的头结点的位置更新
                d[pa] = cnt[pb];
                //新的队列的数量更新
                cnt[pb] += cnt[pa];
                cnt[pa] = 0;
                p[pa] = pb;
            } else {
                if (find(a) == find(b)) {
                    System.out.println(Math.abs(d[a] - d[b]) - 1);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
