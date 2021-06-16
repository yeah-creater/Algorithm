package acwing.算法提高课.ID05数学知识.ID03快速幂;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID01序列的第k个数 {
    static int n;
    static long qmi(long a,long b,long mod){
        long res=1%mod;
        while (b>0){
            if(((b&1)==1)){
                res=res*a%mod;
            }
            a=a*a%mod;
            b=b>>1;
        }
        return res%mod;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        while (n-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int k=in.nextInt();
            if(a==b){
                System.out.println(a);
            }
            //等差数列
            else if(c-b==b-a){
                int d=b-a;
                long res=a+ (long) (k - 1) *d;
                System.out.println(res%200907);
            }
            else{
                int q=b/a;
                long res=(qmi(q,k-1,200907)*a)%200907;
                System.out.println(res);
            }
        }
    }

}
