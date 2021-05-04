package acwing.蓝桥杯.ID03数学和DP;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/8 - 19:27
 * 自上而下的做法
 */
public class ID04摘花生 {
    static int [][]q=new int[110][110];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n-->0){
            int r=in.nextInt();
            int v=in.nextInt();
            for(int i=1;i<=r;i++){
                for(int j=1;j<=v;j++)
                    q[i][j]=in.nextInt();
            }
            for(int i=1;i<=r;i++){
                for(int j=1;j<=v;j++){
                    q[i][j]+=Math.max(q[i-1][j],q[i][j-1]);
                }
            }
            System.out.println(q[r][v]);
        }
    }
}
