package codeforces.CodeforcesRound719;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int n, m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n-- > 0) {
            m = in.nextInt();
            String s = in.next();
            String res = "YES";
            for (int i = 0; i < m; ) {
                boolean over = false;
                int end = s.lastIndexOf(s.charAt(i) + "");
                for (int j = i; j <= end; j++) {
                    if (s.charAt(j) != s.charAt(i)) {
                        over = true;
                        res = "NO";
                        break;
                    }
                }
                i += end - i + 1;
                if (over) break;
            }
            System.out.println(res);
        }
    }
}
