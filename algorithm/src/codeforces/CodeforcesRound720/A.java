package codeforces.CodeforcesRound720;

import java.util.Scanner;

/**
 * @author: yeah
 * x+y=z —> x=y-z   y-z % A==0
 */
public class A {
    static long t, A, B;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextLong();
        while (t-- > 0) {
            A = in.nextLong();
            B = in.nextLong();
            if (B == 1) {
                System.out.println("No");
                continue;
            } else {
                System.out.println("Yes");
                if (B != 2) {
                    System.out.println(A + " " + ((B - 1) * A) + " " + (B * A));
                } else {
                    System.out.println(A + " " + (3 * A) + " " + (2 * A * B));
                }
            }
        }
    }
}
