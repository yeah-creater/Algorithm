package acwing.杂题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID824取现金 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mon = {1, 5, 10, 20, 100};
        int res = 0;
        for (int i = 4; i >= 0; i--) {
            res += n / mon[i];
            n %= mon[i];
        }
        System.out.println(res);
    }
}
