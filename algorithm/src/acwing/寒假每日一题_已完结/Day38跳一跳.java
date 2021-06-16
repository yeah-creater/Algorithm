package acwing.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/16 - 21:43
 */
public class Day38跳一跳 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int res=0,cnt=1,last=1;
        int []q=new int[40];
        while (true){
            int x=in.nextInt();
            if(x==0) break;
            q[cnt++]=x;
        }

        for(int i=1;i<cnt;i++){
            if(q[i]==1) {
                last=1;
                res+=1;
            }
            else{
                if(last==1) last=2;
                else last+=2;
                res+=last;
            }
        }
        System.out.println(res);
    }
}
