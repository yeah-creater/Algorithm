package acw.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/23 - 21:56
 *
 * 本质是前缀和的逆运算
 * 例如 a1,a2,a3...an的差分是b1,b2,b3..bn
 *      那么bn的前缀和就是an  例如 a2=b1+b2;
 * 应用:  例如要将an的l到r区间的每个数都+c 常规是O(n)
 *       利用差分只要将bl+c 并且b(r+1)-c 然后再求bn的前缀和就是要求的an
 */
public class ID05_2差分 {
    static final int N=100010;
    static int[]a=new int[N];
    static int[]b=new int[N];
    static void insert(int l,int r,int c){
        b[l]+=c;
        b[r+1]-=c;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=1;i<=n;i++) a[i]=in.nextInt();
        //初始化bn
        for(int i=1;i<=n;i++) insert(i,i,a[i]);

        //操作bn
        for(int i=1;i<=m;i++){
            int l=in.nextInt();
            int r=in.nextInt();
            int c=in.nextInt();
            insert(l,r,c);
        }
        //利用bn输出an
        for(int i=1;i<=n;i++) b[i]+=b[i-1];
        for(int i=1;i<=n;i++) System.out.print(b[i]+" ");

    }
}
