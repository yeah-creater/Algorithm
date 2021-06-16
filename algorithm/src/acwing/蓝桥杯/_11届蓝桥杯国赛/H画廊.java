package acwing.蓝桥杯._11届蓝桥杯国赛;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author: yeah
 * 好像可以是最小生成树
 */
class Edge implements Comparable<Edge>{
    int x;
    int y;
    double dis;

    public Edge(int x, int y, double dis) {
        this.x = x;
        this.y = y;
        this.dis = dis;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.dis-edge.dis>=0.00001?1:-1;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "x=" + x +
                ", y=" + y +
                ", dis=" + dis +
                '}';
    }
}
public class H画廊 {
    static int l,r,d,w;
    static int []L=new int[510],R=new int[1010],p=new int[1010];
    static long res=0x3f3f3f3f;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        l=in.nextInt();
        r=in.nextInt();
        d=in.nextInt();
        w=in.nextInt();
        for(int i=1;i<=l+r;i++){
            p[i]=i;
        }
        for(int i=1;i<=l;i++){
            L[i]=in.nextInt();
        }
        for(int i=l+1;i<=r+l;i++){
            R[i]=in.nextInt();
        }

    }

}
