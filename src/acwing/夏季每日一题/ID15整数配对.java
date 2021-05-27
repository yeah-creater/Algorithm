package acwing.夏季每日一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 * 排序即可 贪心
 */
public class ID15整数配对 {
    static int n;
    static int[] q;
    static long res;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        Arrays.sort(q);
        for (int i = 0; i < n - 1; i += 2) {
            res += q[i + 1] - q[i];
        }
        System.out.println(res);
    }
}
