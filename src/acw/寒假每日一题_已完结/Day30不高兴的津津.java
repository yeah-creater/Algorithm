package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/16 - 8:02
 */
public class Day30不高兴的津津 {
    public static void main(String[] args) {
        int day=0,max=0;
        Scanner in=new Scanner(System.in);
        for(int i=1;i<=7;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            if(x+y>8){
                if(x+y>max) {
                    day=i;
                    max=x+y;
                }
            }
        }
        System.out.println(day);
    }
}
