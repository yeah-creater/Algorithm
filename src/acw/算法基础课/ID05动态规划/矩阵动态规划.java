package acw.算法基础课.ID05动态规划;

/**
 * @author Yeah
 * @date 2021/3/26 - 11:08
 */


import java.util.*;

/**
 * @author Yeah
 * @date 2021/3/22 - 10:24
 * q[i][j]表示左上方某个点到这的最大值
 */
public class 矩阵动态规划 {
    static int n,m;
    static int[][]q=new int[110][110];
    //返回最上方的最大值
    static int leftTopMax(int r,int c){
        int max=-500;
        if(r==1&&c==1) return 0;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(r-i+c-j<=3&&r-i+c-j!=0||(r-i==2&&c-j==2)){
                    max=Math.max(max,q[i][j]);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++) q[i][j]=in.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                q[i][j]+=leftTopMax(i,j);
            }
        }
        System.out.println(q[n][m]);
    }
}
