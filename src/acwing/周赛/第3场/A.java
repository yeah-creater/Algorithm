package acwing.周赛.第3场;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int t, n, m, r, c;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            r = in.nextInt();
            c = in.nextInt();
            int x1 = 1, y1 = 1;
            int x2 = 1, y2 = m;
            int x3 = n, y3 = 1;
            int x4 = n, y4 = m;
            int max1 = Math.max(Math.abs(x1 - r) + Math.abs(y1 - c), Math.abs(x2 - r) + Math.abs(y2 - c));
            int max2 = Math.max(Math.abs(x3 - r) + Math.abs(y3 - c), Math.abs(x4 - r) + Math.abs(y4 - c));
            System.out.println(Math.max(max1, max2));
        }
    }
}
