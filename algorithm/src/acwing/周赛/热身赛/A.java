package acwing.周赛.热身赛;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static boolean check(int x) {
        int res = 0;
        while (x > 0) {
            res += x % 10;
            x /= 10;
        }
        return res % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i <= 1111; i++) {
            if (check(i)) {
                System.out.println(i);
                return;
            }
        }


    }
}
