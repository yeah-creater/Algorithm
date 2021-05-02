package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/2 - 12:07
 */
public class Day13平方矩阵II {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (true){
            int n=in.nextInt();
            if(n==0) break;
            for(int i=1;i<=n;i++){
                //单调减
                for(int j=i;j>1;j--)
                    System.out.print(j+" ");
                //单调增
                for(int k=1;k<=n-i+1;k++)
                    System.out.print(k+" ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
