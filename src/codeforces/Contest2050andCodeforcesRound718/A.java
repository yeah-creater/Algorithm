package codeforces.Contest2050andCodeforcesRound718;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int t;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            long x = in.nextLong();
            if (x % 2050 != 0) {
                System.out.println(-1);
            } else {
                long cnt = x / 2050;
                int least = 0;
                while (cnt > 0) {
                    least += cnt % 10;
                    cnt /= 10;
                }
                System.out.println(least);
            }
        }
    }
}
