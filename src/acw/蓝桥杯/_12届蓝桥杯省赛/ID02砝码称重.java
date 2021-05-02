package acw.蓝桥杯._12届蓝桥杯省赛;

import java.util.Scanner;

/**
 * @author: yeah
 * f[i][j]表示从前i种砝码中选 且重量为j 属性为是否可以boolean
 */
public class ID02砝码称重 {
    static int m;
    static int M=100005;
    static int[]w=new int[110];
    static boolean [][]f=new boolean[110][200010];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            w[i]=in.nextInt();
            m+=w[i];
        }
        f[0][M]=true;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                f[i][j+M]=f[i-1][j+M];
                if(j-w[i]>=-m) f[i][j+M]|=f[i-1][j-w[i]+M];
                if(j+w[i]<=m) f[i][j+M]|=f[i-1][j+w[i]+M];
            }
        }
        int res=0;
        for(int i=1;i<=m;i++){
            if(f[n][i+M]) res++;
        }
        System.out.println(res);
    }
}
