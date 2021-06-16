package acwing.杂题;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3680爬楼梯游戏 {
    static BigInteger[] f = new BigInteger[100000010];
    static int n;
    static BigInteger mod = new BigInteger("1000000007");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        f[1] = new BigInteger("1");
        f[2] = new BigInteger("2");
        n = in.nextInt();
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1].add(f[i - 2]);
        }
        System.out.println(f[n].mod(mod));
    }
}
