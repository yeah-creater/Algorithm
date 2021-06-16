package acwing.算法基础课.ID06贪心;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 思路：将每个区间按右端点升序
 */
class Pair implements Comparable<Pair>{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p) {
        return y-p.y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class ID01_0区间选点 {
    static Pair[]p;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        p=new Pair[n];
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            p[i]=new Pair(x,y);
        }
        Arrays.sort(p);
        int cnt=0;
        for(int i=0;i<n;){
            int end=p[i].y;
            cnt++;
            while (i+1<n&&p[i+1].x<=end&&p[i+1].y>=end){
                i++;
            }
            i++;
        }
        System.out.println(cnt);
    }
}
