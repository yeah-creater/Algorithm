package acw.算法基础课.ID04数学知识;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/20 - 15:00
 * Cba=Cb−1a−1+Cba−1
 * 递推求组合数
 */
public class ID08_0求组合数I {
    static final int P=1000*1000*1000+7;
    static final int N=2010;
    static int [][]f=new int[N][N];
    public static void main(String[] args) {
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                if(j==0) f[i][j]=1;
                else f[i][j]=(f[i-1][j]+f[i-1][j-1])%P;
            }
        }
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n-->0){
            int i=in.nextInt();
            int j=in.nextInt();
            System.out.println(f[i][j]);
        }
    }
}
