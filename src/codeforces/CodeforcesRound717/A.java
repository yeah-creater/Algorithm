package codeforces.CodeforcesRound717;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int t, n, k;
    static int[] a = new int[110];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int i = 0;
            while (k > 0) {
                while (a[i] != 0 && k > 0) {
                    k--;
                    a[i]--;
                    a[n-1]++;
                }
                i++;
                if (i == n - 1) break;
            }
            for (i = 0; i < n; i++)
                System.out.print(a[i] + " ");
        }
    }
}
