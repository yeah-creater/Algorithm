package acwing.寒假每日一题_已完结;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/27 - 10:57
 *
 * 扩展题 1343
 */
class Pair implements Comparable{
    int l;
    int r;

    public Pair(int l, int r) {
        this.l = l;
        this.r = r;
    }

    @Override
    public int compareTo(Object o) {
        return this.l>=((Pair)o).l?1:-1;
    }
}
public class Day08_区间合并 {
    static Pair []a;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        a=new Pair[m];
        for(int i=0;i<m;i++){
            int l=in.nextInt();
            int r=in.nextInt();
            a[i]=new Pair(l,r);
        }
        Arrays.sort(a);
        int cnt=n+1;//原来树的数量
        for(int i=1;i<m;i++){
            //可以合并
            if(a[i-1].r>=a[i].l){
                a[i].l=a[i-1].l;
                a[i].r=Math.max(a[i-1].r,a[i].r);
            }
            //不可以合并 cnt就减去上一个区间的树的数量
            else{
                cnt-=a[i-1].r-a[i-1].l+1;
            }
        }
        //再减去最后一个区间的树的数量
        cnt-=a[m-1].r-a[m-1].l+1;
        System.out.println(cnt);
    }
}
