package acw.杂题;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/3 - 10:11
 */
public class ID1247后缀表达式 {
    static int []a;
    static long res;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        //1~m个减号
        int m=in.nextInt();
        a=new int[m+n+1];
        for(int i=0;i<=m+n;i++) a[i]=in.nextInt();
        Arrays.sort(a);
        //无负号
        if(m==0){
            for(int i:a) res+=i;
        }
        //只要有一个负号  只要用一个减号，一个最大值，一个最小值，其他数我想加就加，想减就减
        else{
            res-=a[0];
            res+=a[m+n];
            for(int i=1;i<m+n;i++)
                res+=Math.abs(a[i]);
        }
        System.out.println(res);
    }
}
