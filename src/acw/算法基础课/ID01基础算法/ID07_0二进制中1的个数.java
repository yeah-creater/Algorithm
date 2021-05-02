package acw.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/24 - 14:32
 * 位运算常见题：
 *          n的二进制数中第k位是?
 *          过程：1.先把第k位移到个位  n>>k  个位是0位
 *               2.再看个位是?  n>>k&1
 *
 *          lowBit(n) 返回一个数二进制的最后一位1 ，比如二进制1001010  就返回10
 *          return n&-n;
 *
 */
public class ID07_0二进制中1的个数 {
    //返回一个数二进制的最后一位1 ，比如二进制1001010  就返回10
    static int lowBit(int x){
        return x&-x;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int val=in.nextInt();
            /*
            //cnt表示转化为二进制的最高位
            int max=(int)(Math.log10(val+1)/Math.log10(2));
            int cnt=0;
            for(int k=max;k>=0;k--){
                if((val>>k&1)==1)
                    cnt++;
            }
            System.out.print(cnt+" ");
             */
            int cnt=0;
            while (val!=0){
                val-=lowBit(val);
                cnt++;
            }
            System.out.print(cnt+" ");

        }
    }
}
