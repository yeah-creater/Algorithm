package acw.春季每日一题_已完结;

import java.util.Scanner;

/**
 * @purpose:  思路：求出当前串的最长回文子串
 * f[i][j]表示i到j的回文子序列
 * 属性:最大值
 * */
public class Day16密码脱落 {
    static int [][]f=new int[1010][1010];

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int n=str.length();
        for(int len=1;len<=n;len++){
            for(int i=0;i+len-1<n;i++){
                int j=i+len-1;
                if(len==1) f[i][j]=1;
                else {
                    f[i][j] = Math.max(f[i + 1][j], f[i][j - 1]);
                    if (str.charAt(i) == str.charAt(j))
                        f[i][j] = Math.max(f[i][j], f[i + 1][j - 1] + 2);
                }
            }
        }
        System.out.println(n-f[0][n-1]);
    }
}
