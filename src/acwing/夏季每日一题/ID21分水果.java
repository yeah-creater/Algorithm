package acwing.夏季每日一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 * 枚举
 */
public class ID21分水果 {
    static int t;
    static int a, b, c;

    static boolean check(int a, int b, int c, int cnt) {
        int t = 0;
        //每个小朋友1个
        if (a > 0) {
            a--;
            t++;
        }
        if (b > 0) {
            b--;
            t++;
        }
        if (c > 0) {
            c--;
            t++;
        }
        //2个
        if (a > 0 && b > 0) {
            a--;
            b--;
            t++;
        }
        if (a > 0 && c > 0) {
            a--;
            c--;
            t++;
        }
        if (b > 0 && c > 0) {
            b--;
            c--;
            t++;
        }
        //3个
        if (a > 0 && b > 0 && c > 0) {
            t++;
        }
        return t >= cnt;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        int[] q = new int[3];
        while (t-- > 0) {
            q[0] = in.nextInt();
            q[1] = in.nextInt();
            q[2] = in.nextInt();
            //多的先用 贪心
            Arrays.sort(q);

            int max = 0;
            for (int i = 0; i <= 7; i++) {
                if (check(q[3], q[2], q[1], i)) {
                    max = i;
                }
            }
            System.out.println(max);
        }
    }
}
