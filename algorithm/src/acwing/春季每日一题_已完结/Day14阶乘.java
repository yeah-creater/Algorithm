package acwing.春季每日一题_已完结;

import java.util.Scanner;

/**
 * @purpose: n!的阶乘末尾有k个0
 * res= n!/10^k  %10
 */
public class Day14阶乘 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d2 = 0, d5 = 0, res = 1, x;
        for (int i = 1; i <= n; i++) {
            x = i;
            while (x % 2 == 0) {
                d2++;
                x /= 2;
            }
            while (x % 5 == 0) {
                d5++;
                x /= 5;
            }
            res = res * x % 10;
        }
        int k = Math.min(d2, d5);
        for (int i = 0; i < d2 - k; i++) res = res * 2 % 10;
        for (int i = 0; i < d5 - k; i++) res = res * 5 % 10;
        System.out.println(res);

    }
}
