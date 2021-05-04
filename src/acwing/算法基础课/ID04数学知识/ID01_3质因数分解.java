package acwing.算法基础课.ID04数学知识;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/3 - 19:15
 */
public class ID01_3质因数分解 {
    static int res;
    static void divide(int n){
        for(int i=2;i<=n/i;i++){
            if(n%i==0){
                res=i;
                n/=i;
            }
        }
        res=Math.max(n,res);

    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        divide(n);
        System.out.println(res);
    }
}
