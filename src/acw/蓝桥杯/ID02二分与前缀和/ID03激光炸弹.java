package acw.蓝桥杯.ID02二分与前缀和;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/6 - 19:29
 */
public class ID03激光炸弹 {
    static int [][]q=new int[5010][5010];
    static int [][]s=new int[5010][5010];
    static int n,m,r,v;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        //要注意  防止 r和v小于m
        r=v=m;
        while(n-->0){
            int x=in.nextInt();
            int y=in.nextInt();
            int val=in.nextInt();
            x++;y++;
            q[x][y]+=val;
            r=Math.max(r,x);
            v=Math.max(v,y);
        }
        //预处理前缀和
        for(int i=1;i<=r;i++){
            for(int j=1;j<=v;j++)
                s[i][j]=s[i][j-1]+s[i-1][j]-s[i-1][j-1]+q[i][j];
        }
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=v;j++)
//                System.out.print(q[i][j]+" ");
//            System.out.println();
//        }
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=v;j++)
//                System.out.print(s[i][j]+" ");
//            System.out.println();
//        }

        long res=0;
        for(int i=m;i<=r;i++){
            for(int j=m;j<=v;j++){
                res=Math.max(res,s[i][j]+s[i-m][j-m]-s[i][j-m]-s[i-m][j]);
            }
        }
        System.out.println(res);
    }
}
