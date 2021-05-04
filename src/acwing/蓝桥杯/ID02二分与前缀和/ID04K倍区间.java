package acwing.蓝桥杯.ID02二分与前缀和;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/6 - 20:09
 */
public class ID04K倍区间 {
    static int []q=new int[100010];
    static long[]s=new long[100010];
    static long[]cnt=new long[100010];//表示si%k的个数 比如cnt[5]=6，表示余数为5的个数有6个
    static int n,k;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        k=in.nextInt();
        for(int i=1;i<=n;i++){
            q[i]=in.nextInt();
            s[i]=s[i-1]+q[i];
        }
        long res=0;
        cnt[0]=1;
        //求前缀和%k的余数的个数
        for(int r=1;r<=n;r++){
            res+=cnt[(int) (s[r]%k)];
            cnt[(int) (s[r]%k)]++;
        }
        System.out.println(res);

    }
}
