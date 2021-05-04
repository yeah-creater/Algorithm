package acwing.算法基础课.ID04数学知识;

/**
 * @author Yeah
 * @date 2021/3/19 - 20:44
 */
public class ID03_1筛法求欧拉函数 {
    static final int N=1000010;
    static int []primes=new int[N],phi=new int[N];
    static boolean []st=new boolean[N];
    static int cnt;
    //获取1到n所有数的欧拉函数和
    static long getEuler(int n){

        //筛素数
        for(int i=2;i<=n;i++){
            if(!st[i]){
                phi[i]=i-1;//i(素数)的欧拉函数
                primes[cnt++]=i;
                //求phi[i*n] 与phi[i]的关系
                for(int j=i+i;j<=n;j+=i) {
                    //phi[j]=(j/i)*phi[i];
                    st[j]=true;
                }
            }
        }
        return 0;

    }
    public static void main(String[] args) {

    }
}
