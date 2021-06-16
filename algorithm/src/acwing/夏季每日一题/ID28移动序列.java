package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID28移动序列 {
    static int t, n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            int cnt = 0;
            n = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            s = s.replaceAll(" +", "");
            s = s.replaceAll("0", " ").trim();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    cnt++;
                }

            }
            System.out.println(cnt);
        }
    }
}
