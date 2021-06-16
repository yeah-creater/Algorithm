package acwing.算法提高课.ID05数学知识.ID01筛质数;

import java.util.Scanner;

/**
 * @author: yeah
 * 只要质数和他们的合数不同颜色即可(有质因子的条件)
 */
public class ID02夏洛克和他的女朋友 {
    static int N = 100010;
    static int n, cnt;
    static int[] prime = new int[N];
    static boolean[] st = new boolean[N];

    static void init() {
        for (int i = 2; i < N; i++) {
            if (!st[i]) prime[cnt++] = i;
            for (int j = 0; i * prime[j] < N; j++) {
                st[i * prime[j]] = true;
                if (i % prime[j] == 0) break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        init();
        n = in.nextInt();
        for (int i = 2; i <= n + 1; i++) {
            if (!st[i]) System.out.print("1 ");
            else System.out.println("2 ");
        }
    }
}
