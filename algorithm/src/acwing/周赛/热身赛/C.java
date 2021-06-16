package acwing.周赛.热身赛;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: yeah
 */
public class C {
    static int n;
    static int[] q = new int[1000010];

    static List<Integer> idx=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            q[i] = Integer.parseInt(s[i - 1]);
        }
        for (int i = 1; i <= n; i++) {
           if(i+1<=n&&q[i]!=q[i+1]||i==n){
               System.out.println(i);
           }
        }

    }
}
