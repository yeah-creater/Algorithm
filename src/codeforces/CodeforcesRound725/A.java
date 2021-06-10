package codeforces.CodeforcesRound725;

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
            int min = 0, max = 0;
            int q[] = new int[n];
            for (int i = 0; i < n; i++) {
                q[i] = in.nextInt();
                if (q[i] > q[max]) {
                    max = i;
                }
                if (q[i] < q[min]) {
                    min = i;
                }
            }
            int maxVal = Math.min(Math.max(n - min, n - max), Math.max(max, min) + 1);
            if (min > max) {
                int t = min;
                min = max;
                max = t;
            }
            maxVal = Math.min(maxVal, min + 1 + n - max);
            System.out.println(maxVal);
        }
    }
}
