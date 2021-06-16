package acwing.杂题;

import java.util.Scanner;

/**
 * @author: yeah
 * 找不大于n的约数即可
 */
public class ID3545寻找奇特的数 {
    static int t, n, m;

    static int getCnt(int x) {
        int res = 0;
        for (int i = 1; i <= x / i; i++) {
            if (x % i == 0 && i <= n && x / i <= n) {
                if (i != x / i) res += 2;
                else res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            System.out.println(getCnt(m));
        }
    }
}
