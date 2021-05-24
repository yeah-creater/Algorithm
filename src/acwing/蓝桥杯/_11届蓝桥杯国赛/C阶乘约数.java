package acwing.蓝桥杯._11届蓝桥杯国赛;

import java.util.HashMap;
import java.util.Set;

/**
 * @author: yeah
 * 约数的个数 是质因子 指数+1 。。。
 */
public class C阶乘约数 {
    static HashMap<Integer, Integer> map = new HashMap<>();

    static void init(int x) {
        for (int i = 2; i <= x / i; i++) {
            if (x % i == 0) {
                int res = 0;
                while (x % i == 0) {
                    res++;
                    x /= i;
                }
                map.merge(i, res, Integer::sum);
            }
        }
        if (x > 1) map.merge(x, 1, Integer::sum);
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            init(i);
        }
        long res = 1;
        Set<Integer> keys = map.keySet();
        for (int i : keys) {
            res *= (map.get(i) + 1);
        }
        System.out.println(res);
    }
}
