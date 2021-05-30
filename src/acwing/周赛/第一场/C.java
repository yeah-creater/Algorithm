package acwing.周赛.第一场;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 * 就是个找环的过程  1 2 3 4 5 6
 * 4 6 1 3 5 2
 * 1会变成 4->3->1  经过3次变为自己
 * 使用并查集 联通块
 */
public class C {
    static int t, n;
    static int[] p, res;

    static int find(int x) {
        if (x != p[x]) {
            p[x] = find(p[x]);
        }
        return p[x];
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            p = new int[n + 1];
            res = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                p[i] = i;
                res[i] = 1;
            }
            for (int i = 1; i <= n; i++) {
                int x = in.nextInt();

                if (find(x) != find(i)) {
                    res[find(i)] += res[find(x)];
                    p[find(x)] = p[find(i)];
                }
            }

            for (int i = 1; i <= n; i++) {
                bw.write(res[find(i)] + " ");
            }
            bw.newLine();
        }
        bw.flush();


    }
}
