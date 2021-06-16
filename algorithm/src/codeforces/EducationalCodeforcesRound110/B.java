package codeforces.EducationalCodeforcesRound110;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: yeah
 * 偶数在前，奇数在后
 */
public class B {
    static int t,n;
    static int []q;
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        while (t-->0){
            n=in.nextInt();
            int res=0;
            q=new int[n];
            int []a=new int[2010];
            int cnt=0;
            for(int i=0;i<n;i++){
                q[i]=in.nextInt();
                if(q[i]%2==1){
                    a[cnt++]=q[i];
                }
            }
            int c=n-1;
            for(int i=0;i<n-cnt;i++){
                res+=c--;
            }
            Arrays.sort(a,0,cnt);
            for(int i=cnt-1;i>=0;i--){
                for(int j=i-1;j>=0;j--){
                    if(gcd(a[i],a[j]*2)>1)res++;
                }
            }

            System.out.println(res);
        }
    }
}
