package acwing.算法基础课.ID05动态规划;

import java.util.Scanner;

/**
 * @author: yeah
 * 贪心+二分
 * <p>
 * 开辟一个数组q[]存放 所有不同长度的上升子序列结尾的最小值
 */
public class ID02_1最长上升子序列II {
    static int N = 100010;
    static int n;
    static int[] a = new int[N], q = new int[N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        //q中实际元素个数
        int len = 0;
        q[0] = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int l = 0, r = len;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (q[mid] < a[i]) l = mid;
                else r = mid + 1;
            }
            len = Math.max(len, r + 1);
            q[r + 1] = a[i];
        }
        System.out.println(len);
    }
}
