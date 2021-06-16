package acwing.寒假每日一题_已完结;

import java.util.*;

/**
 * @author Yeah
 * @date 2021/3/4 - 12:50
 *
 * 末尾0的个数取决于质因数 2 和5的个数
 * n!的阶乘末尾有k个0
 * res= n!/10^k  %10
 */
public class Day15阶乘 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int res=1,d2=0,d5=0;
        for(int i=1;i<=n;i++){
            int x=i;
            while (x%2==0){
                x/=2;
                d2++;
            }
            while (x%5==0){
                x/=5;
                d5++;
            }
            res=res*x%10;
        }
        int k=Math.min(d2,d5);
        for(int i=0;i<d2-k;i++) res=res*2%10;
        for(int i=0;i<d5-k;i++) res=res*5%10;
        System.out.println(res);
    }
}
