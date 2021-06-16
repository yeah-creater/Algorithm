package codeforces.CodeforcesRound719;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int res = 0;
            int x = in.nextInt();
            String s = Integer.toString(x);
            int len = s.length();
            int max = Integer.parseInt(s.charAt(0) + "");
            int up = 0;
            for (int i = 0; i < len; i++) {
                up = up * 10 + max;
            }
            res += max;
            if (x < up) res--;
            res += (len - 1) * 9;
            System.out.println(res);
        }
    }
}
