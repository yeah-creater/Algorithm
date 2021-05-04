package acwing.算法基础课.ID01基础算法;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/23 - 23:18
 */
public class ID05_3差分矩阵 {
    static final int N=1010;
    static int[][]a=new int[N][N];
    static int[][]b=new int[N][N];
    static void insert(int x1,int y1,int x2,int y2,int c){
        b[x1][y1]+=c;
        b[x1][y2+1]-=c;
        b[x2+1][y1]-=c;
        b[x2+1][y2+1]+=c;
    }
    public static void main(String[] args)throws Exception{
        Scanner in=new Scanner(System.in);
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str1 = reader.readLine().split(" ");
        int n=Integer.parseInt(str1[0]);
        int m=Integer.parseInt(str1[1]);
        int q=Integer.parseInt(str1[2]);
        for(int i=1;i<=n;i++){
            String[] str2 = reader.readLine().split(" ");
            for(int j=1;j<=m;j++){
                a[i][j]=Integer.parseInt(str2[j-1]);
                insert(i,j,i,j,a[i][j]);
            }
        }
        //求差分bn
        while((q--)>0){
            String[] str3 = reader.readLine().split(" ");
            int x1 = Integer.parseInt(str3[0]);
            int y1 = Integer.parseInt(str3[1]);
            int x2 = Integer.parseInt(str3[2]);
            int y2 = Integer.parseInt(str3[3]);
            int c  = Integer.parseInt(str3[4]);
            insert(x1,y1,x2,y2,c);
        }
        //求bn前缀和
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                b[i][j]+=b[i-1][j]+b[i][j-1]-b[i-1][j-1];
                writer.write(b[i][j]+" ");
            }
            writer.write("\n");
        }
        writer.flush();
    }


}
