package acwing.周赛.第1场;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int n, m, x, y;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int t = in.nextInt();
            x = Math.max(x, t);
        }
        m = in.nextInt();
        for (int i = 1; i <= m; i++) {
            int t = in.nextInt();
            y = Math.max(y, t);
        }
        System.out.println(x + " " + y);

    }
}
