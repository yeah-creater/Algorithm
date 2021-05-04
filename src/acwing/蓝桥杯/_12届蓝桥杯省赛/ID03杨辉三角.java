package acwing.蓝桥杯._12届蓝桥杯省赛;

/**
 * @author: yeah
 */

import java.util.*;

public class ID03杨辉三角 {
    static int n;

    // 求组合数
    static long C(int a, int b) {
        long res = 1;
        for (int i = a, j = 1; j <= b; i--, j++) {
            res = res * i / j;
            if (res > n) return res;
        }
        return res;
    }

    static boolean check(int k) {
        long l = k * 2, r = n;
        while (l < r) {
            long mid = l + r >> 1;
            if (C((int) mid, k) >= n) r = mid;
            else l = mid + 1;
        }

        if (C((int) r, k) != n) return false;

        System.out.println(r * (r + 1) / 2 + k + 1);

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int k = 16; ; k--)
            if (check(k)) break;
    }
}

