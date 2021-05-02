package acw.蓝桥杯.ID07贪心;

import javafx.scene.transform.Scale;
import jdk.nashorn.internal.ir.Flags;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/13 - 20:31
 *
 * 看看某个小岛，判断雷达放在哪里才能覆盖到他，就是求雷达的区间(给定若干区间，找出最小的点数可以使每个区间都包含)
 * 、                                    贪心策略：
 *                                              将每个线段按右端点排序
 *                                              遍历每个线段
 *                                              1.上一个点不在这个当前线段区间内，则选择右端点
 *                                              2.否则跳过
 *
 */
class PII implements Comparable{
    double x1;
    double x2;

    public PII(double x, double x2) {
        this.x1 = x;
        this.x2= x2;
    }

    @Override
    public int compareTo(Object o) {
        return ((PII)o).x2<x2?1:-1;
    }

    @Override
    public String toString() {
        return "PII{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}
public class ID02雷达设备 {
    static PII []q;
    static double exp=0.000001;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean success=true;
        int n=in.nextInt();
        int d=in.nextInt();
        q=new PII[n];
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            if(y>d){
                success=false;
                break;
            }
            double len=Math.sqrt(d*d-y*y);
            q[i]=new PII(x-len,x+len);
        }
        if(!success) System.out.println("-1");
        else{
            Arrays.sort(q);
            int res=0;
            double last=-100000000;
            for(int i=0;i<n;i++){
                //下一个区间的前端点与上一个尾端点比较
                if(q[i].x1-last>exp){
                    res++;
                    last=q[i].x2;
                }
            }
            System.out.println(res);

        }

    }
}





















