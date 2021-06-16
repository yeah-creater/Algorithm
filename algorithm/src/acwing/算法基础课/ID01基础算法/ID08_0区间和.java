package acwing.算法基础课.ID01基础算法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * 离散化：求解跨度很大，但数量稀疏
 *      将一些相差比较大的数x，但个数比较少的数映射到一个相对于短的数组中
 *      问题：1.原来的数中可能有重复的数：排序后去重
 *           2.如何找到他们x的映射地址: 利用二分将 相差比较的大的n个数,相对位置保持地保存在大小为n的数组中
 *           比如 -199999,-2,1000,9999999
 *           在a数组中就是 1,2,3,4
 *
 *
 *排好序的数去重原理 :它是第一个数或者不等于前一个数
 */
class Pair{
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
public class ID08_0区间和 {
    static int n;
    static int m;
    static int N=300001;//因为n和m都不超过100000,所以总总坐标数肯定不超过300000
    static ArrayList<Integer> alls=new ArrayList<>();
    static int[]a=new int[N];
    static int[]s=new int[N];
    //将所以出现过的坐标去重
    static ArrayList<Integer> unique( ArrayList<Integer> alls){
        ArrayList<Integer> unique=new ArrayList<>();
        unique.add(alls.get(0));
        for(int i=1;i<alls.size();i++){
            if(alls.get(i)!=alls.get(i-1))
                unique.add(alls.get(i));
        }
        return unique;
    }
    //对于位置x离散化  无限变有限
    static int find(int x){
        int l=0,r=alls.size()-1;
        while (l<r){
            int mid=l+r>>1;
            if(alls.get(mid)>=x) r=mid;
            else l=mid+1;
        }
        return l+1;
    }
    public static void main(String[] args) {
        //存放位置x及l和r,需要排序和去重
        ArrayList<Pair> add = new ArrayList<>(); //用来存n次操作
        ArrayList<Pair> query = new ArrayList<>(); //用来存m次询问
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int c=in.nextInt();
            alls.add(x);
            add.add(new Pair(x,c));
        }
        for(int i=0;i<m;i++){
            int l=in.nextInt();
            int r=in.nextInt();
            alls.add(l);
            alls.add(r);
            query.add(new Pair(l,r));
        }
        //上面是准备工作
        Collections.sort(alls);
        alls = unique(alls);
        //将add操作的坐标和值，保存在a[]中
        for(Pair pair:add){
            //找出原来的坐标离散化后的坐标
            int index=find(pair.first);
            a[index]+=pair.second;//存值
        }
        //求前缀和，方便下一步查询时获取
        for(int i=1;i<=alls.size();i++) s[i]=s[i-1]+a[i];

        //查询获取结果
        for(Pair pair:query){
            //获取离散化后的坐标
            int l=find(pair.first);
            int r=find(pair.second);
            System.out.println(s[r]-s[l-1]);
        }

    }
}
