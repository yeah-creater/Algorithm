package acwing.夏季每日一题;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID09谁是你的潜在朋友 {
    static int n, m;
    static int[] a = new int[205], cnt = new int[205];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            a[i] = t;
            cnt[t]++;

        }
        for (int i = 0; i < n; i++) {
            if (cnt[a[i]] == 1) {
                System.out.println("BeiJu");
            } else {
                System.out.println(cnt[a[i]] - 1);
            }
        }
    }
}
