package codeforces.CodeforcesRound722;

import java.util.Scanner;

/**
 * @author: yeah
 */


public class A {
    static int t, n;
    static int[] q = new int[110];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int min = 110, cnt = 0;
            //find the number of min
            for (int i = 0; i < n; i++) {
                q[i] = in.nextInt();
                if (q[i] < min) min = q[i];
            }
            for (int i = 0; i < n; i++) {
                if (q[i] == min) cnt++;
            }
            System.out.println(n - cnt);
        }
    }
}
