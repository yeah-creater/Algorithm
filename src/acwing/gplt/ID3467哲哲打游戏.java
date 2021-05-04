package acwing.gplt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: yeah
 * 模拟
 */
public class ID3467哲哲打游戏 {
    static ArrayList<Integer>[] g = new ArrayList[100010];
    static int n, m;
    static int[] record = new int[110];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int cnt = in.nextInt();
            g[i] = new ArrayList<>();
            for (int j = 1; j <= cnt; j++) {
                g[i].add(in.nextInt());
            }
        }
        int p = 1;
        while (m-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == 0) {
                p = g[p].get(b);
            } else if (a == 1) {
                record[b] = p;
                System.out.println(p);
            } else {
                p = record[b];
            }
        }
        System.out.println(p);
    }
}
