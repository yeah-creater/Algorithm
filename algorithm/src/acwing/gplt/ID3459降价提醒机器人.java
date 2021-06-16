package acwing.gplt;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3459降价提醒机器人 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double p = in.nextDouble();
        while (n-- > 0) {
            double x = in.nextDouble();
            if (x < p) {
                System.out.println("On Sale! " + x);
            }
        }
    }
}
