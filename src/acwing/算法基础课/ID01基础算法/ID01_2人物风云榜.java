package acwing.算法基础课.ID01基础算法;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/1 - 20:15
 */
public class ID01_2人物风云榜 {
    static int[] a;
    static int[] q;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        q = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        for (int i = 0; i < n; i++) q[i] = a[i];
        Arrays.sort(q);
        for (int i = 0; i < n / 2; i++) {
            int tmp = q[i];
            q[i] = q[n - 1 - i];
            q[n - 1 - i] = tmp;
        }
        for (int i = 0; i < n; i++) {
            int x = a[i], l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (q[mid] <= x) r = mid;
                else l = mid + 1;
            }
            System.out.print((l + 1) + " ");
        }
    }
}
