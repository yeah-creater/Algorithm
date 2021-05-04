package acw.杂题;

import java.util.Scanner;

/**
 * @author: yeah
 * 模拟即可
 */
public class ID3431kew数 {
    static int getMul(int exp) {

        return (int) (Math.pow(2, exp) - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                res += Integer.parseInt(s.charAt(i) + "") * getMul(s.length() - i);
            }
            System.out.println(res);

        }
    }
}
