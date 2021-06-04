package acwing.夏季每日一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID19同心圆涂色 {
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        Arrays.sort(q);
        int t = 1;
        double res = 0;
        for (int i = n - 1; i >= 0; i--, t++) {
            double res2 = Math.PI * q[i] * q[i];
            if (t % 2 == 1) {
                res += res2;
            } else {
                res -= res2;
            }
        }
        System.out.printf("%.6f",res);
    }
}
