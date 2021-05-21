package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID11K优字符串 {
    static int t, n, k;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            n = in.nextInt();
            k = in.nextInt();
            String s = in.next();
            int num = 0;
            for (int j = 0; j < n / 2; j++) {
                if (s.charAt(j) != s.charAt(n - j - 1)) {
                    num++;
                }
            }
            System.out.println("Case #" + i + ": " + Math.abs(num - k));

        }
    }
}
