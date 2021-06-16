package acwing.算法基础课.ID04数学知识;


import java.util.Scanner;

/**
 * @purpose:预处理求组合数 Cab=fact[a]*infact[b-a]*infact[b]  infact是逆元
 */
public class ID08_1求组合数II {
    static final int N = 100010;
    static final int mod = 1000 * 1000 * 1000 + 7;
    static long[] fact = new long[N], infact = new long[N];

    static long qmi(long a, long k, long p) {
        long res = 1;
        while (k > 0) {
            if ((k & 1) == 1) res = res % mod * a % mod;
            a = a % mod * a % mod;
            k >>= 1;
        }
        return res % p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fact[0] = infact[0] = 1;
        for (int i = 1; i < N; i++) {
            fact[i] = fact[i - 1] * i % mod;
            infact[i] = infact[i - 1] * qmi(i, mod - 2, mod)%mod;
        }
        int n = in.nextInt();
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(fact[a] * infact[a - b] % mod * infact[b] % mod);
        }

    }
}
