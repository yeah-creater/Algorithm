package acwing.算法基础课.ID06贪心;


import java.util.Arrays;
import java.util.Scanner;

public class ID03_0排队打水 {
    static int []q;
    static int n;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        q=new int[n];
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        Arrays.sort(q);
        long res=0;
        for(int i=1;i<n;i++){
            res+=q[i-1]*(n-i);
        }
        System.out.println(res);

    }
}
