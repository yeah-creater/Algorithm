package acwing.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/16 - 10:56
 *
 * 考虑欠缺了
 */
public class Day32比例简化 {
    static double a,b;
    static int t,a1,b1;
    static boolean check1(int x){
        return a1/(x+0.0)>=a/b;
    }
    static boolean check2(int x){
        return (x+0.0)/b1>=a/b;
    }
    //获取两个数的最大公约数
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        t=in.nextInt();
        if(a>b) {
            a1=t;
            int l=0,r=t;
            while (l<r){
                int mid=l+r+1>>1;
                if(check1(mid)) l=mid;
                else r=mid-1;
            }
            b1=l;
        }
        else {
            b1=t;
            int l=0,r=t;
            while (l<r){
                int mid=l+r>>1;
                if(check2(mid)) r=mid;
                else l=mid+1;
            }
            a1=l;
        }
        System.out.println(a1/gcd(a1,b1)+" "+b1/gcd(a1,b1));
    }

}
