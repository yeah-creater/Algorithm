package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/15 - 12:04
 * 二进制映射 ：比如k^4 +k^2+k^0  就可以映射成10101
 * 所以第n项  对应的就是  二进制的第n项   即n转化从二进制
 */
public class Day28数列 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        String bs = Integer.toBinaryString(n);
        //将二进制转化成k进制
        int res = 0;
        for (int i = 0; i < bs.length(); i++) {
            res = res * k + Integer.parseInt(bs.charAt(i) + "");
        }
        System.out.println(res);

    }
}
