package acwing.算法基础课.ID06贪心;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 按左端点进行排序
 * 从小到大判断是否可以放入某个组中
 * 1.不可以 l[i]>Max[r]  将其放入新的组中
 * 2.可以 l[i]<=Max[r]  将其放入并更新 max[r]
 */
class Pair3 {
    int x;
    int y;

    public Pair3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class ID01_2区间分组 {
    static Pair3[] p;
    static PriorityQueue<Integer> max = new PriorityQueue<>();//每个组的右端点

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        p = new Pair3[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            p[i] = new Pair3(x, y);
        }
        Arrays.parallelSort(p, 0, n, Comparator.comparingInt(Pair3::getX));
        int cnt = 0;
        for (Pair3 pair3 : p) {
            int l = pair3.x;
            if (max.isEmpty() || max.peek() >= l) {
                cnt++;
            } else {
                max.poll();
            }
            max.add(pair3.y);
        }
        System.out.println(cnt);
    }
}
