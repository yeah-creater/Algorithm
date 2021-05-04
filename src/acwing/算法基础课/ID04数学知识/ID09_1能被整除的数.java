package acwing.算法基础课.ID04数学知识;

import java.util.Scanner;

/**
 * @purpose:
 * 思路：求出每个质数的倍数，然后用容斥原理S1并S2=S1+S2-S1交S2; Sn表示1~n中 sn的倍数有几个 即是n/p就是个数
 * s1交s2 就是求既可以被s1整除又可以被s2整除的数的个数 即可以n/(s1*s2)
 */
public class ID09_1能被整除的数 {
    static int []p=new int[20];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=0;i<m;i++) p[i]=in.nextInt();

        for(int i=1;i<n;i++){

        }
    }
}
