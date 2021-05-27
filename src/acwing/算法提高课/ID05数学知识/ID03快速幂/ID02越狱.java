package acwing.算法提高课.ID05数学知识.ID03快速幂;

import java.util.Scanner;

/**
 * @author: yeah
 * 总的方案数是   m^n  - m*(m-1)*(m-1)...  一共n项
 * (m^(n-1)-(m-1)^n-1)*m
 */
public class ID02越狱 {
    static int P = 100003;
    static long n, m;

    static long qmi(long a, long b, long mod) {
        long res = 1 % mod;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % mod;
            }
            b >>= 1;
            a = a * a % mod;
        }
        return res * m % mod;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        long res = qmi(m, n - 1, P) - qmi(m - 1, n - 1, P);
        System.out.println((res + P) % P);
    }
}
