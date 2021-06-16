package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 * 意思就是可以使某一段 变为可选(原本是可选的还是可选)，再加上其他原本就是可选的
 */
public class ID02最大的和 {
    static int n, k;
    static long[] q = new long[100010], s = new long[100010];
    static long[] tmp = new long[100010], ts = new long[100010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        for (int i = 1; i <= n; i++) {
            q[i] = in.nextInt();
            s[i] = s[i - 1] + q[i];
        }
        for (int i = 1; i <= n; i++) {
            int t = in.nextInt();
            tmp[i] = t == 1 ? q[i] : 0;
            ts[i] = ts[i - 1] + tmp[i];
        }
        long max = 0;

        for (int i = n; i >= k; i--) {
            //变为可选的加上原本就是可选的
            max = Math.max((long) (s[i]) - s[i - k] + ts[i - k] + ts[n] - ts[i], max);
        }
        System.out.println(max);

    }
}
