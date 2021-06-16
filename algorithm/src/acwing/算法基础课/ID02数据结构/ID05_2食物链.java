package acwing.算法基础课.ID02数据结构;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/27 - 16:05
 *
 * 思路：用每个结点到根结点的距离表示与根节点的关系  %3==0 同类 ==1 捕食者 ==2 被捕食者
 *  每个点维护它到根结点的距离
 *  每个集合(食物链)有三种关系，就根据到根结点的距离%3判断和根结点的关系
 */
public class ID05_2食物链 {
    static int[]p=new int[50010];
    static int[]d=new int[50010];//初始化为0
    //找根节点
    static int find(int x){
        if(x!=p[x]) {
            int t = find(p[x]);
            d[x] += d[p[x]];
            p[x]=t;
        }
        return p[x];
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cnt=0;//假话个数
        int n=in.nextInt();
        int k=in.nextInt();
        for(int i=1;i<=n;i++) p[i]=i;
        for(int i=0;i<k;i++) {
            int key = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            if(x>n||y>n){
                cnt++;
                continue;
            }
            int px=find(x);
            int py=find(y);
            //不在同一个食物链中
            if(px!=py){
                p[px]=py;
                //更新其原来根结点d
                if(key==1) {
                    d[px] = d[y] - d[x];
                }
                else{
                    d[px] = d[y]+1-d[x];
                }
            }
            else{
                if(key==1){
                    //判断是否同类 不同类
                    if((((d[x]-d[y])%3))!=0){
                        cnt++;
                    }
                }
                //是否是x吃y
                else{
                    if((d[x]-d[y]-1)%3!=0)
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}
