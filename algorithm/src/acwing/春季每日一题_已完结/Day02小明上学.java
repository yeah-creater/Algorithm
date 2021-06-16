package acwing.春季每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/20 - 13:13
 * 模拟题
 */
public class Day02小明上学 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int y=in.nextInt();
        int g=in.nextInt();
        int n=in.nextInt();
        int res=0;
        for(int i=0;i<n;i++){
            int k=in.nextInt();
            int t=in.nextInt();
            if(k==0||k==1) res+=t;
            else if(k==2) res+=t+r;
        }
        System.out.println(res);
    }
}
