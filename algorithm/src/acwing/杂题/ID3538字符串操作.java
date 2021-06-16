package acwing.杂题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3538字符串操作 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.next());
        int n = in.nextInt();
        while (n-- > 0) {
            char[] sa = s.toString().toCharArray();
            String op = in.next();
            int st = Integer.parseInt(op.charAt(1) + "");
            int len = Integer.parseInt(op.charAt(2) + "");
            int end = st + len - 1;
            if (op.charAt(0) == '0') {
                for (int i = st; i <= (st + end) / 2; i++) {
                    char t = sa[i];
                    sa[i] = sa[end - i + st];
                    sa[end - i + st] = t;
                }
            } else {
                int idx = 3;
                for (int i = st; i <= end; i++) {
                    sa[i] = op.charAt(idx++);
                }

            }
            s = new StringBuilder();
            for (char c : sa) s.append(c);
            System.out.println(s);
        }
    }
}
