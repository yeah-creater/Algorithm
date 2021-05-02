package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/13 - 11:06
 * 快速幂:反复平方法(将指数用二进制表示) 比如 a^110101  =
 * 位运算
 */
public class Day26ab {
    static int bf(int a,int b,int p){
        if(b==0) return 1%p;
        for(int i=2;i<=b;i++){
            a=a%p*a%p;
        }
        return a%p;
    }
    static int qmi(int a,int b,int p){
        //比如b的二进制位10010101
        int res=1;
        while (b>0){
            if((b&1)==1){
                res= (int) ((long)res*a%p);
            }
            a= (int) ((long)a*a%p);
            b>>=1;
        }
        return res%p;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int p=in.nextInt();
        System.out.println(qmi(a,b,p));

    }
}
