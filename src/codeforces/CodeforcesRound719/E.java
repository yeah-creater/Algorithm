package codeforces.CodeforcesRound719;

import java.util.Scanner;

/**
 * @author: yeah
 * the task is to make '*' together
 */

/**
 * int n;
 * 		scanf("%d",&n);
 * 		string s;
 * 		cin >> s;
 * 		int m = 0;
 * 		for(int i = 0;i < n;i++)
 *                {
 * 			if(s[i] == '*')
 * 				a[m++] = i;
 *        }
 * 		ll ans = 0;
 * 		for(int i = 0;i < m/2;i++)
 * 			ans += a[m/2]-(m/2-i)-a[i];
 * 		for(int i = m/2+1;i < m;i++)
 * 			ans += a[i]-(a[m/2]+(i-m/2));
 * 		cout << ans << endl;
 */
public class E {
    static int t,n;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        while (t-->0){
            n=in.nextInt();
            String s=in.next();
            int cnt=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='*'){
                    cnt++;
                }
            }
        }
    }
}
