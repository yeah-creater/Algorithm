package acw.算法基础课.ID03搜索与图论;


import java.util.*;

/**
 * @author Yeah
 * @date 2021/3/22 - 16:25
 *
 * 将入度为0的点入队，宽搜
 */
public class ID03_2有向图的拓扑序列 {
    static final int N=100010;
    static int []h=new int[N],e=new int[N],ne=new int[N];
    static int idx;
    static int n,m;
    static ArrayList<Integer> list=new ArrayList<>();//保存拓扑序
    static int[]d=new int[N];//记录每条边的入度
    static {
        Arrays.fill(h,-1);
    }
    static void add(int a,int b){
        e[idx]=b;
        ne[idx]=h[a];
        h[a]=idx++;
    }
    static boolean topSort(){
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            if(d[i]==0) {
                q.addLast(i);//所有入度为0的点入队
                list.add(i);
            }
        }
        while (!q.isEmpty()){
            int t = q.pollFirst();
            for(int i=h[t];i!=-1;i=ne[i]){
                int j=e[i];
                d[j]--;
                if(d[j]==0) {
                    q.addLast(j);
                    list.add(j);
                }
            }
        }
        return list.size()==n;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        while (m-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            add(a,b);
            d[b]++;
        }
        if (topSort()){
            for(int i=0;i<n;i++) System.out.print(list.get(i)+" ");
        }
        else
            System.out.println("-1");


    }
}
