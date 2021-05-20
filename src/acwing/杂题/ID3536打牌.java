package acwing.杂题;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3536打牌 {
    static int[] cnt = new int[10];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String card = in.next();
        for (int i = 0; i < card.length(); i++) {
            cnt[Integer.parseInt(card.charAt(i) + "")]++;
        }
        String t = in.next();
        if (t.length() <= 4) {
            int val = Integer.parseInt(t.charAt(0) + "");
            for (int i = val + 1; i < 10; i++) {
                if (cnt[i] >= t.length()) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        } else {
            int st = Integer.parseInt(t.charAt(0) + "");
            for (int i = st + 1; i + 4 < 10; i++) {
                int j;
                for (j = i; j <= i + 4; j++) {
                    if (cnt[j] == 0) break;
                }
                if (j == i + 5) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }

    }
}
