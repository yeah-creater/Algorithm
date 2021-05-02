package acw.算法基础课.ID03搜索与图论;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/6 - 11:59
 */
public class ID04_0Dijkstra {
    static int[][]p=new int[1010][1010];
    static int n,m,res;
    static void init(){
        for(int i=0;i<1010;i++)
            Arrays.fill(p[i],65536);
    }
    static void dijkstra(){
        boolean []used=new boolean[1010];
        int mid=1;
        p[1][1]=0;
        for(int k=1;k<=n;k++){//次数
            used[mid]=true;
            for(int i=1;i<=n;i++){
                int path=p[1][mid]+p[mid][i];
                if(path<p[1][i]&&!used[i]){
                    p[1][i]=path;
                }
            }
            int min=65536;
            for(int j=1;j<=n;j++){
                if(!used[j]&&p[1][j]<min){
                    min=p[1][j];
                    mid=j;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        n=Integer.parseInt(str1[0]);
        m=Integer.parseInt(str1[1]);
        init();
        for(int i=1;i<=m;i++){
            String[] str2 = br.readLine().split(" ");
            int a=Integer.parseInt(str2[0]);
            int b=Integer.parseInt(str2[1]);
            int val=Integer.parseInt(str2[2]);
            p[a][b]=val;
        }
        dijkstra();
        System.out.println(p[1][n]);

    }
}
