package acwing.算法基础课.ID01基础算法;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/28 - 15:06
 * 划水
 */
public class ID04_1高精度减法 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BigInteger a=in.nextBigInteger();
        BigInteger b=in.nextBigInteger();
        System.out.println(a.subtract(b));
    }
}
