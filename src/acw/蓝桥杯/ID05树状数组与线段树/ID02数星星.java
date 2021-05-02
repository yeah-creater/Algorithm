package acw.蓝桥杯.ID05树状数组与线段树;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/10 - 19:33
 * 每个星星前面的星星 只要x比该星星小 ,那就是在该星星的左下方
 * 所以用一个数组 保存 横坐标小于等于i的个数就是前缀和 而又要更新 某个坐标星星的个数
 * 所以就转化成了树状数组的问题了
 */
public class ID02数星星 {
    static int []cnt=new int[15010];//记录各级星星数量
    static int []tr=new int[32010];
    static int n;
    static int lowBit(int x){
        return x&-x;
    }
    static void add(int x,int v){
        for(int i=x;i<=32000;i+=lowBit(i))
            tr[i]+=v;
    }
    static int query(int x){
        int res=0;
        for(int i=x;i>0;i-=lowBit(i))
            res+=tr[i];
        return res;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int m=n;
        while (n-->0){
            int x=in.nextInt();
            int y=in.nextInt();
            x++;//因为树状数组下标统一从1开始，而横坐标有0
            cnt[query(x)]++;
            add(x,1);
        }
        for(int i=0;i<m;i++)
            System.out.println(cnt[i]);

    }
}
