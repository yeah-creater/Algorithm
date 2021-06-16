package acwing.算法基础课.ID04数学知识;


import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/3 - 14:44
 * 数论
 *      质数(素数)：在大于1的整数中，只包含1和本身2个约数就是质数
 *              质数的判定—试除法
 *              分解质因数—试除法
 *
 * 组合计数
 *
 * 高斯消元
 *
 * 简单博弈论
 *
 */
public class ID01_0试除法判定质数 {
    static  boolean isPrime(int x){
        if(x<2) return false;
        //2是12的约数，那么6也是12的约数，所以只要列举小者，即 d<=n/d
        for(int i=2;i<=x/i;i++)
            if(x%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n-->0){
            int x=in.nextInt();
            String res= isPrime(x)?"Yes":"No";
            System.out.println(res);
        }
    }
}
