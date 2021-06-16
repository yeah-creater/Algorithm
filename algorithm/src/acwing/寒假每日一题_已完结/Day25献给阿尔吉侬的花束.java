package acwing.寒假每日一题_已完结;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/11 - 21:37
 */
class Node{
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Day25献给阿尔吉侬的花束 {
    static final int N=250;
    static int r,c;
    static char [][]q=new char[N][N];
    static int[][]dis=new int[N][N];//标记和'S'的距离
    static int bfs(int x,int y){
        Deque<Node> queue=new ArrayDeque<>();
        Node node=new Node(x,y);
        queue.add(node);
        q[x][y]='#';
        int []dx={-1,0,1,0},dy={0,1,0,-1};
        while (!queue.isEmpty()){
            Node n = queue.pollFirst();
            for(int i=0;i<4;i++){
                int a=n.x+dx[i];
                int b=n.y+dy[i];
                if(a>=0&&a<r&&b>=0&&b<c&&q[a][b]!='#'){
                    queue.addLast(new Node(a,b));
                    if (q[a][b]=='E') return dis[n.x][n.y]+1;
                    q[a][b]='#';
                    dis[a][b]=dis[n.x][n.y]+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n-->0){
            r=in.nextInt();
            c=in.nextInt();
            dis=new int[N][N];
            for(int i=0;i<r;i++){
                String str=in.next();
                for(int j=0;j<c;j++) q[i][j]=str.charAt(j);
            }
            for(int i=0;i<r;i++){
                boolean flag=false;
                for(int j=0;j<c;j++){
                    if(q[i][j]=='S'){
                        flag=true;
                        int t=bfs(i,j);
                        if(t==-1) System.out.println("oop!");
                        else System.out.println(t);
                        break;
                    }
                }
                if(flag) break;
            }
        }
    }
}
