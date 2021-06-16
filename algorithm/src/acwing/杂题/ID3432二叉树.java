package acwing.杂题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: yeah
 * 求最近的父亲结点
 */
public class ID3432二叉树 {
    static HashSet<Integer> set = new HashSet<>();
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        while (x > 0) {
            set.add(x);
            x /= 2;
        }
        while (y > 0) {
            list.add(y);
            y /= 2;
        }
        for (int p : list) {
            if (set.contains(p)) {
                System.out.println(p);
                return;
            }
        }
    }
}
