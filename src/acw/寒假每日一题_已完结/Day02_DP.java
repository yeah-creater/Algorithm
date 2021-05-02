package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
@author Yeah
@date 2021/2/20 - 12:18
 id898  扩展1015

 思路：从下往上爬是比较简单 DP
*/
public class Day02_DP {
    static int[][]a=new int[510][510];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                a[i][j]=Math.max(a[i+1][j],a[i+1][j+1])+a[i][j];
            }
        }
        System.out.println(a[1][1]);
    }
}
