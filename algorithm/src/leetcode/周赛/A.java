package leetcode.周赛;

/**
 * @author: yeah
 */
class Solution {
    public boolean checkZeroOnes(String s) {
        int max1 = 0, max2 = 0, cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else {
                max1 = Math.max(cnt, max1);
                cnt = 0;
            }
        }
        cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                cnt++;
            } else {
                max2 = Math.max(cnt, max2);
                cnt = 0;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        return max1 > max2;
    }
}

public class A {

}
