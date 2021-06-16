package acwing.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/23 - 20:42
 * <p>
 * 前缀和:
 * 定义数组a1到an
 * 前缀和Si就是a1到ai的和
 * 如何求Si?
 * 预先求出前缀和数组
 * Si=Si-1+ai  S0=0;
 * 作用：
 * 求区间m到n的和
 * <p>
 * 可以扩展到二维  看下一题
 */
public class ID05_0前缀和 {
    static int[] q = new int[100010];
    static int[] s = new int[100010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            q[i] = in.nextInt();
            s[i] = s[i - 1] + q[i];
        }
        for (int i = 0; i < m; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println(s[r] - s[l - 1]);
        }

    }

}
