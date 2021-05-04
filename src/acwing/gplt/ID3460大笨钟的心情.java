package acwing.gplt;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3460大笨钟的心情 {
    static int[] m = new int[24];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            m[i] = in.nextInt();
        }
        while (true) {
            int h = in.nextInt();
            if (h < 0 || h >= 24) break;
            String res = "Yes";
            if (m[h] <= 50) res = "No";
            System.out.println(m[h] + " " + res);
        }
    }
}
