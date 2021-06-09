package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 * 数学思维题
 */
public class ID22楼层 {
    static int t, n, x;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            x = in.nextInt();
            if (n <= 2) {
                System.out.println(1);
            } else {
                System.out.println((x + n - 3) / x + 1);
            }
        }
    }
}
