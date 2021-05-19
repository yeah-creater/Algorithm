package acwing.算法提高课.ID04高级数据结构.ID01并查集;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: yeah
 * 离散化 -> (条件顺序不影响答案，所以先要考虑所以的相等的约束，再考虑不相等的约束就不会有矛盾了))
 */
class Query {
    int kind;

    public Query(int kind, int x, int y) {
        this.kind = kind;
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
}

public class ID03程序自动分析 {
    static int t, n, m;//m为离散化的最大值
    //保存每个点的祖宗节点
    static int[] p = new int[200010];
    static Query[] q = new Query[100010];
    static HashMap<Integer, Integer> S = new HashMap<>();

    //得到离散化的值
    static int get(int x) {
        if (S.get(x) == null) {
            S.put(x, ++m);
        }
        return S.get(x);
    }

    static int find(int x) {
        if (x != p[x]) p[x] = find(p[x]);
        return p[x];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            S.clear();
            m = 0;
            int e, x, y;
            for (int i = 0; i < n; i++) {
                x = in.nextInt();
                y = in.nextInt();
                e = in.nextInt();
                q[i] = new Query(e, get(x), get(y));
            }
            for (int i = 1; i <= m; i++) {
                p[i] = i;
            }
            //合并相等的约束
            for (int i = 0; i < n; i++) {
                if (q[i].kind == 1) {
                    x = q[i].x;
                    y = q[i].y;
                    int px = find(x);
                    int py = find(y);
                    p[py] = px;
                }
            }
            //不相等约束的检查
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (q[i].kind == 0) {
                    x = q[i].x;
                    y = q[i].y;
                    if (find(x) == find(y)) {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) System.out.println("YES");
        }
    }
}
