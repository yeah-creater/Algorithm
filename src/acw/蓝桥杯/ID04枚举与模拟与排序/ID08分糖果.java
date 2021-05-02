package acw.蓝桥杯.ID04枚举与模拟与排序;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/15 - 14:10
 */
public class ID08分糖果 {
    static int[] f = new int[110];//保存原来的糖果数
    static int[] tmp = new int[110];//保存新的糖果数
    static int cnt, n;

    static boolean isStop() {
        for (int i = 1; i < n; i++)
            if (f[i] != f[i + 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            f[i] = in.nextInt();
            tmp[i] = f[i];
        }
        while (!isStop()) {
            //交换糖果
            for (int i = 1; i <= n; i++) {
                if (i == n) {
                    tmp[i] += f[1] >> 1;
                    tmp[1] -= f[1] >> 1;
                } else {
                    tmp[i] += f[i + 1] >> 1;
                    tmp[i + 1] -= f[i + 1] >> 1;
                }
            }
            //补发糖果
            for (int i = 1; i <= n; i++) {
                f[i] = tmp[i];
                if (f[i] % 2 == 1) {
                    f[i]++;
                    tmp[i] = f[i];
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
