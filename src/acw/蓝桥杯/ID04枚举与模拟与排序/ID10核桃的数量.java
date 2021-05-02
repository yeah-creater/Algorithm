package acw.蓝桥杯.ID04枚举与模拟与排序;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/15 - 15:03
 *
 * 因为a，b，c小于30 就不要用gcd来做，容易错
 */
public class ID10核桃的数量 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        for(int i=1;i<=a*b*c;i++){
            if(i%a==0&&i%b==0&&i%c==0){
                System.out.println(i);
                break;
            }
        }
    }
}
