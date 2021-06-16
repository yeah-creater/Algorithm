package acwing.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/13 - 12:10
 */
public class Day26快速幂 {
    static long qmi(long a,long b,long p){
        long res=1;
        while (b>0){
            if((b&1)==1) res=res%p*a%p;
            a=a%p*a%p;
            b>>=1;
        }
        return res%p;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            long p=in.nextLong();
            System.out.println(qmi(a,b,p));
        }
    }
}
