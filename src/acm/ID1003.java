package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/13 - 18:05
 * @intention:
 */
public class ID1003 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            int sum,max,begin=1,end=1,loc=1;
            int cnt=in.nextInt();
            int num=in.nextInt();
            sum=num;
            max=num;
            for(int j=2;j<=cnt;j++){
                num=in.nextInt();
                if(sum+num<num){
                    sum=num;
                    loc=j;
                }
                else{
                    sum+=num;
                }
                if(sum>max){
                    max=sum;
                    begin=loc;
                    end=j;
                }
            }

            System.out.println("Case "+i+":");
            System.out.println(max+" "+begin+" "+end);
            if(i!=n)
            System.out.println();
        }

    }
}
