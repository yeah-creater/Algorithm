package codeforces.CodeforcesRound723;

import javax.xml.transform.Source;
import java.util.Scanner;

/**
 * @author: yeah
 * 1111 = 11 *100 + 11
 * 11111 = 111*100 + 11
 * 111111 = 1111 *100 +11
 * ...
 * 所以大于 111的数都可以用 a*111+b*11 表示
 * <p>
 * 所以 x= 11a+111b   a>=0&&b>=0
 * x= 11(a+10b)+b
 * x%11 = b  b<11
 * <p>
 * x-111b=11a
 * (x-111b)/11 = a
 * <p>
 * 1.x%11 = b
 * 2.a = (x-111b)/11
 */
public class B {
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while (n-- > 0) {
            int x = in.nextInt();
            int a = 0, b = 0;
            b = x % 11;
            a = (x - 111 * b) / 11;
            if (a >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }
    }
}
