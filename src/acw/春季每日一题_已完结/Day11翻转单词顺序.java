package acw.春季每日一题_已完结;

/**
 * @purpose:
 */
public class Day11翻转单词顺序 {

    public String reverseWords(String s) {
        String[] sub = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = sub.length - 1; i >= 0; i--)
            str.append(sub[i]).append(" ");
        str = new StringBuilder(str.toString().trim());
        return str.toString();
    }

}
