package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/24 - 20:06
 * @intention:
 */
public class ID2520 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int time=in.nextInt();
            int x=0;
            int v=1;
            for(int j=1;j<=time;j++){
                x+=v;
                v+=2;
            }
            System.out.println(x%10000);
        }
    }
}
