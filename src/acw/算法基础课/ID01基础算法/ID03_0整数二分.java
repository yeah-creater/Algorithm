package acw.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/22 - 15:55
 * 二分的本质是边界，只要找到某种性质使得整个区间一分为二，那么就可以利用二分把边界找出来
 */
public class ID03_0整数二分 {
    static int[]q=new int[100010];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        while ((m--)>0){
            int x=in.nextInt();
            int l=0,r=n-1;
            while (l<r){
                int mid=l+r>>1;
                if(q[mid]>=x) r=mid;
                else l=mid+1;
            }
            if(q[l]!=x){
                System.out.println("-1 -1");
            }
            else{
                System.out.print(l+" ");
                l=0;r=n-1;
                while (l<r){
                    int mid=l+r+1>>1;
                    if(q[mid]<=x) l=mid;
                    else r=mid-1;
                }
                System.out.println(l);
            }
        }
    }
}
