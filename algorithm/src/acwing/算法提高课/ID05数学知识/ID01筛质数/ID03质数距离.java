package acwing.算法提高课.ID05数学知识.ID01筛质数;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 * 一个数n若是合数 则必然存在 一个 质因子<= 根号 n
 */
public class ID03质数距离 {
    static int N = 1000010;
    static boolean[] st = new boolean[N];
    static long[] primes = new long[N];
    static int  idx;

    static void init(int n) {
        idx = 0;
        st = new boolean[N];
        for (int i = 2; i <= n; i++) {
            if (!st[i]) {
                primes[idx++] = i;
                for (int j = i + i; j <= n; j+=i) {
                    st[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            init(50000);
            int l = in.nextInt();
            int r = in.nextInt();
            Arrays.fill(st, false);
            for (int i = 0; i < idx; i++) {
                long p = primes[i];

                //p的大于1整数倍筛掉
                for (long j = Math.max((l + p - 1) / p * p, p * 2); j <= r; j += p) {
                    st[(int) (j - l)] = true;
                }
            }
            idx = 0;
            for (int i = 0; i <= r - l; i++) {
                if (!st[i] && i + l >= 2) {
                    primes[idx++] = i + l;
                }
            }
            if (idx < 2) {
                System.out.println("There are no adjacent primes.");
            } else {
                int minp = 0, maxp = 0;
                for (int i = 0; i < idx - 1; i++) {
                    if (primes[i + 1] - primes[i] < primes[minp + 1] - primes[minp]) {
                        minp = i;
                    }
                    if (primes[i + 1] - primes[i] > primes[maxp + 1] - primes[maxp]) {
                        maxp = i;
                    }
                }
                System.out.printf("%d,%d are closest, %d,%d are most distant."
                        , primes[minp], primes[minp + 1],
                        primes[maxp], primes[maxp + 1]);
            }

        }
    }
}
