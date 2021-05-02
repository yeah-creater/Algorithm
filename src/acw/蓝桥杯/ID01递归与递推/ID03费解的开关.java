package acw.蓝桥杯.ID01递归与递推;


import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/5 - 15:51
 * 思路：枚举第一行的方案，第一行确定了,因为第一行不能改变了，所有第二行也确定了...
 */
public class ID03费解的开关 {
    static int[][]q=new int[10][10];
    static int res;
    static int cnt;
    static void turn(int x,int y){
        int []dx={-1,0,1,0},dy={0,1,0,-1};
        q[x][y]=q[x][y]==1?0:1;
        for(int i=0;i<4;i++){
            int a=x+dx[i];
            int b=y+dy[i];
            q[a][b]=q[a][b]==1?0:1;
        }
    }
    //u是第一行的列
    static void dfs(int u){
        if(u==6){
            //q克隆
            int[][] clone = new int[10][10];
            for(int i=1;i<=5;i++)
                for(int j=1;j<=5;j++)
                    clone[i][j]=q[i][j];
            int add=0;
            boolean success=true;
            for(int i=1;i<=4;i++){
                for(int j=1;j<=5;j++){
                    if(q[i][j]==0){
                        turn(i+1,j);
                        add++;
                        if(add+cnt>6)
                            success=false;
                    }
                }
            }
            //最后一列失败
            for(int i=1;i<=5;i++){
                if(q[5][i]==0)
                    success=false;
            }

            //恢复现场
            for(int i=1;i<=5;i++)
                for(int j=1;j<=5;j++)
                    q[i][j]=clone[i][j];
            //恢复现场

            if (success)
                res=Math.min(res,cnt+add);
            return;
        }
        //2种情况，按或不按
        for(int i=0;i<=1;i++){
            if(i==1){
                cnt++;
                turn(1,u);
                dfs(u+1);
                //恢复现场
                cnt--;
                turn(1,u);
            }
            else dfs(u+1);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            for(int i=1;i<=5;i++){
                String s=in.next();
                for(int j=1;j<=5;j++){
                    q[i][j]=Integer.parseInt(s.charAt(j-1)+"");
                }
            }
            res=Integer.MAX_VALUE;
            cnt=0;
            dfs(1);
            res=res==Integer.MAX_VALUE?-1:res;
            System.out.println(res);
        }
    }
}
