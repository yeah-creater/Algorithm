package acwing.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/16 - 21:17
 */
public class Day35画图 {
    static int [][]q=new int[110][110];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();
            int y2=in.nextInt();
            for(int j=x1+1;j<=x2;j++){
                for(int k=y1+1;k<=y2;k++) {
                    q[j][k] = 1;
                }
            }
        }
        int cnt=0;
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
                if(q[i][j]==1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
