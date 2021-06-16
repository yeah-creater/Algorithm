package acwing.周赛.热身赛;

import java.util.Scanner;

/**
 * @author: yeah
 * 记录下标 可以是负数
 */
public class B {
    static int size = 0;
    static int[] loc = new int[200010];
    static int add;
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n-- > 0) {
            String op = in.next();
            int x = in.nextInt();
            if (op.equals("L")) {
                size++;
                if (size > 1)
                    add++;
                loc[x] = 1 - add;
            } else if (op.equals("R")) {
                size++;
                loc[x] = size - add;
            } else {
                int l = loc[x] + add;
                System.out.println(Math.min(l - 1, size - l));
            }
        }

    }
}
