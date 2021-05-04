package acwing.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/16 - 11:22
 */
public class Day32比例简化2 {
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int l=in.nextInt();
        double s=(a+0.0)/b;
        int a1=0,b1=0;
        double min=1000;
        for(int i=1;i<=l;i++){
            for(int j=1;j<=l;j++){
                double ans=(i+0.0)/j;
                if(gcd(i,j)==1&&ans-s>0.000001){
                    if(ans-s<min){
                        min=ans-s;
                        a1=i;
                        b1=j;
                    }
                }
            }
        }
        System.out.println(a1+" "+b1);

    }
}
