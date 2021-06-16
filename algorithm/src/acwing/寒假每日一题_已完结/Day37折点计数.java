package acwing.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/16 - 21:37
 */
public class Day37折点计数 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++) a[i]=in.nextInt();
        int ans=0;
        for(int i=1;i<n-1;i++)
            if(a[i]>a[i-1]&&a[i]>a[i+1]||a[i]<a[i-1]&&a[i]<a[i+1]) ans++;
        System.out.println(ans);

    }
}
