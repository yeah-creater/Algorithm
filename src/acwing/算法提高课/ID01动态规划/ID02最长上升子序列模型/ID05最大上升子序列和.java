package acwing.算法提高课.ID01动态规划.ID02最长上升子序列模型;

import java.util.Scanner;

/**
 * @author: yeah
 * 最长上升子序列变为最大上升子序列
 * f[i]表示以a[i]结尾的上升子序列和的最大值
 */
public class ID05最大上升子序列和 {
    static int[] h = new int[1010], f = new int[1010];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            h[i] = in.nextInt();
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            f[i] = h[i];
            for (int j = 1; j < i; j++) {
                if (h[i] > h[j]) {
                    f[i] = Math.max(f[i], f[j] + h[i]);
                }
            }
            res = Math.max(res, f[i]);
        }
        System.out.println(res);
    }
}
