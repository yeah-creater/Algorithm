package acwing.算法基础课.ID05动态规划;


import java.util.Scanner;

public class ID02_1最长上升子序列 {
    static final int N=1010;
    static int []q=new int[N];
    static int []s=new int[N];//表示以当前数结尾的最长长度
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++) q[i]=in.nextInt();
        for(int i=1;i<=n;i++){
            s[i]=1;
            for(int j=1;j<i;j++){
                if(q[i]>q[j]) s[i]=Math.max(s[i],s[j]+1);
            }
        }
        int max=0;
        for(int i=1;i<=n;i++)
            if(s[i]>max) max=s[i];
        System.out.println(max);

    }
}
