package acw.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/22 - 14:42
 */
public class ID02_0归并排序 {
    static int []q=new int[100010];
    static int []temp=new int[100010];
    //模板
    static void mergeSort(int l,int r){
        if(l>=r) return;
        int mid=l+r>>1;
        mergeSort(l,mid);
        mergeSort(mid+1,r);

        int i=l,j=mid+1,k=0;
        while (i<=mid&&j<=r){
            if(q[i]<=q[j]) temp[k++]=q[i++];
            else temp[k++]=q[j++];
        }
        while (i<=mid) temp[k++]=q[i++];
        while (j<=r) temp[k++]=q[j++];
        for(i=l,k=0;i<=r;) q[i++]=temp[k++];
    }
    //模板
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        mergeSort(0,n-1);
        for(int i=0;i<n;i++) System.out.print(q[i]+" ");
    }
}
