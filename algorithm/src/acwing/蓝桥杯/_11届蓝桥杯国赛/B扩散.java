package acwing.蓝桥杯._11届蓝桥杯国赛;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author: yeah
 * 多源bfs
 * (0,0),(2020,11),(11,14),(2000,2000)。(2500,2500) (4520,2511) (2511,2514) (4500,4500)
 */
class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class B扩散 {
    static int N = 10010;
    static int[][] dist = new int[N][N];

    static void bfs() {
        dist[2500][2500] = 1;
        dist[4520][2511] = 1;
        dist[2511][2514] = 1;
        dist[4500][4500] = 1;
        Deque<Pair> q = new ArrayDeque<>();
        q.addLast(new Pair(2500, 2500));
        q.addLast(new Pair(4520, 2511));
        q.addLast(new Pair(2511, 2514));
        q.addLast(new Pair(4500, 4500));
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            Pair p = q.pollFirst();
            int x = p.x;
            int y = p.y;
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i];
                int b=y+dy[i];
                if(a>=0&&a<N&&b>=0&b<N){
                    if(dist[a][b]==0){
                        dist[a][b]=dist[x][y]+1;
                        q.addLast(new Pair(a,b));
                    }
                }
            }
        }


    }

    public static void main(String[] args) {
        bfs();
        long res=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(dist[i][j]<=2021){
                    res++;
                }
            }
        }
        System.out.println(res);//20312088
    }

}
