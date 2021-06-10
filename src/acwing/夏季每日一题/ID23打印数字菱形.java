package acwing.夏季每日一题;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID23打印数字菱形 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;

    static void print(int x) throws Exception {
        for (int i = 1; i <= 2 * (n - x); i++) {
            bw.write(" ");
        }
        for (int i = 0; i <= x; i++) {
            bw.write(i+" ");
        }
        if (x != 0) {
            for (int i = x - 1; i >= 0; i--) {
                bw.write(i + " ");
            }
        }
        bw.write("\n");
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            print(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            print(i);
        }
        bw.flush();
    }
}
