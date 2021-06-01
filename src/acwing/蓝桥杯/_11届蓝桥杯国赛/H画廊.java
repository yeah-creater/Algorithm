package acwing.蓝桥杯._11届蓝桥杯国赛;

import java.util.Scanner;

/**
 * @author: yeah
 * 好像可以是最小生成树
 */
public class H画廊 {
    static int l,r,d,w;
    static int []L=new int[20],R=new int[20];
    static long res=0x3f3f3f3f;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        l=in.nextInt();
        r=in.nextInt();
        d=in.nextInt();
        w=in.nextInt();
        for(int i=1;i<=l;i++){
            L[i]=in.nextInt();
        }
        for(int i=1;i<=r;i++){
            R[i]=in.nextInt();
        }
    }

}
