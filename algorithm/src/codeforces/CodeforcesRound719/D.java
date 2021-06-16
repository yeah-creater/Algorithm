package codeforces.CodeforcesRound719;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author: yeah
 * aj−ai=j−i is equal to aj-j=ai-i;
 */
public class D {
    static int t, n;
    static TreeMap<Integer, Long> res;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            res = new TreeMap<>();
            n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                int val = in.nextInt();

                res.merge(val - i, (long) 1, Long::sum);

            }
            long cnt = 0;
            for (int key : res.keySet()) {
                cnt += res.get(key) * (res.get(key) - 1) / 2;
            }
            System.out.println(cnt);
        }
    }
}
