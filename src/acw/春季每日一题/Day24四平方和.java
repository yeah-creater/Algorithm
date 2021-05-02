package acw.春季每日一题;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: yeah
 */
class Pair {
    int c;
    int d;

    public Pair(int c, int d) {
        this.c = c;
        this.d = d;
    }
}

public class ID3x四平方和 {
    static HashMap<Integer, Pair> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int c = 0; c * c <= n; c++) {
            for (int d = c; d * d + c * c <= n; d++) {
                if (!map.containsKey(d * d + c * c)) {
                    map.put(d * d + c * c, new Pair(c, d));
                }
            }
        }
        for (int a = 0; a * a <= n; a++) {
            for (int b = a; b * b + a * a <= n; b++) {
                int target = n - a * a - b * b;
                if (map.get(target) != null) {
                    System.out.println(a + " " + b + " " + map.get(target).c + " " + map.get(target).d);
                    return;
                }
            }
        }
    }
}
