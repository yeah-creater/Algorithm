package acwing.蓝桥杯._12届蓝桥杯省赛;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: yeah
 * 完全平方数的质因数 指数都是偶数
 */
public class ID04完全平方数 {
    static HashMap<Long, Integer> map = new HashMap<>();
    static long n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        long x = n;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                int exp = 0;
                while (n % i == 0) {
                    exp++;
                    n /= i;
                }
                map.put((long) i, exp);
            }
        }
        if (n > 1) map.put(n, 1);
        long res = 1;
        for (Long i : map.keySet()) {
            if (map.get(i) % 2 == 0) {
                res *= (long) Math.pow(i, map.get(i));
            } else {
                res *= (long) Math.pow(i, map.get(i) + 1);
            }
        }
        System.out.println(res / x);
    }
}
