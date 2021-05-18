package acwing.算法提高课.ID04高级数据结构.ID01并查集;

import java.util.Scanner;

/**
 * @author: yeah
 * <p>
 * 判断连边的两个点是否在同一个集合里
 * 将点的二维坐标映射成一维坐标  x*n+y
 */

public class ID01格子游戏 {
    static int[] p = new int[200 * 200 + 1000];
    static int n, m;

    static int find(int x) {
        if (x != p[x]) p[x] = find(p[x]);
        return p[x];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        //初始化
        for (int i = 0; i <= n * n + n; i++) {
            p[i] = i;
        }
        for (int i = 1; i <= m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            //若没有a-- 和 b-- p[max] 初始化的最大区间要更新
            //因为就不是映射成0到n*n 而是 n+1到 n*n+n
            // a--;
            // b--;
            String t = in.next();
            int x1, x2;
            if (t.equals("D")) {
                x1 = a * n + b;
                x2 = (a + 1) * n + b;
            } else {
                x1 = a * n + b;
                x2 = a * n + b + 1;
            }
            int p1 = find(x1);
            int p2 = find(x2);
            //不要比较p[x1]和p[x2] 还没路径压缩前 p[x] 并不一定是x的祖宗节点
            if (p1 == p2) {
                System.out.println(i);
                return;
            } else {
                p[p1] = p2;

            }
        }
        System.out.println("draw");
    }
}
