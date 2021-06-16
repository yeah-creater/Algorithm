package acwing.夏季每日一题;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID25数组重排 {
    static int t, n;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            //排序后逆序输出
            Arrays.sort(a);
            for (int i = n - 1; i >= 0; i--) {
                bw.write(a[i] + " ");
            }
            bw.newLine();
            bw.flush();

        }
    }
}
