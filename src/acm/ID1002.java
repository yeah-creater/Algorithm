package acm;

import java.math.BigDecimal;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/13 - 17:45
 * @intention:ok
 */
public class ID1002 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        for(;i<n;i++){
                BigDecimal b1 = in.nextBigDecimal();
                BigDecimal b2 = in.nextBigDecimal();
                System.out.println("Case " + i + ":");
                System.out.print(b1 + " + " + b2 + " = " + b1.add(b2));
                System.out.println();
                System.out.println();
        }
        BigDecimal b1 = in.nextBigDecimal();
        BigDecimal b2 = in.nextBigDecimal();
        System.out.println("Case " + i + ":");
        System.out.println(b1 + " + " + b2 + " = " + b1.add(b2));
        in.close();
    }
}
