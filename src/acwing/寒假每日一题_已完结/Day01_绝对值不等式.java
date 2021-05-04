package acwing.寒假每日一题_已完结;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/19 - 20:29
 * id 104
 */

/**
 * 思路： 中位数就是最优解
 */
public class Day01_绝对值不等式 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]shops=new int[n];
        for(int i=0;i<n;i++) shops[i]=in.nextInt();
        Arrays.sort(shops);
        int sum=0;
        for(int i:shops) sum+=Math.abs(shops[shops.length/2]-i);
        System.out.println(sum);
        in.close();
    }
}
