package acw.算法基础课.ID03搜索与图论;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @date 2021/3/29 - 21:53
 */
class Edge implements Comparable{
    int w;
    int a;
    int b;

    public Edge(int w, int a, int b) {
        this.w = w;
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Object o) {
        Edge e=(Edge) o;
        return this.w>=e.w?1:-1;
    }
}
public class ID05_1Kruskal {
    static final int N=100010;
    static int n,m;
    static int []p=new int[N];
    static int find(int x){
        if(x!=p[x]) p[x]=find(p[x]);
        return p[x];
    }
    static ArrayList<Edge> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        //初始化并查集
        for(int i=1;i<=n;i++)p[i]=i;
        for(int i=0;i<m;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int w=in.nextInt();
            list.add(new Edge(w,a,b));
        }
        Collections.sort(list);
        int res=0,cnt=0;//分别表示权值和及加入集合的边的个数
        for(int i=0;i<m;i++){
            int a=list.get(i).a;
            int b=list.get(i).b;
            int w=list.get(i).w;
            int pa=find(a);
            int pb=find(b);
            //两个点不在一个集合
            if(pa!=pb){
                res+=w;
                p[pa]=pb;
                cnt++;
            }
            if(cnt==n-1) break;
        }
        if(cnt<n-1) System.out.println("impossible");
        else System.out.println(res);
    }
}
