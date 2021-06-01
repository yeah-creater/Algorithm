package acwing.蓝桥杯._11届蓝桥杯国赛;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author: yeah
 * 本质是最长公共子序列 只是每个字符要变成字符串
 */
public class F蓝肽子序列 {
    static String s1, s2;
    static List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
    static HashMap<Integer, String> map1 = new HashMap<>(), map2 = new HashMap<>();
    static int[][] f = new int[10101][1010];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s1 = in.next();
        int sta = 0, idx = 1;
        for (int i = 0; i < s1.length(); i++) {
            if ((Character.isUpperCase(s1.charAt(i)) && i != 0)) {
                list1.add(idx);
                map1.put(idx++, s1.substring(sta, i));
                sta = i;
            }
        }
        list1.add(idx);
        map1.put(idx++, s1.substring(sta));

        s2 = in.next();
        sta = 0;
        idx = 1;
        for (int i = 0; i < s2.length(); i++) {
            if ((Character.isUpperCase(s2.charAt(i)) && i != 0)) {
                list2.add(idx);
                map2.put(idx++, s2.substring(sta, i));
                sta = i;
            }
        }
        list2.add(idx);
        map2.put(idx++, s2.substring(sta));
        int n = list1.size();
        int m = list2.size();



        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                if (map1.get(list1.get(i - 1)).equals(map2.get(list2.get(j - 1)))) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - 1] + 1);
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
