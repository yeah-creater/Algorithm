package acwing.周赛.第3场;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class C {
    static int N = 100010;
    static int[] h = new int[N], f = new int[N];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            h[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            f[i] = h[i];
            for (int j = 1; j < i; j++) {
                if (h[j] < h[i]) {
                    f[i] = Math.max(f[i], f[j] + h[i]);
                }
            }
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (f[i] > max) {
                max = f[i];
            }
        }
        System.out.println(max);
    }
}
