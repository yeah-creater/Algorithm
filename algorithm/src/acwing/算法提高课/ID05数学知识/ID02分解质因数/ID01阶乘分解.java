package acwing.算法提高课.ID05数学知识.ID02分解质因数;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author: yeah
 * TLE
 */
public class ID01阶乘分解 {
    static TreeMap<Integer, Integer> map = new TreeMap<>();

    static void divide(int x) {
        for (int i = 2; i <= x / i; i++) {
            if (x % i == 0) {
                int res = 0;
                while (x % i == 0) {
                    res++;
                    x /= i;
                }
                map.merge(i, res, Integer::sum);
            }
        }
        if (x > 1) map.merge(x, 1, Integer::sum);
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = in.nextInt();
        for (int i = 2; i <= x; i++) {
            divide(i);
        }
        for (int i : map.keySet()) {
            bw.write(i + " " + map.get(i));
            bw.newLine();
        }
    }
}
