package acw.春季每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/26 - 12:10
 * 先想怎么算出答案：最大矩阵的上边界肯定是某个小矩形的上边界，就是枚举每个小矩形作为最高点
 * O(n*n)的复杂度
 */
public class Day07直方图中最大的矩形 {
    static final int N = 100010;
    //l和r表示某个矩形右边第一个小于它的矩形和左边第一个小于它的矩形
    static int[] h = new int[N], l = new int[N], r = new int[N], stack = new int[N];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            n = in.nextInt();
            if (n == 0) break;
            for (int i = 1; i <= n; i++) h[i] = in.nextInt();
            h[0] = h[n + 1] = -1;
            int tt = 0;
            stack[0] = 0;
            for (int i = 1; i <= n; i++) {
                while (h[i] <= h[stack[tt]]) tt--;
                l[i] = stack[tt];
                stack[++tt] = i;
            }
            tt = 0;
            stack[0] = n + 1;
            for (int i = n; i >= 1; i--) {
                while (h[i] <= h[stack[tt]]) tt--;
                r[i] = stack[tt];
                stack[++tt] = i;
            }
            long res = 0;
            for (int i = 1; i <= n; i++)
                res = Math.max(res, (long) (h[i]) * (r[i] - l[i] - 1));
            System.out.println(res);
        }
    }
}
