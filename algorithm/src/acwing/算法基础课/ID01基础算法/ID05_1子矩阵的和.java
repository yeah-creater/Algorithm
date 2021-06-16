package acwing.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/23 - 21:19
 */
public class ID05_1子矩阵的和 {
    static int [][]f=new int[1010][1010];
    static int[][]s=new int[1010][1010];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int q=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                f[i][j]=in.nextInt();
                //结合图形理解  大面积
                s[i][j]=s[i-1][j]+s[i][j-1]-s[i-1][j-1]+f[i][j];
            }
        }
        while((q--)>0){
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();
            int y2=in.nextInt();
            //再次结合图形理解 那个小面积
            System.out.println(s[x2][y2]-s[x1-1][y2]-s[x2][y1-1]+s[x1-1][y1-1]);
        }
    }
}
