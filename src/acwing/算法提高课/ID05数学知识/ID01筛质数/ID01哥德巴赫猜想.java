package acwing.算法提高课.ID05数学知识.ID01筛质数;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author: yeah
 * 线性筛法
 */
public class ID01哥德巴赫猜想 {
    static int N = 1000010;
    static int x, cnt;
    static boolean[] st = new boolean[N];
    static int[] prime = new int[N];

    static void init() {
        for (int i = 2; i < N; i++) {
            if (!st[i]) {
                prime[cnt++] = i;
            }
            //筛质数的倍shu
            for (int j = 0; prime[j] * i < N; j++) {
                st[prime[j] * i] = true;
                if (i % prime[j] == 0) break;
            }
        }
    }

    static void split(int x) {
        for (int i = 0; i < cnt; i++) {
            if (!st[x - prime[i]]) {
                System.out.println(x + " = " + prime[i] + " + " + (x - prime[i]));
                return;
            }
        }
        //哥德巴赫是正确的 不要输出啦  hhh
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        init();
        while ((x = in.nextInt()) != 0) {
            split(x);
        }
    }
}
