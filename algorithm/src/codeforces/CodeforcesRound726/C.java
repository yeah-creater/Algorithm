package codeforces.CodeforcesRound726;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class C {
    static int t, n;
    static int[] q;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            q = new int[n];
            for (int i = 0; i < n; i++) {
                q[i] = in.nextInt();
            }
            int l = 0, r = 0, max = 1000000000;
            Arrays.sort(q);
            for (int i = 1; i < n; i++) {
                if (q[i] - q[i - 1] < max) {
                    r = i;
                    l = i - 1;
                    max = q[i] - q[i - 1];
                }
            }
            System.out.print(q[l] + " ");

            for (int i = r + 1; i < n; i++) {
                System.out.print(q[i] + " ");
            }
            for (int i = 0; i < l; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println(q[r]);
        }
    }
}
