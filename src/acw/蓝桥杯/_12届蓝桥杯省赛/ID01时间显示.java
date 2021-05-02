package acw.蓝桥杯._12届蓝桥杯省赛;


import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID01时间显示 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long time=in.nextLong();
        time/=1000;//得到秒
        time%=86400;
        long hour=time/3600;
        long minute=time%3600/60;
        long second=time%3600%60;
        System.out.printf("%02d:%02d:%02d",hour,minute,second);
    }
}
