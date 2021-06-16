package acwing.杂题;

import codeforces.CodeforcesRound719.E;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author: yeah
 * 模拟即可
 */
public class ID3544寻找变化前的01序列 {
    static int t;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                bw.write(s.charAt(i));
                if (s.charAt(i) == '1') {
                    cnt++;
                    if (cnt == 5) {
                        cnt = 0;
                        i++;
                    }
                } else {
                    cnt = 0;
                }

            }
            bw.write("\n");
            bw.flush();
        }

    }
}
