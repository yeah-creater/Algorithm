package codeforces.CodeforcesRound719;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class C {
    static int n, m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n-- > 0) {
            m = in.nextInt();
            if (m == 2) System.out.println(-1);
            else {
                int idx = 1;
                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= m; j++) {
                        System.out.print(idx + " ");
                        idx += 2;
                        if (idx > m * m) idx = 2;
                    }
                    System.out.println();
                }
            }
        }
    }
}
