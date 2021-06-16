package acwing.蓝桥杯.ID01递归与递推;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/4 - 20:27
 */
public class ID01递归实现指数型枚举 {
    static int n;
    static int []st=new int[20];
    static int[]path=new int [20];
    //传入当前位置和目标空位
    static void dfs(int pos,int tar){
        if(pos>tar){
            for(int i=1;i<=tar;i++){
                System.out.print(path[i]+" ");
            }
            System.out.println();
            return ;
        }
        for(int i=1;i<=n;i++){
            if(st[i]==0&&path[pos-1]<i){
                path[pos]=i;
                st[i]=1;
                dfs(pos+1,tar);
                st[i]=0;
            }
        }

    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<=n;i++){
            dfs(1,i);
        }
    }

}
