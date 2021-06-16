package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/17 - 13:33
 * @intention:
 */
public class ID5698 {
    static int getCount(int row,int vol){
        if(row==2||vol==2){
            return 1;
        }
        else{
            int sum=1;
            for(int j=1;j<=row-2;j++) {
                for (int i = 1; i <= vol - 2; i++) {
                    sum += getCount(row - j, vol - i);
                    sum%=1000000007;
                }
            }

            return sum%1000000007;
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            int row=in.nextInt();
            int vol=in.nextInt();
            System.out.println(getCount(row,vol));

        }
    }
}
