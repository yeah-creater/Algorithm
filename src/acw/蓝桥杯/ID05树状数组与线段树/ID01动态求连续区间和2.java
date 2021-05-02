package acw.蓝桥杯.ID05树状数组与线段树;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author Yeah
 * @date 2021/3/10 - 15:43
 * 使用树状数组
 */
public class ID01动态求连续区间和2 {
    static int []q=new int[100010];
    static int []c=new int[100010];
    static int n,m;
    static int lowBit(int x){
        return x&-x;
    }
    //将原数组第x个数加v
    static void add(int x,int v){
        for(int i=x;i<=n;i+=lowBit(i)) c[i]+=v;
    }
    //求1到x的和
    static int query(int x){
        int res=0;
        for(int i=x;i>0;i-=lowBit(i)) res+=c[i];
        return res;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        n=Integer.parseInt(str1[0]);
        m=Integer.parseInt(str1[1]);
        String []str2 = br.readLine().split(" ");
        for(int i=1;i<=n;i++) q[i]=Integer.parseInt(str2[i-1]);
        //初始化c(树状)数组
        for(int i=1;i<=n;i++) add(i,q[i]);

        while (m-->0){
            String[] str3 = br.readLine().split(" ");
            int k=Integer.parseInt(str3[0]);
            int a=Integer.parseInt(str3[1]);
            int b=Integer.parseInt(str3[2]);
            //求和
            if(k==0) System.out.println(query(b)-query(a-1));
            //加数
            else add(a,b);
        }

    }
}
