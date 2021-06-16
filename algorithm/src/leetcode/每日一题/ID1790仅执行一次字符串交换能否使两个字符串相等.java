package leetcode.每日一题;

/**
 * @author: yeah
 */
class Solution6 {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt = 0, l1 = 0, l2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cnt++;
                if (cnt == 1) l1 = i;
                if (cnt == 2) l2 = i;
            }
        }
        return cnt == 0 || (cnt == 2 && s1.charAt(l1) == s2.charAt(l2) && s1.charAt(l1) == s1.charAt(l2));
    }
}

public class ID1790仅执行一次字符串交换能否使两个字符串相等 {
}
