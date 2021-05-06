package acwing.算法提高课.ID01动态规划.ID02最长上升子序列模型;

import java.util.Scanner;

/**
 * @author: yeah
 * 和登山本质一样
 * 最后的结果肯定是有一位最高的同学  就枚举最高的同学的可能
 * 算出左右两边的最长上升子序列个数之和的最大值-1
 */
public class ID03合唱队形 {
    static int n;
    static int[] h = new int[110], l = new int[110], r = new int[110];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            h[i] = in.nextInt();
        }
        //左侧
        for (int i = 1; i <= n; i++) {
            l[i] = 1;
            for (int j = 1; j < i; j++) {
                if (h[i] > h[j])
                    l[i] = Math.max(l[i], l[j] + 1);
            }
        }
        //右侧
        for (int i = n; i >= 1; i--) {
            r[i] = 1;
            for (int j = n; j > i; j--) {
                if (h[i] > h[j])
                    r[i] = Math.max(r[i], r[j] + 1);
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = Math.max(res, l[i] + r[i] - 1);
        }
        System.out.println(n - res);
    }
}
