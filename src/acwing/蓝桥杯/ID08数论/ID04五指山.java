package acwing.蓝桥杯.ID08数论;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/17 - 17:31
 * 扩展欧几里得算法
 * 若(a,b)的最大公约数为d
 * 则必然存在整数 x，y 使得 ax+by=d
 */
class Obj{
    long v;


}
public class ID04五指山 {
    static Obj x=new Obj();
    static Obj y=new Obj();
    //返回最大公约数
    static int exGcd(int a,int b,Obj x,Obj y){
        if(b==0){
            x.v=1;
            y.v=0;
            return a;
        }
        int d=exGcd(b,a%b,y,x);
        y.v-=a/b*x.v;
        return d;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++) {
            int n = in.nextInt();
            int d = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int gcd=exGcd(n,d, x,y);
            if((y1-x1)%gcd!=0) System.out.println("Impossible");
            else{
                y.v*=(y1-x1)/gcd;
                n/=gcd;
                System.out.println(((y.v)%n+n)%n);
            }
        }

    }
}
