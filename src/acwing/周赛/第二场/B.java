package acwing.周赛.第二场;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class B {
    static int t;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int[]q=new int[n];
            long res=0;
            for(int i=0;i<n;i++){
                q[i]=in.nextInt();
                res+=q[i];
            }
            Arrays.sort(q);
            if (k < n - 1) {
                int re = n - 1 - k;
                for (int i = 0; i < re; i++)
                    res -= q[i];
            }
            System.out.println(res);
        }
    }
}
