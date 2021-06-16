package acwing.夏季每日一题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID07阶乘的和 {
    static List<Integer> list = new ArrayList<>();
    static HashSet<Integer> set = new HashSet<>();
    static int res;

    static int getF(int x) {
        if (x == 1 || x == 0) return 1;
        return x * getF(x - 1);
    }

    static void dfs(int u) {
        if (u == 10) {
            set.add(res);
            return;
        }
        for (int i = 0; i <= 1; i++) {
            if (i == 1) {
                res += list.get(u);
                dfs(u + 1);
                res -= list.get(u);
            } else {
                dfs(u + 1);
            }

        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            list.add(getF(i));
        }
        dfs(0);
        Scanner in = new Scanner(System.in);
        int n;
        while (true) {
            n = in.nextInt();
            if (n < 0) return;
            String res = "YES";
            if (!set.contains(n)) res = "NO";
            if (n == 0) res = "NO";
            System.out.println(res);
        }
    }

}
