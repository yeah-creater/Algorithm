package acwing.周赛.第3场;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class B {
    static int t, n, k;
    static int[] q = new int[100010];
    static int[] count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            count = new int[110];
            int max = 0;
            for (int i = 0; i < n; i++) {
                q[i] = in.nextInt();
                count[q[i]]++;
                if (count[q[i]] > count[max]) {
                    max = q[i];
                }
            }
            int minCount = 100010;
            for (int ii = 1; ii <= 100; ii++) {
                int cnt = 0, val = 0;
                if (count[ii] == max) {
                    val = ii;
                }
                for (int i = 0; i < n; ) {
                    if (q[i] != ii) {
                        cnt++;
                        i += k;
                    } else {
                        i++;
                    }
                }
                minCount = Math.min(cnt, minCount);
            }
            System.out.println(minCount);
        }
    }
}
//5
//        10 2
//        1 1 2 2 1 1 2 2 2 1
//        7 1
//        1 2 3 4 5 6 7
//        10 3
//        1 3 3 3 3 1 2 1 3 3
//        8 5
//        1 1 1 1 1 1 2 1
//        10 3
//        1 2 2 2 2 1 2 1 1 1