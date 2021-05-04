package acwing.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/22 - 19:50
 */
public class ID02_1逆序对的数量 {
    static int []q=new int[100010];
    static int[]temp=new int[100010];
    static long mergeSort(int l,int r){
        if(l>=r) return 0;
        int mid=l+r>>1;
        //第一和二种情况
        long res=mergeSort(l,mid)+mergeSort(mid+1,r);
        int i=l,j=mid+1,k=0;
        while (i<=mid&&j<=r){
            if(q[i]<=q[j]) temp[k++]=q[i++];
            else {
                temp[k++]=q[j++];
                //第三种情况
                res+=mid-i+1;
            }
        }
        while (i<=mid) temp[k++]=q[i++];
        while (j<=r) temp[k++]=q[j++];
        for(i=l,k=0;i<=r;) q[i++]=temp[k++];
        return res;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        long res=mergeSort(0,n-1);
        System.out.println(res);
    }
}
