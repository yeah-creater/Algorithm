package acwing.算法基础课.ID03搜索与图论;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Yeah
 * @date 2021/3/1 - 15:51
 */
class Pair1{
    int x;
    int y;
    String path;//上一点节点和自己的坐标

    public Pair1(int x, int y,String path) {
        this.x = x;
        this.y = y;
        this.path=path;
    }
}
public class ID02_1迷宫问题 {
    static int [][]q=new int[1010][1010];
    static int n,m;
    static void bfs() throws Exception{
        Deque<Pair1> deque=new ArrayDeque<Pair1>();
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        deque.addLast(new Pair1(0,0,"0 0"));
        while(!deque.isEmpty()){
            Pair1 pair = deque.pollFirst();
            int []dx={-1,0,1,0},dy={0,1,0,-1};
            for(int i=0;i<4;i++){
                int a=pair.x+dx[i];
                int b=pair.y+dy[i];
                if(a>=0&&a<n&&b>=0&&b<m&&q[a][b]==0) {
                    if(a==n-1&&b==m-1) {
                        String[] split = pair.path.split("-");
                        for(int j=0;j<split.length;j++)
                            bw.write(split[j]+"\n");
                        bw.write((n-1)+" "+(n-1));
                        bw.flush();
                        return;
                    }
                    deque.addLast(new Pair1(a, b,pair.path+"-"+a+" "+b));
                    q[a][b]=1;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        m=n;
        for(int i=0;i<n;i++){
            String[] s = br.readLine().split(" ");
            for(int j=0;j<n;j++)
                q[i][j]=Integer.parseInt(s[j]);
        }
        bfs();
    }
}
