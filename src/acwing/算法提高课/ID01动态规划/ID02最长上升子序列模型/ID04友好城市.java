package acwing.算法提高课.ID01动态规划.ID02最长上升子序列模型;

import java.util.*;

/**
 * @author: yeah
 * 思路：以一端城市为基准排序  然后求另一端对应友好城市的最长上升子序列
 */
public class ID04友好城市 {
    static TreeMap<Integer, Integer> map = new TreeMap<>();
    static int[] f = new int[5010];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            map.put(x, y);
        }
        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>(set);
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            f[i] = 1;
            for (int j = 0; j < i; j++) {
                if (map.get(list.get(i)) > map.get(list.get(j))) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            res = Math.max(res, f[i]);
        }
        System.out.println(res);
    }
}
