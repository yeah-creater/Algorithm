package acwing.算法基础课.ID03搜索与图论;

import java.util.Arrays;
import java.util.Scanner;



/**
 * @author Yeah
 * @date 2021/3/1 - 14:07
 */
public class ID01_1n皇后问题 {
    static final int N=20;
    static char [][]path=new char[N][N];
    static boolean []col=new boolean[N]; //列
    static boolean []dg=new boolean[N]; //主对角线
    static boolean []udg=new boolean[N];//副对角线
    static int n;
    static void print(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print(path[i][j]);
            System.out.println();
        }
        System.out.println();
    }
    static void dfs(int u){
        if(u==n+1){
           print();
           return;
        }
        for(int i=1;i<=n;i++){
            if(!col[i]&&!dg[u+i]&&!udg[n-u+i]){
                path[u][i]='Q';
                col[i]=dg[u+i]=udg[n-u+i]=true;
                dfs(u+1);
                //恢复现场
                path[u][i]='.';
                col[i]=dg[u+i]=udg[n-u+i]=false;
            }
        }


    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++)
            Arrays.fill(path[i],'.');
        dfs(1);
    }
}
