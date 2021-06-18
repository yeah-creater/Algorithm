package codeforces.CodeforcesRound726;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author: yeah
 */
public class B {
    static int t, n, m, x, y;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            x = in.nextInt();
            y = in.nextInt();
            int xx = n - x >= x - 1 ? n : 1;
            int yy = m - y >= y - 1 ? m : 1;
            System.out.println(xx + " " + yy + " " + Math.abs(n + 1 - xx) + " " + Math.abs(m + 1 - yy));


        }
    }
}
