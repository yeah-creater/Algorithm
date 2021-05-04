package acw.春季每日一题_已完结;

/**
 * @author: yeah
 */
class Solution5 {
    public String leftRotateString(String str, int n) {
        if (str.length() == 0) return "";
        StringBuilder res = new StringBuilder(str.substring(n, str.length()));
        res.append(str.substring(0, n));
        return res.toString();
    }
}

public class Day27左旋转字符串 {

}
