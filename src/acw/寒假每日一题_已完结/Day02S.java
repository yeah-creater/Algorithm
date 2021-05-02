package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/20 - 21:06
 */
public class Day02S {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int[][]f=new int[110][110];
            int r=in.nextInt();
            int c=in.nextInt();
            for(int j=1;j<=r;j++){
                for(int k=1;k<=c;k++){
                    f[j][k]=in.nextInt();
                }
            }
            for(int j=r;j>=1;j--){
                for(int k=c;k>=1;k--){
                    f[j][k]+=Math.max(f[j+1][k],f[j][k+1]);
                }
            }
            System.out.println(f[1][1]);
        }

    }
}
