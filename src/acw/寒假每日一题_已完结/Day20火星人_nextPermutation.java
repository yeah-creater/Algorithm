package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/8 - 20:57
 * C++ next_permutation 的手动实现
 *                              :尽可能变末尾的位(从后2位到后3位直到发现不是降序)
 *                              (找到的那个数和后面大于它的最小值交换)
 *                              (然后那个数后面的数按递增顺序排列)
 */
public class Day20火星人_nextPermutation {
    static int []q=new int[10010];
    static int n;
    static void nextPermutation(int x){
        if(x==0) return;
        //最少看2位
        for(int i=n-2;i>=0;i--){
            //q[i]为要交换的数
            if(q[i]<q[i+1]){
                //找到要和q[i]交换的数
                for(int j=n-1;j>i;j--){
                    if(q[j]>q[i]){
                        int tmp=q[j];
                        q[j]=q[i];
                        q[i]=tmp;
                        //交换以后倒置子序列
                        for(int k=i+1;k<=(n+i)/2;k++){
                            int t=q[k];
                            q[k]=q[n-k+i];
                            q[n-k+i]=t;
                        }
                        nextPermutation(x-1);
                        break;
                    }
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int m=in.nextInt();
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        nextPermutation(m);
        for(int i=0;i<n;i++)
            System.out.print(q[i]+" ");

    }
}
