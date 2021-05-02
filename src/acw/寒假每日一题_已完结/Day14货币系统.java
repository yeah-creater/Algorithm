package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/4 - 10:41
 */
public class Day14货币系统 {
    static int[][]f=new int[30][100010];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        f[0][0]=0;
        for(int i=1;i<=n;i++){
            int v=in.nextInt();
            for(int j=0;j<=m;j++){
                f[i][j]=f[i-1][j];
                if(j>=v) f[i][j]+=f[i-1][j-v];
            }
        }
        System.out.println(f[n][m]);
    }
}
