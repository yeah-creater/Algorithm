package acwing.蓝桥杯.ID05树状数组与线段树;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/9 - 21:00
 * 待改进
 * 树状数组：动态地求前缀和(logN 给某个位置上的数加上一个数(单点修改) 求前缀和(区间查询))
 */
public class ID01动态求连续区间和 {
    static int []q=new int[100010];
    static int []s=new int[100010];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=1;i<=n;i++){
            q[i]=in.nextInt();
            s[i]=s[i-1]+q[i];
        }
        while (m-->0){
            int k=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            if(k==0) System.out.println(s[b]-s[a-1]);
            else{
                for(int i=a;i<=n;i++) s[i]+=b;
            }

        }
    }
}
