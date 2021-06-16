package acwing.算法提高课.ID05数学知识.ID05欧拉函数;

/**
 * @author: yeah
 * 欧拉函数定义:f(n) 为1到n中与n互质的数的个数 即有多少个数和n的最大公约数为1
 * <p>
 * 筛欧拉函数 f(i) 若 p为i的最小质因数 那么f(i*p) =f(i) *p
 */

import java.util.Scanner;

/**
 * 可见的点：所有能被照到的点和x和y的最大公约数是1 即互斥
 */
public class ID01可见的点 {
    static int N = 1010;
    static boolean[] st = new boolean[N];
    static int[] primes = new int[N], phi = new int[N], phis = new int[N];
    static int cnt;

    //筛欧拉函数
    static void init(int n) {
        phi[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (!st[i]) {
                primes[cnt++] = i;
                phi[i] = i - 1;
            }
            for (int j = 0; primes[j] * i <= n; j++) {
                st[primes[j] * i] = true;
                if (i % primes[j] == 0) {
                    phi[i * primes[j]] = phi[i] * primes[j];
                    break;
                }
                phi[i * primes[j]] = phi[i] * (primes[j] - 1);
            }
        }
    }

    public static void main(String[] args) {
        init(1000);
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 1000; i++) {
            phis[i] = phis[i - 1] + phi[i];
        }
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();
            System.out.println(i + " " + n + " " + phis[n] * 2 + 1);
        }
    }
}
