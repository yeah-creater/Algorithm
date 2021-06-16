package acwing.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/21 - 16:50
 * id 756  扩展1113 1421
 * 思路：模拟法
 *
 * 求一个二维数组的周围的坐标，可以用偏移量dx[],dy[]数组(偏移量技巧)
 */
public class Day03_偏移量 {
    static final int N=105;
    static int[][]f=new int[N][N];

    public static void main(String[] args) {
        //法1
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int left=1,top=1,right=m,bottom=n,key=1;
        while (left<=right&&top<=bottom){
            //向右爬
            for(int i=left;i<=right;i++){
                f[top][i]=key++;
            }
            //向下爬
            for(int i=top+1;i<=bottom;i++){
                f[i][right]=key++;
            }
            //向左爬
            for(int i=right-1;i>=left&&top<bottom;i--){
                f[bottom][i]=key++;
            }
            //向上爬
            for(int i=bottom-1;i>top&&left<right;i--){
                f[i][left]=key++;
            }
            left++;right--;
            top++;bottom--;
        }
        if(n==m&&n%2==1) f[n/2+1][m/2+1]=n*m;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
        }

    }
}
