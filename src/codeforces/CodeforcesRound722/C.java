package codeforces.CodeforcesRound722;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class C {
    static int t, n;
    static int[] a1 = new int[100010];
    static int[] a2 = new int[100010];
    static int[] val = new int[100010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int res = 0;
            a1 = new int[n + 1];
            a2 = new int[n + 1];
            val = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a1[i] = in.nextInt();
                a2[i] = in.nextInt();
            }
            for (int i = 1; i <= n - 1; i++) {
                int v1 = in.nextInt();
                int v2 = in.nextInt();
                int val1 = val[v1];
                int val2 = val[v2];
                if (val1 > 0 || val2 > 0) {
                    if (val1 > 0 && val2 > 0) {
                        res += Math.abs(val1 - val2);
                    } else if (val1 > 0) {
                        if (Math.abs(val1 - a1[v2]) > Math.abs(val1 - a2[v2])) {
                            val[v2] = a1[v2];
                        } else {
                            val[v2] = a2[v2];
                        }
                        res += Math.max(Math.abs(val1 - a1[v2]), Math.abs(val1 - a2[v2]));
                    } else {
                        if (Math.abs(val2 - a1[v1]) > Math.abs(val2 - a2[v1])) {
                            val[v1] = a1[v1];
                        } else {
                            val[v1] = a2[v1];
                        }
                        res += Math.max(Math.abs(val2 - a1[v1]), Math.abs(val2 - a2[v1]));
                    }
                } else {
                    int res1 = Math.abs(a1[v1] - a1[v2]);
                    int res2 = Math.abs(a1[v1] - a2[v2]);
                    int res3 = Math.abs(a2[v1] - a1[v2]);
                    int res4 = Math.abs(a2[v1] - a2[v2]);
                    int max = Math.max(Math.max(res1, res2), Math.max(res3, res4));
                    if (max == res1) {
                        val[v1] = a1[v1];
                        val[v2] = a1[v2];
                    } else if (max == res2) {
                        val[v1] = a1[v1];
                        val[v2] = a2[v2];
                    } else if (max == res3) {
                        val[v1] = a2[v1];
                        val[v2] = a1[v2];
                    } else {
                        val[v1] = a2[v1];
                        val[v2] = a2[v2];
                    }
                    res += max;
                }
            }
            System.out.println(res);
        }
    }
}
