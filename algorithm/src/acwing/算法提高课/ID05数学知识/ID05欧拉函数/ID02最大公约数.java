package acwing.算法提高课.ID05数学知识.ID05欧拉函数;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID02最大公约数 {
    static int N = 10000010;
    static boolean[] st = new boolean[N];
    static long[] primes = new long[N], phi = new long[N], phis = new long[N];
    static int cnt;
    static long res = 0;

    //筛欧拉函数
    static void init(int n) {
        phi[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (!st[i]) {
                primes[cnt++] = i;
                phi[i] = i - 1;
            }
            for (int j = 0; primes[j] * i <= n; j++) {
                st[(int) (primes[j] * i)] = true;
                if (i % primes[j] == 0) {
                    phi[(int) (i * primes[j])] = phi[i] * primes[j];
                    break;
                }
                phi[(int) (i * primes[j])] = phi[i] * (primes[j] - 1);
            }
        }
        for (int i = 2; i <= n; i++) {
            phis[i] = phis[i - 1] + phi[i];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        init(n);
        for (int i = 0; i < cnt; i++) {
            int p = (int) primes[i];
            res += phis[n / p] * 2L + 1;
        }
        System.out.println(res);
    }
}
