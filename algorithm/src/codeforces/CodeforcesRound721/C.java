package codeforces.CodeforcesRound721;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class C {
    static int t, n;
    static HashMap<Long, Long> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            map = new HashMap<>();
            long res = 0;
            for (int i = 1; i <= n; i++) {
                long x = in.nextLong();
                if(map.get(x)!=null) {
                    res += map.get(x) * (n - i + 1);
                }
                map.merge(x, (long) i, Long::sum);
            }
            System.out.println(res);
        }
    }
}
