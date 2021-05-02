package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/16 - 16:56
 */
public class Day34Z字形扫描 {
    static int[][]q=new int[510][510];
    static int n;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                q[i][j]=in.nextInt();
        }
        int line=2*n-1;//对角线个数
        int []dx={1,-1},dy={-1,1};//左下，右上
        for(int i=1;i<=line;i++){
            int cnt=n-Math.abs(i-n);//计算对角线数的个数
            int x=i,y=1;
            //奇对角线
            if(x%2==1){
                if(x>n) {x=n;y=1+i-n;}
                for(int j=1;j<=cnt;j++) {
                    System.out.print(q[x][y]+" ");
                    x=x+dx[1];y=y+dy[1];
                }
            }
            else{
                x=1;y=i;
                if(y>n){y=n;x=1+i-n;}
                for(int j=1;j<=cnt;j++) {
                    System.out.print(q[x][y]+" ");
                    x=x+dx[0];y=y+dy[0];
                }
            }

        }
    }
}
