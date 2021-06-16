package acwing.算法基础课.ID04数学知识;

import java.util.Scanner;

/**
 * @purpose:
 * a1 异或 a2 ...异或an =0 先手必败  否则先手必赢
 * 先手必胜状态：先手操作完，可以走到某一个必败状态
 * 先手必败状态：先手操作完，走不到任何一个必败状态
 * 先手必败状态：a1 ^ a2 ^ a3 ^ ... ^an = 0
 * 先手必胜状态：a1 ^ a2 ^ a3 ^ ... ^an ≠ 0
 */
public class ID10_0Nim游戏 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int res=0;
        while (n-->0){
            int x=in.nextInt();
            res^=x;
        }
        if(res==0) System.out.println("No");
        else System.out.println("Yes");
    }
}
