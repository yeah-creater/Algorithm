package codeforces.EducationalCodeforcesRound108;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int r = in.nextInt();
            int b = in.nextInt();
            int d = in.nextInt();
            String res = "YES";
            if (d == 0) {
                if (r != b) res = "NO";
            } else {
                int cnt = Math.max((r + b - 1) / b, (b + r - 1) / r);
                if (cnt - 1 > d) res = "NO";
            }
            System.out.println(res);
        }
    }
}
