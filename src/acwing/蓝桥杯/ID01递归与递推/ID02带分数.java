package acwing.蓝桥杯.ID01递归与递推;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/4 - 21:57
 * 枚举全排列
 * 枚举位数
 * 判断是否满足等式
 */
public class ID02带分数 {
    static int []state=new int[10];
    static int []used=new int[10];
    static int res;
    static int cnt;
    static void dfs(int u){
        if(u==10){
            //a的位数
            for(int i=1;i<=7;i++){
                for(int j=1;j<=7;j++){
                    int k=9-i-j;
                    if(k<=0) continue;
                    int a=0,b=0,c=0;
                    for(int i1=1;i1<=i;i1++){
                        a=a*10+state[i1];
                    }
                    for(int j1=i+1,ct=0;ct<j;ct++,j1++){
                        b=b*10+state[j1];
                    }
                    for(int k1=i+j+1;k1<=9;k1++){
                        c=c*10+state[k1];
                    }
                    if (b%c!=0) continue;
                    if(b==(res-a)*c) {
                        cnt++;
                    }

                }
            }
            return;
        }
        for(int i=1;i<=9;i++){
            if(used[i]==0){
                state[u]=i;
                used[i]=1;
                dfs(u+1);
                used[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        res=in.nextInt();
        dfs(1);
        System.out.println(cnt);
    }
}
