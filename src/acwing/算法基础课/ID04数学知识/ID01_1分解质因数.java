package acwing.算法基础课.ID04数学知识;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/3 - 16:47
 * 质因数:是质数的因数
 */
public class ID01_1分解质因数 {

    static void divide(int n){
        for(int i=2;i<=n/i;i++){
            if(n%i==0){ //i一定是质数
                int s=0;
                while (n%i==0){
                    n/=i;
                    s++;
                }
                System.out.println(i+" "+s);
            }
        }
        //质因数肯定至多就只存在一个大于sqrt(n)的
        if(n>1) System.out.println(n+" "+1);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-- > 0){
            int x=in.nextInt();
            divide(x);
        }
    }
}
