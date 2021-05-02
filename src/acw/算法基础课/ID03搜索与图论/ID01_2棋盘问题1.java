package acw.算法基础课.ID03搜索与图论;

import java.net.SocketTimeoutException;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/12 - 19:19
 */
public class ID01_2棋盘问题1 {
    static char[][]q=new char[10][10];
    static int cnt,n,k,m;
    static boolean []visit=new boolean[10];//记录哪列放过棋盘
    static void dfs(int u){
        if(m==k){
            cnt++;
            return;
        }
        if(u==n) return;
        for(int i=0;i<n;i++){
            if(!visit[i]&&q[u][i]=='#'){
                visit[i]=true;
                m++;
                dfs(u+1);
                m--;
                visit[i]=false;
            }
        }
        dfs(u+1);//核心
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (true){
            n=in.nextInt();
            k=in.nextInt();
            if(n==-1&&k==-1) break;
            for(int i=0;i<n;i++){
                String s=in.next();
                for(int j=0;j<n;j++)q[i][j]=s.charAt(j);
            }
            cnt=0;
            m=0;//记录放过几个棋子了
            dfs(0);
            System.out.println(cnt);

        }
    }
}
