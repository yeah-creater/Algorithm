package acwing.杂题;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: yeah
 */
public class ID3581单词识别 {
    static TreeMap<String, Integer> map = new TreeMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        Pattern pattern = Pattern.compile("[a-z|A-Z]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String group = matcher.group().toLowerCase(Locale.ROOT);
            System.out.println(group);
            map.merge(group, 1, Integer::sum);
        }
        for (String str : map.keySet()) {
            System.out.println(str + ":" + map.get(str));
        }


    }
}
