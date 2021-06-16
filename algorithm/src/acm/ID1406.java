package acm;


import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/20 - 13:06
 */
public class ID1406 {
    static boolean isPerfect(int x){
        int sum=0;
        for(int i=1;i<=x/2;i++){
            if(x%i==0) sum+=i;
        }
        return sum == x;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            if(a>b){
                int t=a;
                a=b;
                b=t;
            }
            int cnt=0;
            for(int j=a;j<=b;j++){
                if(isPerfect(j)) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
