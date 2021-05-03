package acw.春季每日一题;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author: yeah
 * 二分绳子的长度，判断是否满足条件
 */
public class Day30剪绳子 {
    static int n, m;
    static double[] q = new double[100010];

    static boolean check(double length) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += (int) (q[i] / length);
        }
        return cnt >= m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = 0, l = 0;
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 0; i < n; i++) {
            q[i] = in.nextDouble();
            if (q[i] > r) r = q[i];
        }
        while (r - l > 0.00000001) {
            double mid = (r + l) / 2;
            if (check(mid)) l = mid;
            else r = mid;
        }
        System.out.printf("%.2f", l);

    }
}
