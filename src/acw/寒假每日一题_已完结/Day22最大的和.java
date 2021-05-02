package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/7 - 21:41
 */
public class Day22最大的和 {
    static int[][]q=new int[110][110];
    static int[][]s=new int[110][110];

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                q[i][j]=in.nextInt();
                s[i][j]=s[i-1][j]+s[i][j-1]-s[i-1][j-1]+q[i][j];
            }
        }
        int max=-128;

        for(int i1=1;i1<=n;i1++){
            for(int j1=1;j1<=n;j1++){
                for(int i2=i1;i2<=n;i2++){
                    for(int j2=j1;j2<=n;j2++){
                        int val=s[i2][j2]-s[i1-1][j2]-s[i2][j1-1]+s[i1-1][j1-1];
                        max=Math.max(max,val);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
