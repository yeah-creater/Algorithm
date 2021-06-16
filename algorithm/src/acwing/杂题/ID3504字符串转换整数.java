package acwing.杂题;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: yeah
 * 使用正则表达式
 */
public class ID3504字符串转换整数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(in.next());
        if (m.find()) {
            String str = m.group();
            try {
                if ((Long.parseLong(str) > Integer.MAX_VALUE)) {
                    System.out.println("-1");
                    return;
                }
            } catch (Exception ignored) {
                System.out.println("-1");
                return;
            }
            System.out.println(Integer.parseInt(str));
            return;
        }
        System.out.println(-1);
    }
}
