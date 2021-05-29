package acwing.周赛.第一场;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static boolean[] st = new boolean[410];
    static int[] A = new int[110];
    static int[] B = new int[110];
    static int n, m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            A[i] = in.nextInt();
            st[A[i]] = true;
        }
        m = in.nextInt();
        for (int i = 1; i <= m; i++) {
            B[i] = in.nextInt();
            st[B[i]] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (!st[A[i] + B[j]]) {
                    System.out.println(A[i] + " " + B[j]);
                    return;
                }
            }
        }
    }
}
