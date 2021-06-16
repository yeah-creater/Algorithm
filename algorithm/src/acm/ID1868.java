package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/19 - 11:58
 * @intention:
 */
public class ID1868 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int cnt=0;
            int sum=in.nextInt();
            sum*=2;
            for(int i=2;i*i<=sum;i++){
                if(sum%i==0&&(i+sum/i)%2==1){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
