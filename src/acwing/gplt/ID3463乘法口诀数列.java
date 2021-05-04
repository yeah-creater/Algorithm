package acwing.gplt;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3463乘法口诀数列 {
    static Deque<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int n = in.nextInt();
        q.addLast(a1);
        q.addLast(a2);
        for (int i = 0; i < n; i++) {
            System.out.print(q.getFirst() + " ");
            int x = q.pollFirst() * q.getFirst();
            if (x < 10) q.addLast(x);
            else {
                q.addLast(x / 10);
                q.addLast(x % 10);
            }
        }
    }
}
