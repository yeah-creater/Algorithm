package acwing.算法提高课.ID01动态规划.ID02最长上升子序列模型;

import java.util.Scanner;

/**
 * @author: yeah
 * 即求一个点为顶点  左右两边的最长上升子序列个数之和的最大值-1
 */
public class ID02登山 {
    static int n;
    static int[] h = new int[1010], l = new int[1010], r = new int[1010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            h[i] = in.nextInt();
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            l[i] = 1;
            for (int j = 0; j < i; j++) {
                if (h[i] > h[j]) {
                    l[i] = Math.max(l[i], l[j] + 1);
                }
            }
        }
        for (int i = n; i >= 1; i--) {
            r[i] = 1;
            for (int j = n; j > i; j--) {
                if (h[i] > h[j]) {
                    r[i] = Math.max(r[i], r[j] + 1);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            res = Math.max(res, l[i] + r[i]);
        }
        System.out.println(res);
    }
}
