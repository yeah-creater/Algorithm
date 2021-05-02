package acw.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/24 - 14:00
 * 思路：先写一个暴力写法然后再判断i和j指针之间的单调关系 关键使得i和j无法回溯
 */
public class ID06_1数组元素的目标和 {
    static int []a=new int[100010];
    static int []b=new int[100010];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int sum=in.nextInt();
        for(int i=0;i<n;i++) a[i]=in.nextInt();
        for(int j=0;j<m;j++) b[j]=in.nextInt();
        /*
        //过9/12
        for(int i=0;i<n&&a[i]<sum;i++){
            for(int j=0;j<m&&b[j]<sum;){
                if(a[i]+b[j]==sum) {
                    System.out.print(i+" "+j);
                    return;
                }
                else if(a[i]+b[j]>sum) {
                    m = j;
                    break;
                }
                else
                    j++;
            }
        }
        */
        //换一种思路，i和j分别指向一个数组的头和尾
        for(int i=0,j=m-1;i<n;i++){
           while (a[i]+b[j]>sum)
               j--;
           if(a[i]+b[j]==sum){
                System.out.print(i+" "+j);
                return;
           }
        }
    }
}
