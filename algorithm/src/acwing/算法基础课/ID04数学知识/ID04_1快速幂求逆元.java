package acwing.算法基础课.ID04数学知识;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/20 - 14:16
 * a/b 与a * x   （mod m） 相等 则称x为b的逆元 记作 b^-1
 *  a 与 a*b*b^-1 （mod m）相等  即  b*b^-1 与 1  (mod m)相等
 *  根据费马定理  b^p-1 与 1（mod m）相等  所以 b* b^p-2与 1  (mod m)相等
 *  所以这道题就求解 a^p-2 mod p
 */
public class ID04_1快速幂求逆元 {
    static long qmi(long a,long b,long p){
        long res=1;
        while(b>0){
            if((b&1)==1) res=res%p*a%p;
            a=a%p*a%p;
            b=b>>1;
        }
        return res%p;
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            int p=in.nextInt();
            long val=qmi(a,p-2,p);
            if(a%p==0) System.out.println("impossible");
            else System.out.println(val);
        }
    }
}
