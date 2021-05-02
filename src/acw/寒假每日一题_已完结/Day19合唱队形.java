package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/7 - 20:17
 * DP：
 * 关键就在于最高的小朋友的位置  假设hk为最高小朋友位置
 * 则求 h1~hk的最长上升子序列  hk~hn的最长下降子序列
 * 最终转化成求最长上升子序列问题
 */
public class Day19合唱队形 {
    static final int N=110;
    static int []h=new int[N];//n位小朋友高度
    static int []f=new int[N];//左上升序列
    static int []g=new int[N];//右下降序列
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++) h[i]=in.nextInt();

        //左
        for(int i=1;i<=n;i++){
            f[i]=1;
            for(int j=1;j<i;j++){
                if(h[i]>h[j])
                    f[i]=Math.max(f[i],f[j]+1);
            }
        }
        //右
        for(int i=n;i>=1;i--){
            g[i]=1;
            //从末尾开始的上升序列
            for(int j=n;j>i;j--){
                if(h[i]>h[j]){
                    g[i]=Math.max(g[i],g[j]+1);
                }
            }
        }
        //挽救的最大人数
        int res=0;
        for(int k=1;k<=n;k++){
            res=Math.max(res,f[k]+g[k]-1);
        }
        System.out.println(n-res);

    }
}
