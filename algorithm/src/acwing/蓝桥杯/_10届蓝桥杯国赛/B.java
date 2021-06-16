package acwing.蓝桥杯._10届蓝桥杯国赛;

/**
 * @author: yeah
 */
public class B {
    static int []nums=new int[100];
    static int cnt=1;
    static void init(){
        for(int i=1;i*i<2019;i++){
            nums[cnt++]=i*i;
        }
    }
    static int [][]f=new int[100][2100];
    public static void main(String[] args) {
        init();
        for(int i=0;i<cnt;i++){
            f[i][0]=1;
        }
        for(int i=1;i<cnt;i++){
            for(int j=1;j<=2019;j++){
                if(nums[i]>j){
                    f[i][j]=f[i-1][j];
                }
                else{
                    f[i][j]=f[i-1][j]+f[i-1][j-nums[i]];
                }
            }
        }
        System.out.println(f[cnt-1][2019]);
    }
}
