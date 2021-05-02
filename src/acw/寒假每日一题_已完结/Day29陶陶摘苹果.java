package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/15 - 12:17
 * 模拟题
 */
public class Day29陶陶摘苹果 {
    static int []h=new int[15];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++) h[i]=in.nextInt();
        int max=in.nextInt();max+=30;
        int cnt=0;
        for(int i=0;i<10;i++){
            if(h[i]<=max) cnt++;
        }
        System.out.println(cnt);
    }
}
