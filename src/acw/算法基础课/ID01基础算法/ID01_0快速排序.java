package acw.算法基础课.ID01基础算法;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Yeah
 * @date 2021/2/22 - 13:18
 */
public class ID01_0快速排序 {
    static final int N=1000*100+10;
    static int[]q=new int[N];
    //模板
    static void quickSort(int l,int r){
        if(l>=r) return;
        int i=l-1,j=r+1,x=q[(l+r)/2];
        while (i<j){
            //一旦交换完位置说明能进入下一层循环
            //一旦进入循环两个指针就++和--
            do i++;while (q[i]<x);
            do j--;while (q[j]>x);
            if(i<j){
                int temp=q[i];
                q[i]=q[j];
                q[j]=temp;
            }
        }
        quickSort(l,j);
        quickSort(j+1,r);
    }
    //模板
    public static void main(String[] args) throws Exception{
        //效率更高
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        quickSort(0,n-1);
        for(int i=0;i<n;i++) System.out.print(q[i]+" ");
    }
}
