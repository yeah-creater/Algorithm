package acwing.夏季每日一题;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
/**
 * @author: yeah
 * 不在最底层和做左层的为1 其他枚举
 */
public class ID27素数矩阵 {
    static int t, n;

    //可以用筛素数优化
    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= x / i; i++)
            if (x % i == 0)
                return false;
        return true;

    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int sum = 0;
            for (int j = 0; j < n - 1; j++) {
                for (int i = 0; i < n - 1; i++) {
                    bw.write(1 + " ");
                }
                for (int k = 1; k <= 100000 && j != n - 1; k++) {
                    if (!isPrime(k) && isPrime(k + n - 1)) {
                        bw.write(k + "\n");
                        sum += k;
                        break;
                    }
                }
            }
            int sum2 = 0;
            for (int k = 0; k < n - 1; k++) {
                for (int kk = 1; kk <= 100000; kk++) {
                    if (!isPrime(kk) && isPrime(kk + n - 1)) {
                        sum2 += kk;
                        bw.write(kk + " ");
                        break;
                    }
                }
            }
            for (int k = 1; k <= 100000; k++) {
                if (!isPrime(k) && isPrime(k + sum) && isPrime(k + sum2)) {
                    bw.write(k + "\n");
                    break;
                }
            }
        }
        bw.flush();
    }
}
