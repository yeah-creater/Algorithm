package acwing.gplt;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3458强迫症 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int date = in.nextInt();
        if (date > 9999) {
            System.out.print(date / 100 + "-");
            System.out.printf("%02d\n", date % 100);
        } else {
            if (date / 100 >= 22) {
                System.out.print("19" + date / 100 + "-");
                System.out.printf("%02d\n", date % 100);
            } else {
                System.out.print(20);
                System.out.printf("%02d", date / 100);
                System.out.print("-");
                System.out.printf("%02d", date % 100);
            }
        }
    }
}
