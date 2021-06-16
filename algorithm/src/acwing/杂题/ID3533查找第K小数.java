package acwing.杂题;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author: yeah
 */
public class ID3533查找第K小数 {
    static int n;
    static TreeSet<Integer> tree = new TreeSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            tree.add(in.nextInt());
        }
        int k = in.nextInt();
        int x = 0;
        for (int i = 0; i < k && !tree.isEmpty(); i++) {
            x = tree.pollFirst();
        }
        System.out.println(x);
    }
}
