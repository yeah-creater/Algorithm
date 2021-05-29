package codeforces.CodeforcesRound723;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int t, n;
    static int[] q;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            q = new int[n * 2];
            for (int i = 0; i < 2 * n; i++) {
                q[i] = in.nextInt();
            }
            Arrays.sort(q);

            for (int i = 0; i < n; i++) {
                System.out.print(q[i] + " " + q[2 * n - 1 - i] + " ");
            }

            System.out.println();
        }
    }
}
