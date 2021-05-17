package codeforces.EducationalCodeforcesRound109;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class B {
    static int t, n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int[] a = new int[n + 1];
            boolean flag = true;
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
                if (a[i] != i) flag = false;
            }
            if (flag) System.out.println("0");
            else {
                if (a[n] == n || a[1] == 1) {
                    System.out.println(1);
                } else if (a[n] != 1 && a[1] != n) {
                    System.out.println(2);
                } else {
                    if(a[n]==1&&a[1]==n){
                        System.out.println(3);
                    }
                    else{
                        System.out.println(2);
                    }
                }

            }
        }
    }
}
