package acwing.杂题;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/27 - 14:30
 */
public class ID1240完全二叉树的权值 {
    static long[]sum=new long[100];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int rank=1;
        for(int i=1;i<=n;i++){
            //深度
            rank=(int)(Math.log(i)+1);
            sum[rank]+=in.nextInt();
        }
        int p=1;
        for(int i=2;i<=rank;i++)
            if(sum[i]<sum[p])
                p=i;
        System.out.println(p);

    }
}
