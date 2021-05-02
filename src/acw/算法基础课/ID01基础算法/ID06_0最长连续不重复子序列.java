package acw.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/24 - 12:31
 *
 * 双指针算法：
 *          引子：两个有序序列的合并用的就是双指针算法中的一种(两个序列)
 *          类型:2个指针指向2个序列
 *              2个指针指向1个序列(比较多)
 * 思路：先写一个暴力写法然后再判断i和j指针之间的单调关系
 */
public class ID06_0最长连续不重复子序列 {
    static int[]q=new int[100010];
    //标记一个数出现的个数
    static int[]a=new int[100001];
    //检查l到r中是否有重复元素,只要判断新出现的q[r]是否在a中有2次了
    static boolean check(int l,int r){
        return a[q[r]]==2;
    }
    public static void main(String[] args) {
        /*
        //朴素做法 i为右指针 j为左指针
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(check(j,i)){
                    res=Math.max(res,i-j+1);
                }
            }
        }*/
        //优化：在右指针不断指向末尾的同时,左指针不可能回溯,只能不动或向末尾走动
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)q[i]=in.nextInt();
        int i,j,res=0;
        for(i=0,j=0;i<n;i++){
            a[q[i]]++;
            while (j<=i&&check(j,i)) {
                a[q[j]]--;
                j++;
            }
            res=Math.max(res,i-j+1);
        }
        System.out.println(res);
    }
}
