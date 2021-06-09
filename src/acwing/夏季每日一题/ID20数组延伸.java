package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 * 找规律
 * 暴力模拟会超时
 */
public class ID20数组延伸 {
    static int t, n, x;
    static int[] q = new int[100010];


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            x = in.nextInt();
            for (int i = 0; i < n; i++) {
                q[i] = in.nextInt();
            }
            //展开的次数等于每个数展开次数的最下值
            long sum = 0, psum = 0;//完整一段总和以及最后一段的和
            int cnt = 1000000;
            for (int i = 0; i < n; i++) {
                int c = 0;
                sum += q[i];
                for (int j = q[i]; j % x == 0; j /= x) {
                    c++;
                }
                if (c < cnt) {
                    cnt = c;
                    psum = sum - q[i];
                }
            }
            System.out.println(sum * (cnt + 1) + psum);


        }
    }
}
