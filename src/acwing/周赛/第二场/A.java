package acwing.周赛.第二场;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int t;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            boolean flag = false;
            for (int x = 0; x * 3 <= n; x++) {
                for (int y = 0; y * 5 + 3 * x <= n; y++) {
                    int z = n - 3 * x - 5 * y;
                    if (z >= 0 && z % 7 == 0) {
                        System.out.println(x + " " + y + " " + z / 7);
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }
            if (!flag)
                System.out.println(-1);


        }

    }
}
