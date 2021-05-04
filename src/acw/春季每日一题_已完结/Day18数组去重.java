package acw.春季每日一题_已完结;

import java.util.Scanner;

/**
 * @purpose:
 */
public class Day18数组去重 {
    static boolean[]used=new boolean[10000];
    static int []q=new int[1010];
    static int n;
    static int getUniqueCnt(){
        int res=0;
        for(int i=0;i<n;i++){
            if(!used[q[i]]){
                res++;
                used[q[i]]=true;
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++)q[i]=in.nextInt();
        System.out.println(getUniqueCnt());
    }
}
