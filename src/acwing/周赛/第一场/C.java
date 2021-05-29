package acwing.周赛.第一场;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class C {
    static int t,n;


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        while (t-->0){
            n=in.nextInt();
            int[]q=new int[n+10];
            int[]tmp=new int[n+10];
            int[]res=new int[n+10];
            Arrays.fill(res,1);
            int cnt=0;
            for(int i=1;i<=n;i++){
                q[i]=in.nextInt();
                tmp[i]=q[i];
                if(q[i]==i) {
                    cnt++;
                }
            }

            while (cnt<n){
                for(int i=1;i<=n;i++){
                    q[i]=tmp[i];
                }
                for(int i=1;i<=n;i++){
                    if(q[i]!=i){
                        tmp[q[q[i]]]=q[i];
                        res[q[i]]++;
                    }
                    else{
                        cnt++;
                    }
                }
            }
            for(int i=1;i<=n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}
