package codeforces.CodeforcesRound723;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class B {
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] val = {11, 111, 1111, 11111, 111111, 1111111, 11111111, 111111111};
        n = in.nextInt();

        while (n-- > 0) {
            int x = in.nextInt();
            for (int i = 0; i < 1; i++) {
                boolean t = false;
                for (int k = 0; k < 7; k++) {
                    if (x % val[k] == 0) {
                        System.out.println("YES");
                        t = true;
                        break;
                    }

                }
                if (!t) {
                    int cnt = x / val[0];
                    boolean flag = false;
                    for (int j = 7; j >= 0; j--) {
                        while (cnt * 11 >= val[j]) {
                            x -= val[j];
                            cnt = x / 11;
                            if (x % 11 == 0) {
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (flag) System.out.println("YES");
                    else System.out.println("NO");


                }
            }

        }
    }
}
