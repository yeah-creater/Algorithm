package acw.春季每日一题;

import java.util.Scanner;

/**
 * @purpose:
 */
public class Day15接雨水一维 {
    static int N=10010;
    static int []q=new int[N],right=new int[N],left=new int[N];//第n个元素左右边的最大值
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            q[i]=in.nextInt();
        right[n-1]=q[n-1];
        left[0]=q[0];
        for(int i=1;i<n-1;i++)
            left[i]=Math.max(left[i-1],q[i]);
        for(int i=n-2;i>=1;i--)
            right[i]=Math.max(right[i+1],q[i]);
        int sum=0;
        for(int i=1;i<n-1;i++){
            sum+=Math.max(0,Math.min(left[i],right[i])-q[i]);
        }
        System.out.println(sum);
    }
}
