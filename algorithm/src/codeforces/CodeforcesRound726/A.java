package codeforces.CodeforcesRound726;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int t, n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int x, sum = 0;
            for (int i = 0; i < n; i++) {
                x = in.nextInt();
                sum += x;
            }
            if (sum == n) {
                System.out.println(0);
            } else {
                if (sum > n) {
                    System.out.println(sum - n);
                } else {
                    System.out.println(1);
                }
              }

        }
    }
}
