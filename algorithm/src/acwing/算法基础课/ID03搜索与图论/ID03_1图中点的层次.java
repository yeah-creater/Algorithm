package acwing.算法基础课.ID03搜索与图论;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/22 - 13:00
 */
public class ID03_1图中点的层次 {
    static final int N=100010,M=2*N;
    static int []h=new int[N];//链表的第一个结点的idx
    static int []d=new int[N];
    static int []e=new int[M],next=new int[M];
    static boolean []st=new boolean[N];
    static int idx,n,m;
    static {
        for(int i=0;i<N;i++) {
            h[i]=-1;
            d[i]=-1;
        }
    }
    static void add(int a,int b){
        e[idx]=b;
        next[idx]=h[a];
        h[a]=idx++;
    }
    static int bfs(){
        Deque<Integer> queue=new ArrayDeque<>();
        queue.add(1);
        d[1]=0;
        while (!queue.isEmpty()){
            int t = queue.pollFirst();
            for(int i=h[t];i!=-1;i=next[i]){
                int j=e[i];
                if(d[j]==-1){
                    d[j]=d[t]+1;
                    queue.add(j);
                }
            }
        }
        return d[n];
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        while (m-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            add(a,b);
        }
        System.out.println(bfs());
    }
}
