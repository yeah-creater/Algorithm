package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/17 - 14:53
 * @intention:
 */
public class ID2500 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int cnt=in.nextInt();
            for(int j=1;j<=3*cnt;j++){
                for(int k=1;k<=cnt;k++){
                    System.out.print("HDU");
                }
                System.out.println();
            }
        }
    }
}
