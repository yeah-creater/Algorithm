package codeforces.CodeforcesRound721;

;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author: yeah
 */
public class B {
    static int t, n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            if (s.length() == 1) {
                System.out.println("BOB");
            } else if (s.length() % 2 == 1 && s.charAt(s.length() / 2) == '0') {
                int i;
                for (i = 0; i < s.length() / 2; i++) {
                    if (s.charAt(i) == '0') {
                        System.out.println("ALICE");
                        break;
                    }

                }
                if (i == s.length() / 2)
                    System.out.println("BOB");
            } else {
                System.out.println("BOB");
            }
        }
    }
}
