package acwing.杂题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3546复制剪切粘贴 {
    static String s, t;
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s = in.next();
        n = in.nextInt();
        t = "";
        while (n-- > 0) {
            String op = in.next();
            if (op.equals("COPY")) {
                int l = in.nextInt();
                int r = in.nextInt();
                t = s.substring(l, r + 1);
                System.out.println(s);
            } else if (op.equals("CUT")) {
                int l = in.nextInt();
                int r = in.nextInt();
                t = s.substring(l, r + 1);
                s = s.substring(0, l) + s.substring(r + 1);
                System.out.println(s);
            } else {
                int ins = in.nextInt();
                s = s.substring(0, ins + 1) + t + s.substring(ins + 1);
                System.out.println(s);
            }
        }
    }
}
