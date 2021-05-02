package acw.蓝桥杯.ID08数论;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/15 - 19:59
 * 最大长度就是x质因子的指数之和  比如100 = 2^2 * 5^2  最大长度就是2+2
 * 个数就是 指数和的阶乘/每个指数的阶乘和
 */
public class ID02X的因子链 {
    static void divide(int x){
        //保存各个指数
        int []fact=new int[30];
        int h=0,cnt=0;
        //存储个数
        long sum=0;
        for(int i=2;i<=x/i;i++){
            if(x%i==0){
                int res=0;
                while (x%i==0){
                    res++;
                    x/=i;
                }
                fact[cnt++]=res;
                h+=res;
            }
        }
        if(x>1){
            h++;
            fact[cnt++]=1;
        }
        for(int i=0;i<cnt;i++) sum+=fact[i];
        long ss=sum;
        for(int i=1;i<=ss-1;i++) sum*=i;
        for(int i=0;i<cnt;i++){
            long s=1;
            for(int j=1;j<=fact[i];j++)
                s*=j;
            sum/=s;
        }
        System.out.println(h+" "+sum);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int x=in.nextInt();
            divide(x);
        }
    }
}
