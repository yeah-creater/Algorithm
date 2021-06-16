package acwing.gplt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3462天梯赛的善良 {
    static HashMap<Integer, Integer> map = new HashMap<>();
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (String sub : s) {
            int x = Integer.parseInt(sub);
            map.merge(x, 1, Integer::sum);
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println(min + " " + map.get(min));
        System.out.println(max + " " + map.get(max));
    }
}
