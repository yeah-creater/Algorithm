package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/13 - 16:55
 * @intention:ok
 */
public class ID1001 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            double d=in.nextDouble();
            System.out.printf("%.0f",(1+d)*(d/2));
            System.out.println();
            System.out.println();
        }
        in.close();
    }
}
