package acw.寒假每日一题_已完结;


import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/25 - 20:56
 *  二分
 *  最优解想不出，但可以二分可行解，再判断是否最优
 */

public class Day07_整数二分 {
    static int[][] chocolates=new int[100010][3];
    static int n;
    static int k;
    static boolean  check(int x){
        int cnt=0;
        //判断边长为x是否满足条件
        for(int i=1;i<=n;i++){
            //先判断该边长是否可切
            cnt+=(chocolates[i][1]/x)*(chocolates[i][2]/x);
        }
        return cnt>=k;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        k=in.nextInt();
        for(int i=1;i<=n;i++){
            int h=in.nextInt();
            int w=in.nextInt();
            chocolates[i][1]=h;
            chocolates[i][2]=w;
        }
        int l=1,r=100010;
        while (l<r){
            //向上取整
            int mid=l+r+1>>1;
            if(check(mid)) l=mid;
            else r=mid-1;
        }
        System.out.println(l);
    }
}
