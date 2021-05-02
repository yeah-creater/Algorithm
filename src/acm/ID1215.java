package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/3 - 16:35
 * @intention:
 */
public class ID1215 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int val=in.nextInt();
            int sum=0;
            for(int j=1;j<=val/2;j++){
                if(val%j==0){
                    sum+=j;
                }
            }
            System.out.println(sum);
        }
    }
}
