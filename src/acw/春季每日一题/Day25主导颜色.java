package acw.春季每日一题;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author: yeah
 */
public class Day25主导颜色 {
    static HashMap<Integer,Integer> map=new HashMap<>();
    static int n,m;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        m=Integer.parseInt(s[0]);
        n=Integer.parseInt(s[1]);
        int t=0;
        for(int i=0;i<n;i++){
            String[] s1 = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                int x=Integer.parseInt(s1[j]);
                map.merge(x,1,Integer::sum);
                if(map.get(x)>m*n/2)
                    t=x;
            }
        }
        System.out.println(t);

    }
}
