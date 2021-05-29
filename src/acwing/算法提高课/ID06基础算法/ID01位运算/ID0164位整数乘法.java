package acwing.算法提高课.ID06基础算法.ID01位运算;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author: yeah
 * 用加法实现乘法
 */
public class ID0164位整数乘法 {
    static long a,b,p;
    static long slowMul(long a,long b,long p){
        long res=0;
        while (b>0){
            if((b&1)==1){
                res=(res+a)%p;
            }
            b>>=1;
            a=a*2%p;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a=in.nextLong();
        b=in.nextLong();
        p=in.nextLong();
        System.out.println(slowMul(a,b,p));


    }
}
