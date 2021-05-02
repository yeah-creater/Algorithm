package acw.算法基础课.ID02数据结构;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Yeah
 * @date 2021/2/26 - 16:49
 * 并查集稍微扩展一点点  集合的个数
 */
public class ID05_1连通块中点的数量 {
    static int []p=new int[100010];//每个节点的父结点
    static int []cnt=new int[100010];//每个根节点的所在连通图中 节点个数
    //找到节点x所在连通图
    static int find(int x){
        if(x!=p[x]) p[x]=find(p[x]);
        return p[x];
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int n=Integer.parseInt(str1[0]);
        int m=Integer.parseInt(str1[1]);
        for(int i=1;i<=n;i++) {
            p[i]=i;
            cnt[i]=1;
        }
        for(int i=0;i<m;i++){
            String[] str2 = br.readLine().split(" ");
            String key=str2[0];
            int a=Integer.parseInt(str2[1]);
            //连接2个连通块
            if(key.equals("C")){
                int b=Integer.parseInt(str2[2]);
                a=find(a);
                b=find(b);
                //已经在一个连通块里面就不需要数量减去了
                if(a==b) continue;
                p[b]=a;
                cnt[a]+=cnt[b];
                cnt[b]=0;
            }
            else if(key.equals("Q1")){
                int b=Integer.parseInt(str2[2]);
                String res=find(a)==find(b)?"Yes":"No";
                System.out.println(res);
            }
            else{
                System.out.println(cnt[find(a)]);
            }
        }

    }
}
