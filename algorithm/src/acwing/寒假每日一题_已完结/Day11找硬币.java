package acwing.寒假每日一题_已完结;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/1 - 16:50
 * 双指针
 */
public class Day11找硬币 {
    static int []q;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        q=new int[n];
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        Arrays.sort(q);
        int l=0,r=n-1;
        while(l<r){
            while (q[l]+q[r]>m&&l<r)
                r--;
            if(q[l]+q[r]==m&&l<r) {
                System.out.println(q[l] + " " + q[r]);
                return;
            }
            l++;
        }
        System.out.println("No Solution");

    }
}
