package acwing.寒假每日一题_已完结;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/27 - 11:57
 */
class Pair1 implements Comparable{
    int l;
    int r;

    public Pair1(int l, int r) {
        this.l = l;
        this.r = r;
    }

    @Override
    public int compareTo(Object o) {
        return this.l>=((Pair1)o).l?1:-1;
    }
}

public class Day08S {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int lack=0;//表示最长无人的时间  第一个农夫开始的时间才是开始时间
        int last=0;//表示最长有人的时间
        int n=in.nextInt();
        Pair1 []a=new Pair1[n];
        for(int i=0;i<n;i++){
            int l=in.nextInt();
            int r=in.nextInt();
            a[i]=new Pair1(l,r);
        }
        Arrays.sort(a);
        last=a[0].r-a[0].l;
        for(int i=1;i<n;i++){
            if(a[i-1].r>=a[i].l){
                a[i].l=a[i-1].l;
                a[i].r=Math.max(a[i].r,a[i-1].r);
            }
            else{
                lack=Math.max(lack,a[i].l-a[i-1].r);
            }
            last=Math.max(last,a[i].r-a[i].l);
        }
        System.out.println(last+" "+lack);
    }
}
