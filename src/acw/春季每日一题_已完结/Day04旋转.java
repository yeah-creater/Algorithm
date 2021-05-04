package acw.春季每日一题_已完结;


import java.util.Scanner;

/**
 * 模拟题
 */
public class Day04旋转 {
    static int[][]q=new int[110][110];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
                q[i][j]=in.nextInt();
        }
        for(int i=1;i<=m;i++){
            for(int j=n;j>=1;j--){
                System.out.print(q[j][i]+" ");
            }
            System.out.println();
        }
    }
}

