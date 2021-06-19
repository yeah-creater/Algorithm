package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 * 是子序列，所以2个相等的数不相邻即可
 */
public class ID29回文子序列 {
    static int t, n;
    static int[] q = new int[5010];
    static int[] cnt = new int[5010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            for (int i = 0; i < n; i++) {
                q[i] = in.nextInt();
            }
            cnt = new int[5010];
            int i;
            for (i = 0; i < n; i++) {
                cnt[q[i]]++;
                if (cnt[q[i]] > 1) {
                    if (q[i - 1] != q[i] || cnt[q[i]] > 2) {
                        System.out.println("YES");
                        break;
                    }
                }
            }
            if (i == n) {
                System.out.println("NO");
            }
        }
    }
}
