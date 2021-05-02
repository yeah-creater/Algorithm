package acw.算法基础课.ID03搜索与图论;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @date 2021/3/29 - 17:30
 * Prime O(n^2) 朴素版(稠密图)m比较大
 * Kruskal  O(m log m) (稀疏图)
 */
public class ID05_0Prime {
    static final int N=5010;
    static final int INT=65536;
    static int n,m;
    static int[][]g=new int[N][N];
    static int []dist=new int[N];
    static boolean[]st=new boolean[N];
    static int prime(){
        int res=0;
        //初始化每个点到集合(最小生成树)的距离
        for(int i=1;i<=n;i++) Arrays.fill(dist,INT);

        for(int i=0;i<n;i++){
            int t=-1;
            for(int j=1;j<=n;j++){
                if(!st[j]&&(t==-1||dist[j]<dist[t]))
                    t=j;
            }
            if(i>0&&dist[t]==INT) return INT;
            //i==0 表示确定最小生成树的源点(其实没有源点)
            if(i>0) res+=dist[t];
            for(int j=1;j<=n;j++)
                dist[j]=Math.min(dist[j],g[t][j]);//更新点到集合的最短距离
            st[t]=true;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        for(int i=1;i<=n;i++) Arrays.fill(g[i],INT);

        for(int i=0;i<m;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            g[a][b]=g[b][a]=c;
        }
        int t=prime();
        if(t==INT) System.out.println(-1);
        else System.out.println(t);

    }
}
