package acw.寒假每日一题_已完结;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/22 - 21:07
 *
 * id 1113. 红与黑
 * Flood Fill算法:主要针对网格图，找联通的区域
 *               分为dfs(比较方便)和bfs(能够求最短距离)
 *
 * 扩展题：搜Flood Fill
 */
class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Day04_FloodFill {

    static char[][]f=new char[25][25];
    static int cnt=0;
    static int w,h;
    static void dfs(int x,int y){
        f[x][y]='#';
        cnt++;
        int[]dx={-1,0,1,0},dy={0,1,0,-1};
        //按照上右下左的顺序
        for(int i=0;i<4;i++){
            int a=x+dx[i],b=y+dy[i];
            if(a<0||a>=h||b<0||b>=w||f[a][b]=='#') continue;
            dfs(a,b);
        }
    }

    static void bfs(int x,int y) {
        //模拟队列
        ArrayList<Point> queue=new ArrayList();
        queue.add(new Point(x,y));
        f[x][y]='#';
        int []dx={-1,0,1,0},dy={0,1,0,-1};
        while (queue.size()!=0){
            //出队列
            Point point = queue.get(0);
            queue.remove(0);
            cnt++;
            for(int i=0;i<4;i++){
                int a=point.x+dx[i],b=point.y+dy[i];
                if(a<0||a>=h||b<0||b>=w||f[a][b]=='#') continue;
                queue.add(new Point(a,b));
                f[a][b]='#';
            }
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (true){
            w = in.nextInt();
            h = in.nextInt();
            if(w==h&&w==0) break;
            cnt=0;
            int x = 0, y = 0;//记录开始坐标
            for (int i = 0; i < h; i++) {
                String s = in.next();
                for (int j = 0; j < s.length(); j++) {
                    f[i][j] = s.charAt(j);
                    if (f[i][j] == '@') {
                        x = i;
                        y = j;
                    }
                }
            }
            //dfs(x, y);
            bfs(x,y);
            System.out.println(cnt);
        }


    }
}
