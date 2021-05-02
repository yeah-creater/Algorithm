package acw.算法基础课.ID05动态规划;

import java.util.Scanner;

/**
 * @purpose:
 */
public class ID01_001背包问题 {
    static final int N=1010;
    static int[]v=new int[N],w=new int[N],f=new int[N];
    static int n,m;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        for(int i=1;i<=n;i++){
            v[i]=in.nextInt();
            w[i]=in.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=m;j>=v[i];j--){
                f[j]=Math.max(f[j],f[j-v[i]]+w[i]);
            }
        }
        System.out.println(f[m]);
    }
}
