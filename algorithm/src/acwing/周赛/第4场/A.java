package acwing.周赛.第4场;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int cntA, cntB;
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        String s = in.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                cntA++;
            } else {
                cntB++;
            }
        }
        if (cntA > cntB) {
            System.out.println("A");
        } else if (cntA < cntB) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
