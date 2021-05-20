package acwing.杂题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3537树查找 {
    static int n;
    static int[] t;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        t = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = in.nextInt();
        }
        int k = in.nextInt();
        int idx = 1;
        for (int i = 1; i <= n; ) {
            if (idx == k) {
                for (int j = i; j <= i + Math.pow(2, idx - 1) - 1 && j <= n; j++) {
                    System.out.print(t[j] + " ");
                }
                return;
            }
            i += Math.pow(2, idx - 1);
            idx++;
        }
        System.out.println("EMPTY");

    }
}
