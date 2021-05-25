package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 * 投机了 哈哈哈
 */
public class ID12二进制 {
    static int t;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            long x = in.nextLong(2);

            for (int i = 0; i < 32 - (Long.toBinaryString(x + 1) + "").length(); i++) {
                System.out.print(0);
            }
            System.out.println(Long.toBinaryString(x + 1));
            for (int i = 0; i < 32 - (Long.toBinaryString(x + 3) + "").length(); i++) {
                System.out.print(0);
            }
            System.out.println(Long.toBinaryString(x + 3));

        }
    }

}
