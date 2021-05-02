package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/22 - 16:23
 * @intention:  最小公倍数等于两数相乘除最大公约数
 */
public class ID1108 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while (in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();
            int max=Math.max(a,b);
            int min=Math.min(a,b);
            int c;
            while (min!=0){
                c=max;
                max=min;
                min=c%min;
            }
            //max为最大公约数
            System.out.println(a*b/max);
        }

    }
}
