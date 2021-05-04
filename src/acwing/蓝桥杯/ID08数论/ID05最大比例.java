package acwing.蓝桥杯.ID08数论;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/17 - 19:50
 */
public class ID05最大比例 {
    static long []q;
    static long an,a1;
    static long []fz=new long[1000010];
    static long[]fm=new long[1000010];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        q=new long[n];
        for(int i=0;i<n;i++)q[i]=in.nextLong();
        Arrays.sort(q);
        an=q[n-1];
        a1=q[0];
        if(an-a1==0){
            System.out.println(1);
            return;
        }
        //最大的等比值的分子为an约数，分母为a1约数
        //判断是否是最大公比时，只要从第二项开始都能整除它即可


    }
}
