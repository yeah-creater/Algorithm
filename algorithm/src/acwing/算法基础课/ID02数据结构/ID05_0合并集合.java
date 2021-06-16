package acwing.算法基础课.ID02数据结构;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Yeah
 * @date 2021/2/26 - 15:32
 *
 * 问题：
 *  *          1.将两个集合合并
 *  *          2.判断两个元素是否在一个集合中 belong[x]==belong[y]?
 *  *          原来belong[1]=1,belong[2]=2
 *
 * 并查集：基本原理：将每个集合用一棵树来表示,树根的编号就是集合的编号.
 *                  每个结点存储它的父结点 p[x]表是父结点
 *
 *        如何判断树根：p[x]==x  x表示元素编号
 *        如何求x编号的集合编号  回溯到它的树根 while(x!=p[x]) x=p[x];
 *        如何合并2个集合  将其中一个集合(树)的树根的值赋值为另一个树根的值
 *
 *实在妙
 *
 */
public class ID05_0合并集合 {
    static int []p=new int[100010];//存储每个编号的父结点 若p[x]==x,则当前集合编号为x
    //找到x所在的集合 也就是根结点编号 +路径压缩
    static int find(int x){
        if(x!=p[x]) p[x]=find(p[x]);
        return p[x];
    }
    static void union(int a,int b){
        //求a的集合编号
        a=find(a);
        //求b的集合编号
        b=find(b);
        //将b合并到a
        p[b]=p[a];
    }
    static boolean query(int a,int b){
        return find(a)==find(b);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int n=Integer.parseInt(str1[0]);
        int m=Integer.parseInt(str1[1]);
        for(int i=1;i<=n;i++) p[i]=i;
        for(int i=0;i<m;i++){
            String[] str2 = br.readLine().split(" ");
            String key=str2[0];
            int a=Integer.parseInt(str2[1]);
            int b=Integer.parseInt(str2[2]);
            if(key.equals("M"))
                union(a,b);
            else{
                if (query(a,b))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }

        }


    }
}
