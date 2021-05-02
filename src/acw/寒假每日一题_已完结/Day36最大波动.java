package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/16 - 21:32
 */
public class Day36最大波动 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a,b,max=-1;
        a=in.nextInt();
        for(int i=1;i<n;i++){
            b=in.nextInt();
            if(Math.abs(b-a)>max)
                max=Math.abs(b-a);
            a=b;
        }
        System.out.println(max);
    }
}
