package acwing.算法提高课.ID04高级数据结构.ID02数状数组;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID01楼兰图腾 {
    static int N = 200010;
    static int[] c = new int[N];//表示某段区间的数的个数
    static int[] greater = new int[N], lower = new int[N], a = new int[N];//左边大于和小于的数
    static int n;

    static int lowBit(int x) {
        return x & -x;
    }

    static void add(int v, int x) {//将数组的第v个数加个数加1  从前往后
        for (int i = v; i <= n; i += lowBit(i)) {
            c[i] += x;
        }
    }

    static int sum(int v) {//返回小于等于v的数的个数  从后往前
        int res = 0;
        for (int i = v; i > 0; i -= lowBit(i)) {
            res += c[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int y = a[i];
            greater[i] = sum(n) - sum(y);//求y+1到n的个数
            lower[i] = sum(y - 1);//1到y-1的个数
            //将y加到树状数组中
            add(y, 1);
        }
        long res1 = 0, res2 = 0;
        Arrays.fill(c, 0);
        for (int i = n; i > 0; i--) {
            int y = a[i];
            res1 += (long) greater[i] * (sum(n) - sum(y));
            res2 += (long) lower[i] * (sum(y - 1));
            add(y,1);
        }
        System.out.println(res1 + " " + res2);
    }
}
