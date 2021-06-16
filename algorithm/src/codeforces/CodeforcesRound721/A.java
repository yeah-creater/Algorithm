package codeforces.CodeforcesRound721;

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
            if (n == 1) {
                System.out.println(0);
            } else {
                int rank = 0;
                for (int i = 1, j = 1; i < n; ) {
                    i += j * 2;
                    j *= 2;
                    rank++;
                }
                System.out.println((int) Math.pow(2, rank) - 1);
            }

        }
    }
}
