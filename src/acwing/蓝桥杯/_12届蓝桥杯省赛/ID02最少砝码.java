package acwing.蓝桥杯._12届蓝桥杯省赛;

import java.util.Scanner;

/**
 * 1+3+9+...+ 3^n >=sum 的n的最小值
 */
public class ID02最少砝码 {
    static int[] sum = new int[100];
    static int[] f = new int[100];

    public static void main(String[] args) {
        f[1] = 1;
        sum[1] = 1;
        for (int i = 2; f[i - 1] <= 1000000000; i++) {
            f[i] = f[i - 1] * 3;
            sum[i] = sum[i - 1] + f[i];
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
            if (sum[i] >= n) {
                System.out.println(i);
                return;
            }
    }
}

