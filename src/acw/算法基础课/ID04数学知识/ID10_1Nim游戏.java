package acw.算法基础课.ID04数学知识;

import java.util.Scanner;

/**
 * @purpose:
 * 你和你的朋友，两个人一起玩Nim 游戏：
 *
 * 桌子上有一堆石头。
 * 你们轮流进行自己的回合，你作为先手。
 * 每一回合，轮到的人拿掉1 - 3 块石头。
 * 拿掉最后一块石头的人就是获胜者。
 *
 */
public class ID10_1Nim游戏 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%4==0) System.out.println("你输了");
        else System.out.println("你赢了");
    }
}
