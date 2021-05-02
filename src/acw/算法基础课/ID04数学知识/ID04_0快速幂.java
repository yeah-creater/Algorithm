package acw.算法基础课.ID04数学知识;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/20 - 14:02
 * a^k 将k转化成二进制    比如是10011  所以a^k  =a^2^4*a^2^1.。。:反复平方法
 */
public class ID04_0快速幂 {
    static long qmi(long a,long b,long p){
        long sum=1;
        while (b>0){
            if((b&1)==1) sum=sum%p*a%p;
            a=a%p*a%p;
            b=b>>1;
        }
        return sum%p;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int p=in.nextInt();
            System.out.println(qmi(a,b,p));
        }
    }
}
