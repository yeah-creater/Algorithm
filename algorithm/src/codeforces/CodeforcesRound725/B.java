package codeforces.CodeforcesRound725;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class B {
    static int t, n;
    static int[] q = new int[200010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                q[i] = in.nextInt();
                sum += q[i];
            }
            int cnt = 0;
            if (sum % n != 0) {
                System.out.println(-1);
            } else {
                int ave = sum / n;
                for (int i = 0; i < n; i++) {
                    if (q[i] > ave) cnt++;
                }
                System.out.println(cnt);
            }
        }
    }
}
