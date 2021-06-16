package acwing.寒假每日一题_已完结;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/23 - 10:34
 *
 * 1233. 全球变暖
 *
 * 思路：根据FloodFill bfs每个岛屿的同时，判断该岛屿是否会被整个淹没
 */
class Point2{
    int x;
    int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Day04S {
    static char[][]oldI=new char[1010][1010];
    static int n;
    static int cnt=0;//标记被淹没的岛屿数

    static void bfs(int x,int y){
        //默认该整个岛屿会被淹没
        cnt++;
        //模拟队列
        ArrayList<Point2> queue=new ArrayList();
        queue.add(new Point2(x,y));
        //标记为。表示是被淹没的小岛屿
        oldI[x][y]='。';
        //标记是否会被淹没
        boolean flag=true;
        int []dx={-1,0,1,0},dy={0,1,0,-1};
        while (!queue.isEmpty()){
            //出队列
            Point2 point = queue.get(0);
            queue.remove(0);
            for(int i=0,j=0;i<4;i++) {
                int a = point.x+dx[i];
                int b = point.y+dy[i];
                //进入该循环，说明该小岛屿的一边原来是小岛屿
                if(a>=0&&a<n&&b>=0&&b<n&&oldI[a][b]!='.')
                    j++;
                if(a>=0&&a<n&&b>=0&&b<n&&oldI[a][b]=='#') {
                    queue.add(new Point2(a, b));
                    //该小岛屿被淹没
                    oldI[a][b]='。';
                }
                //如果j==4 说明该整个岛屿不会全被淹没
                if(j==4){
                    flag=false;
                }
            }
        }
        if(!flag)
            cnt--;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++){
            String s=in.next();
            for(int j=0;j<n;j++){
                oldI[i][j]=s.charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                if(oldI[i][j]=='#') {
                    bfs(i, j);
                }
        }
        System.out.println(cnt);
    }
}

