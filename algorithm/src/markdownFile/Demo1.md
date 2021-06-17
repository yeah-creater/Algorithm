### 最大异或和
~~just BF~~ #
<hr>
<p> Tire</p>

```java
import java.util.Scanner;

/**
 * @author: yeah
 * 先转化为两个前缀异或和(i-j<=m)的异或
 */
public class ID01最大异或和 {
    static int N = 100010 * 31, M = 100010;
    static int n, m, idx;
    static int[] q = new int[M], s = new int[M];
    static int[] cnt = new int[N];
    static int[][] son = new int[N][2];

    //N^2做法
    static long bf() {
        long max = 0;
        for (int i = 1; i <= n; i++) {
            int res = 0;
            for (int j = i; j - i + 1 <= m && j <= n; j++) {
                res ^= q[j];
                if (res > max) {
                    max = res;
                }
            }
        }
        return max;
    }

    static void insert(int x, int v) {
        int p = 0;
        for (int i = 30; i >= 0; i--) {
            int u = (x >> i) & 1;
            if (son[p][u] == 0) {
                son[p][u] = ++idx;
            }
            p = son[p][u];
            cnt[p] += v;
        }
    }

    static int query(int x) {
        int res = 0, p = 0;
        for (int i = 30; i >= 0; i--) {
            int u = (x >> i) & 1;
            if (cnt[son[p][u == 1 ? 0 : 1]] > 0) {
                p = son[p][u == 1 ? 0 : 1];
                res = res * 2 + 1;
            } else {
                p = son[p][u];
                res = res * 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            q[i] = in.nextInt();
            s[i] = s[i - 1] ^ q[i];
        }
        int res = 0;
        insert(s[0], 1);
        for (int i = 1; i <= n; i++) {
            if (i > m) {
                insert(s[i - m - 1], -1);
            }
            res = Math.max(res, query(s[i]));
            insert(s[i], 1);
        }
        System.out.println(res);

    }
}
```