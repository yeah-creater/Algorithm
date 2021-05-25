package codeforces.CodeforcesRound722;

import java.util.*;

/**
 * @author: yeah
 */
public class B {
    static int t, n;
    static long[] q = new long[100010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        t = in.nextInt();
        while (t-- > 0) {

            n = in.nextInt();
            q = new long[n];
            for (int i = 0; i < n; i++) {
                q[i] = in.nextLong();
            }
            Arrays.sort(q);
            long min = 1000000000, cnt = 0;
            for (int i = 1; i < n; i++) {
                min = Math.min(min, q[i] - q[i - 1]);
                if (q[i] <= min) {
                    cnt++;
                } else {
                    break;
                }
            }
            System.out.println(cnt+1);
        }
    }
}
