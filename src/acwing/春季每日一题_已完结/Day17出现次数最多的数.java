package acwing.春季每日一题_已完结;

import java.util.Scanner;

/**
 * @purpose:
 */
public class Day17出现次数最多的数 {
    static int[] cnt = new int[1010];

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int maxCnt=0;
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            cnt[x]++;
            if(cnt[x]>maxCnt)maxCnt=cnt[x];
        }
        for(int i=1;i<=10000;i++){
            if(cnt[i]==maxCnt){
                System.out.println(i);
                return ;
            }
        }
    }
}
