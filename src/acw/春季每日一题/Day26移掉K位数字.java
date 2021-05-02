package acw.春季每日一题;

import sun.security.util.Length;

import java.util.Scanner;

/**
 * @author: yeah
 * <p>
 * 一旦出现降序，就删除前一个数  若不够删 剩余的就从结尾开始删
 */
public class Day26移掉K位数字 {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder("0");
        Scanner in = new Scanner(System.in);
        String num = in.next();
        int k = in.nextInt();
        for (int i = 0; i < num.length(); i++) {
            while (k != 0 && Integer.parseInt(num.charAt(i) + "") <
                    Integer.parseInt(res.charAt(res.length() - 1) + "")) {
                k--;
                res.deleteCharAt(res.length() - 1);
            }
           res.append(num.charAt(i));
        }
        while (k-- > 0) {
            res.deleteCharAt(res.length() - 1);
        }

        //前导0
        while (k+1<res.length()&&res.charAt(k)=='0') k++;
        System.out.println(res.substring(k));
    }
}
