package acwing.杂题;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3616进制转换 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String t = in.next();
        int n = t.length();
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == 'a') {
                list.add(10);
                System.out.print(10 + " ");
            } else if (t.charAt(i) == 'b') {
                list.add(11);
                System.out.print(11 + " ");
            } else {
                list.add(Integer.parseInt(t.charAt(i) + ""));
                System.out.print(t.charAt(i) + " ");
            }
        }
        System.out.println();
        int d = 0;
        for (int i = 0; i < n; i++) {
            d = list.get(i) + d * 12;
        }
        System.out.println(d);
        String s = Integer.toBinaryString(d);
        for (int i = 1; i <= 32; i++) {
            if (i > 32 - s.length()) {
                System.out.print(s.charAt(i - 32 + s.length() - 1));
            } else {
                System.out.print(0);
            }
            if (i % 8 == 0) System.out.print(" ");
        }

    }

}
