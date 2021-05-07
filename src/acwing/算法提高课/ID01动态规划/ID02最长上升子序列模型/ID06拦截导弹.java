package acwing.算法提高课.ID01动态规划.ID02最长上升子序列模型;

import java.util.*;

/**
 * 最长上升子序列+贪心+二分
 */
public class ID06拦截导弹{
    static int []h=new int[1010],g=new int[1010];
    static int n,max;
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            h[++n]=in.nextInt();
        }
        //求从右到左的最长上升子序列
        for(int i=n;i>=1;i--){
            g[i]=1;
            for(int j=n;j>i;j--){
                if(h[i]>=h[j]){
                    g[i]=Math.max(g[i],g[j]+1);
                }
            }
            max=Math.max(max,g[i]);
        }
        System.out.println(max);
        //贪心  二分
        int []q=new int[1010];
        int l=0,r=0,res=1;
        q[l]=h[1];
        for(int i=2;i<=n;i++){
            int ll=l,rr=r;
            while(ll<rr){
                int mid=ll+rr>>1;
                if(q[mid]>=h[i]) rr=mid;
                else ll=mid+1;
            }
            if(q[ll]>=h[i]){
                q[ll]=h[i];
            }
            else{
                q[++r]=h[i];
                res++;
            }
        }
        System.out.println(res);
    }
}