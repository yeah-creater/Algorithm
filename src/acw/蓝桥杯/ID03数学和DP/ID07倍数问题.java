package acw.蓝桥杯.ID03数学和DP;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Yeah
 * @date 2021/3/12 - 12:59
 */
public class ID07倍数问题 {
    static int []q;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        q=new int[n];
        TreeSet<Integer> max=new TreeSet<>();
        for(int i=0;i<n;i++)q[i]=in.nextInt();
        Arrays.sort(q);
        for(int a=n-1;a>=2;a--){
            for(int b=a-1;b>=1;b--){
                for(int c=b-1;c>=0;c--){
                    if((q[a]+q[b]+q[c])%k==0)max.add(q[a]+q[b]+q[c]);
                }
            }
        }
        System.out.println(max.last());
    }
}
