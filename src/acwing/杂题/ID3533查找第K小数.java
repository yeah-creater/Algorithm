package acwing.杂题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3533查找第K小数 {
    static int n, k;
    static int[] q = new int[1010];

    static int quickSelect(int l, int r) {
        if (l >= r) return q[l];
        int i = l - 1, j = r + 1;
        int x = q[l];
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                int t = q[i];
                q[i] = q[j];
                q[j] = t;
            }
        }
        if (k <= j) return quickSelect(l, j);
        else return quickSelect(j + 1, r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        k = in.nextInt();
        System.out.println(quickSelect(0, n - 1));
    }
}
