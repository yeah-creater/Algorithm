package acwing.算法提高课.ID01动态规划.ID02最长上升子序列模型;

import java.util.Scanner;

/**
 * @author: yeah
 * 往左跳：以开始到a[i]的最长上升子序列
 * 往右跳：从结尾到a[i]的最长上升子序列
 */
public class ID01怪盗基德的滑翔翼 {
    static int k, n, res;
    static int[] h = new int[110], l = new int[110], r = new int[110];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        k = in.nextInt();

        while (k-- > 0) {
            n = in.nextInt();
            res = 0;
            for (int i = 1; i <= n; i++) {
                h[i] = in.nextInt();
            }
            //正向求解LIS问题
            for (int i = 1; i <= n; i++) {
                l[i] = 1;
                for (int j = 1; j < i; j++) {
                    if (h[i] > h[j]) {
                        l[i] = Math.max(l[i], l[j] + 1);
                    }
                }
                res = Math.max(res, l[i]);
            }
            //反向求解LIS问题
            for (int i = n; i >= 1; i--) {
                r[i] = 1;
                for (int j = n; j > i; j--) {
                    if (h[i] > h[j]) {
                        r[i] = Math.max(r[i], r[j] + 1);
                    }
                }
                res = Math.max(res, r[i]);
            }
            System.out.println(res);
        }

    }
}
