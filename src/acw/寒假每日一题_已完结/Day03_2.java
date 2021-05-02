package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/21 - 21:16
 * y总第一个讲的偏移量来做
 */
public class Day03_2 {
    static final int N=105;
    static int[][]f=new int[N][N];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        //x相对于行，y相对于列
        int dx[]={-1,0,1,0},dy[]={0,1,0,-1};
        int d=1;
        //从(1,1)开始走
        int x=1,y=1;
        //先输出再走(走到的时候有判断)
        for(int i=1;i<=n*m;i++){
            f[x][y]=i;
            int a=x+dx[d];
            int b=y+dy[d];
            //判断是否越界
            if(a<1||a>n||b<1||b>m||f[a][b]>0){
                d=(d+1)%4;
                a=x+dx[d];
                b=y+dy[d];
            }
            x=a;y=b;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
        }


    }
}
