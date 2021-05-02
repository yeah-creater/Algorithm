package acw.算法基础课.ID06贪心;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @purpose: 赫夫曼数问题
 */
public class ID02_0合并果子 {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        int res = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) heap.add(in.nextInt());
        while (heap.size() > 1) {//不是一堆就合并
            int x = heap.poll();
            int y = heap.poll();
            res += x + y;
            heap.add(x + y);
        }
        System.out.println(res);
    }
}
