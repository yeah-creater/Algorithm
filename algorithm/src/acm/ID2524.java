package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/17 - 15:05
 * @intention:
 */
public class ID2524 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int m=in.nextInt();
            int sum=0;
            for(int j=1;j<=n;j++){
                for(int k=1;k<=m;k++){
                    sum+=j*k;
                }
            }
            System.out.println(sum);
        }
    }
}
