package acwing.蓝桥杯._12届蓝桥杯省赛;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID05小平方 {
    static int n, count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i < n; i++) {
            int mod = i * i % n;
            if (mod < n / 2) {
                count++;
            } else if (mod == n / 2) {
                if (n % 2 == 1) count++;
            }
        }
        System.out.println(count);
    }
}
