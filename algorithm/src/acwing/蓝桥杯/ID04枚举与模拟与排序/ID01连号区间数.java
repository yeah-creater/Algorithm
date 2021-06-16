package acwing.蓝桥杯.ID04枚举与模拟与排序;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/9 - 9:52
 */
public class ID01连号区间数 {
    static int[]q=new int[10010];
    static int n;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        long res=0;
        //i为开头 j为末尾
        for(int i=0;i<n;i++){
            int min=10001,max=-1;
            for(int j=i;j<n;j++){
                if(q[j]>max) max=q[j];
                if(q[j]<min) min=q[i];
                //判断最大值和最小值的差值是否是区间长度-1
                if(max-min==j-i) res++;
            }
        }
        System.out.println(res);
    }
}
