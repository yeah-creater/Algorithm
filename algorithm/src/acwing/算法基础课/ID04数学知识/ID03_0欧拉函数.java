package acwing.算法基础课.ID04数学知识;

import java.util.*;

/**
 * @author Yeah
 * @date 2021/3/19 - 19:59
 * 欧拉函数：求1到n中与n互质(最大公约数为1)的数的个数
 * N的质因数为 p1^a1*p2^a2...pn^an  则N的欧拉函数为 N*(1-1/p1)(1-1/p2)...(1-1/pn)
 */
public class ID03_0欧拉函数 {
    static TreeMap<Integer, Integer> map;//保存一个数的质因数及指数

    static void init(int n) {
        map = new TreeMap<>();
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                int res = 0;
                while (n % i == 0) {
                    res++;
                    n /= i;
                }
                map.put(i, res);
            }
        }
        if (n > 1) map.put(n, 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int x = in.nextInt();
            init(x);
            double res = x;
            Set<Integer> keySet = map.keySet();
            for (Integer i : keySet) {

                res *= (1 - 1.0 / i);
            }
            System.out.println((int) res);

        }
    }
}
