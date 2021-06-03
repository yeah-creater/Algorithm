package acwing.夏季每日一题;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: yeah
 * 双指针
 */
public class ID18三值字符串 {
    static int t;
    static String s;
    static int[] cnt = new int[4];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            s = br.readLine();
            int min = 200010;
            cnt = new int[4];
            for (int i = 0, j = 0; j < s.length(); j++) {
                cnt[Integer.parseInt(s.charAt(j) + "")]++;
                //当头节点的数量大于1时
                while (i < s.length() && cnt[Integer.parseInt(s.charAt(i) + "")] > 1) {
                    cnt[Integer.parseInt(s.charAt(i++) + "")]--;
                }
                if (cnt[1] >= 1 && cnt[2] >= 1 && cnt[3] >= 1) {
                    min = Math.min(min, j - i + 1);
                }
            }
            min = min == 200010 ? 0 : min;
            System.out.println(min);
        }
    }
}
