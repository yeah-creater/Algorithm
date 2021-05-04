package acwing.gplt;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author: yeah
 */
public class ID3464包装机 {
    static Deque<Character>[] q = new Deque[110];
    static Stack<Character> stack = new Stack<>();
    static int n, m, s;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();
        for (int i = 1; i <= n; i++) {
            String s = in.next();
            q[i] = new ArrayDeque<>();
            for (int j = 0; j < s.length(); j++) {
                q[i].addLast(s.charAt(j));
            }
        }
        while (true) {
            int x = in.nextInt();
            if (x == -1) break;
            if (x == 0) {
                if (!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
            } else {
                if (q[x].size() != 0) {
                    if (stack.size() == s) {
                        bw.write(stack.pop());
                    }
                    stack.add(q[x].pollFirst());
                }
            }
        }
        bw.flush();
    }
}
