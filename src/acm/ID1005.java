package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/16 - 12:01
 * @intention:
 * 具有周期性
 */
public class ID1005 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a,b,n;
        while (true) {
            a=in.nextInt();
            b=in.nextInt();
            n=in.nextInt();
            if(a==0&&b==0&&n==0){
                break;
            }
            int []f=new int[50];
            f[1]=1;
            f[2]=1;
            int i;
            for ( i = 3; i <= 49; i++) {
                f[i]=(a*f[i-1]+b*f[i-2])%7;
            }
            n=n%49;
            System.out.println(f[n]);
        }
    }
}

