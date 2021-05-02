package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/9 - 21:48
 * f[i][j]表示从前i件选，并且钱数不大于j
 */
public class Day23开心的金明 {
    static int[][]f=new int[30][30010];
    static int[]v=new int[30];
    static int[]w=new int[30];
    static int n,m;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        for(int i=1;i<=m;i++){
            v[i]=in.nextInt();
            w[i]=in.nextInt();
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if (v[i]>j) f[i][j]=f[i-1][j];
                else{
                    f[i][j]=Math.max(f[i-1][j],v[i]*w[i]+f[i-1][j-v[i]]);
                }
            }
        }
        System.out.println(f[m][n]);
    }
}
