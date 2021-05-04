package acwing.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/23 - 15:53
 * 相对于整数二分比较简单，不要比较边界
 */
/* 模板
* void bSearch(double l,double r){
        double exp=0.00000001;
        while (r-l>exp){
            double mid=(r+l)/2;
            //满足某种情况时
            if(check(mid)) r=mid;
            else l=mid;
        }
    }
*
*
*
 */
public class ID03_1浮点数二分 {
    static double exp=0.00000001;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        //100够满足情况了
        double l=0,r=100.0;
        while (r-l>exp){
            double mid=(r+l)/2;
            if(mid*mid*mid>=Math.abs(x)) r=mid;
            else l=mid;
        }
        if(x<0) System.out.print("-");
        System.out.printf("%.6f",l);

    }
}
