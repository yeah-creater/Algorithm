package acwing.周赛.第1场;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class B {
    static int n, k;
    static int[] q;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        Arrays.sort(q);
        int i = n / 2;
        int cnt = i - n / 2;
        for (i = n / 2; i < n - 1; ) {
            cnt = i - n / 2 + 1;
            if (k >= cnt * (q[i + 1] - q[i])) {
                k -= cnt * (q[i + 1] - q[i]);
                q[i] = q[i + 1];
                i++;
            } else {
                System.out.println(q[i] + k / cnt);
                return;
            }
        }
        cnt++;
        System.out.println(q[n - 1] + k / cnt);


    }
}
