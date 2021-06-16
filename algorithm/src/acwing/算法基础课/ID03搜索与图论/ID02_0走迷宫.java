package acwing.算法基础课.ID03搜索与图论;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/1 - 14:58
 */
class Pair{
    int x;
    int y;
    int rank;//记录到源点的距离
    String path;//记录到源点到它的路径

    public Pair(int x, int y,int rank,String path) {
        this.x = x;
        this.y = y;
        this.rank=rank;
        this.path=path;
    }
}
public class ID02_0走迷宫 {
    static int [][]q=new int[110][110];
    static int n,m;
    static int bfs(){
        Deque<Pair> deque=new ArrayDeque<Pair>();
        deque.addLast(new Pair(1,1,0,""));
        while(!deque.isEmpty()){
            Pair pair = deque.pollFirst();
            int []dx={-1,0,1,0},dy={0,1,0,-1};
            for(int i=0;i<4;i++){
                int a=pair.x+dx[i];
                int b=pair.y+dy[i];
                if(a>=1&&a<=n&&b>=1&&b<=m&&q[a][b]==0) {
                    if(a==n&&b==m) {
                        System.out.println(pair.path+i);
                        return pair.rank+1;
                    }
                    deque.addLast(new Pair(a, b, pair.rank + 1,pair.path+i));
                    q[a][b]=1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
                q[i][j]=in.nextInt();
        }
        int res=bfs();
        System.out.println(res);
    }
}
