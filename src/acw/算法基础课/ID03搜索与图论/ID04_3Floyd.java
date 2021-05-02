package acw.算法基础课.ID03搜索与图论;

import java.util.Scanner;


public class ID04_3Floyd {
    static final int N=210;
    static int[][]d=new int[N][N];
    static int n,m,q;
    static void floyd(){
        for(int mid=1;mid<=n;mid++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    d[i][j]=Math.min(d[i][j],d[i][mid]+d[mid][j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        q=in.nextInt();
        //预处理图
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j) d[i][j]=0;
                else d[i][j]=65536;
            }
        }
        //初始化图
        for(int i=0;i<m;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int x=in.nextInt();
            //图中可能存在重边和自环，边权可能为负数。
            d[a][b]=Math.min(d[a][b],x);
        }
        floyd();
        for(int i=0;i<q;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            //边权可能为负数。
            if(d[a][b]>65536/2) System.out.println("impossible");
            else System.out.println(d[a][b]);
        }
    }
}
