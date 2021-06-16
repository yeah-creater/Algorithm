package acwing.杂题;


import java.util.*;

/**
 * @author Yeah
 * @date 2021/3/23 - 12:25
 * 使用数组模拟链表
 */

public class ID02链表去重 {
    static HashMap<String, Integer> map = new HashMap<>();//地址和数组下标的映射
    static HashMap<Integer, String> map2 = new HashMap<>();//地址和数组下标的映射
    static HashSet<Integer> set = new HashSet<>();//保存已存在的值
    static int[] e = new int[100010];
    static String[] ne = new String[100010];
    static String head;
    static int idx, n;
    static Deque<String> left = new ArrayDeque<>();
    static Deque<String> del = new ArrayDeque<>();//保存删除结点的地址

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        head = in.next();
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String add = in.next();
            int value = in.nextInt();
            String next = in.next();
            map.put(add, idx);
            map2.put(idx, add);
            e[idx] = value;
            ne[idx] = next;
            idx++;
        }
        int t = map.get(head);
        for (int i = t; ; i = map.get(ne[i])) {
            if (set.contains(Math.abs(e[i]))) {
                del.addLast(map2.get(i));
            } else {
                set.add(Math.abs(e[i]));
                left.addLast(map2.get(i));
            }
            if (ne[i].equals("-1")) break;
        }

        while (!left.isEmpty()) {
            String s = left.pollFirst();
            System.out.print(s + " " + e[map.get(s)] + " ");
            if (!left.isEmpty()) {
                String next = left.getFirst();
                System.out.println(next);
            } else System.out.println(-1);
        }
        while (!del.isEmpty()) {
            String s = del.pollFirst();
            System.out.print(s + " " + e[map.get(s)] + " ");
            if (!del.isEmpty()) {
                String next = del.getFirst();
                System.out.println(next);
            } else System.out.println(-1);
        }
    }


}


