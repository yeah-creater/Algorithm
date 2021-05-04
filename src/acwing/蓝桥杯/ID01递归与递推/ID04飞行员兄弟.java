package acwing.蓝桥杯.ID01递归与递推;



import java.util.Scanner;


public class ID04飞行员兄弟 {
    //记录临时步骤
    static int[]steps=new int[20];
    //记录最终步骤
    static int[]fs=new int[20];
    //res记录最终的步骤数 cnt记录每次的步骤数
    static int res=20,cnt;
    static char[][]a=new char[4][4];
    //灯泡转换
    static void turn(int x,int y){
        for(int i=0;i<4;i++){
            a[x][i]=a[x][i]=='+'?'-':'+';
            a[i][y]=a[i][y]=='+'?'-':'+';
        }
        a[x][y]=a[x][y]=='+'?'-':'+';
    }
    static void dfs(int index){
        //因为是4*4 的二维矩阵
        if(index==16){
            boolean success=true;
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if(a[i][j]=='+'){
                        success=false;
                        break;
                    }
                }
            }
            //可行解，判断是否最优
            if(success) {
                if (cnt < res) {
                    res = cnt;
                    for (int i = 1; i <= cnt; i++)
                        fs[i] = steps[i];
                }
            }
            return;
        }
        //每个位置都有两种选择 1表示改变当前状态 0表示不变
        for(int i=0;i<=1;i++){
            //获取坐标
            int x=index/4;
            int y=index%4;
            if(i==1){
                //改变当前状态
                turn(x,y);
                cnt++;
                //记录步骤
                steps[cnt]=(x+1)*10+y+1;
                dfs(index+1);
                //又回溯到前面了,所以要恢复原来的样子
                turn(x,y);
                cnt--;
            }
            else dfs(index+1);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<4;i++){
            String s=in.next();
            for(int j=0;j<4;j++)
                a[i][j]=s.charAt(j);
        }
        dfs(0);
        System.out.println(res);
        for(int i=1;i<=res;i++)
            System.out.println(fs[i]/10+" "+fs[i]%10);
    }
}
