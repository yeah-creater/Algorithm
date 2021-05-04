package acwing.算法基础课.ID04数学知识;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/3 - 17:32
 *
 * 埃式筛法
 */
public class ID01_2筛质数 {
    static boolean []st=new boolean[1000010];//判断一个数是合数
    static int cnt;
    static void isPrime(int n){
        for(int i=2;i<=n;i++){
            if(!st[i]){
                cnt++;
                for(int j=2*i;j<=n;j+=i) st[j]=true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        isPrime(n);
        System.out.println(cnt);

    }
}
