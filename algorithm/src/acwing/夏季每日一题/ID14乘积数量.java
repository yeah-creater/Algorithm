package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID14乘积数量 {
    static int N = 200010;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //正序列个数和负序列个数
        long rp = 0, rn = 0;
        //前n项正序列和负序列的个数
        int sp = 1, sn = 0, s = 1;
        while (n-- > 0) {
            int a = in.nextInt();
            if (a < 0) s *= -1;
            if (s > 0) {
                rp += sp;
                rn += sn;
                sp++;
            } else {
                rp += sn;
                rn += sp;
                sn++;
            }

        }
        System.out.println(rn + " " + rp);
    }
}
