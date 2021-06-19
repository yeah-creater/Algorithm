package acwing.周赛.第4场;

import java.util.Scanner;

/**
 * @author: yeah
 * 找规律
 */
public class B {
    static int n;
    static long k;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextLong();
        if (k % 2 == 1) {
            System.out.println("1");
            return;
        }
        long cnt = 1;
        for (int i = 2; i <= n; i++, cnt = cnt * 2) {
            if ((k - (cnt * 2)) % ((long) (Math.pow(2, i))) == 0) {
                System.out.println(i);
                return;
            }
        }

    }
}
