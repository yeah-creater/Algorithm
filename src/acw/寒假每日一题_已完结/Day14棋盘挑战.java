package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/3 - 13:31
 * 八皇后类似
 */
public class Day14棋盘挑战 {
    static int n;
    static int cnt;
    static int []path=new int[15];
    static boolean []vol=new boolean[15];
    static boolean []dg=new boolean[30];
    static boolean []udg=new boolean[30];
    static void dfs(int u){
        if(u==n+1){
            if(cnt<3) {
                for (int i = 1; i <= n; i++)
                    System.out.print(path[i] + " ");
                System.out.println();
            }
            cnt++;
            return;
        }
        for(int i=1;i<=n;i++){
            if(!vol[i]&&!dg[u+i]&&!udg[n-u+i]){
                path[u]=i;
                vol[i]=dg[u+i]=udg[n-u+i]=true;
                dfs(u+1);
                vol[i]=dg[u+i]=udg[n-u+i]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        dfs(1);
        System.out.println(cnt);
    }
}
