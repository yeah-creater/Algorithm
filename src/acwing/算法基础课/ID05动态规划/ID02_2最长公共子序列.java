package acwing.算法基础课.ID05动态规划;

import java.util.Scanner;

/**
 * @purpose:
 * f[i][j]表示 所有在第一个序列的前i个字母出现，且在第二个序列的前j个字母出现的子序列
 */
public class ID02_2最长公共子序列 {
    static final int N=1010;
    static char[]a=new char[N],b=new char[N];
    static int [][]f=new int[N][N];
    static int n,m;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        String s=in.next();
        for(int i=1;i<=n;i++) a[i]=s.charAt(i-1);
        s=in.next();
        for(int i=1;i<=m;i++) b[i]=s.charAt(i-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                f[i][j]=Math.max(f[i-1][j],f[i][j-1]);
                if(a[i]==b[j]) f[i][j]=Math.max(f[i][j],f[i-1][j-1]+1);
            }
        }
        System.out.println(f[n][m]);
    }
}
