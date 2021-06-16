package lanqiao;

import org.junit.Test;

import java.util.Arrays;


/**
 * @author Yeah
 * @date 2021/2/18 - 12:40
 * @intention:
 * 循环改递归
 * 改为递归的关键是发现逻辑“相似性
 * 不要忘记递归出口
 * 递归调用
 * 递归调用仅仅是被调函数恰为主调函数
 * 注意每次调用的层次不同
 * 注意每次分配形参并非同一个变量
 * 注意返回的次序
 */

public class ID01递归 {
    //打印0~n
    void f01(int n){
        if(n>0){
            f01(n-1);
        }
        System.out.print(n+" ");
    }
    //打印begin到end
    void f02(int begin,int end){
        System.out.print(begin+" ");
        if(begin<end){
            f02(begin+1,end);
        }
    }
    //递归求数组和
    int f03(int[]arr,int begin){
        if(begin<arr.length){
            return f03(arr,begin+1)+arr[begin];
        }
        return 0;
    }
    //递归判断两个字符串是否相同
    boolean f04(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        if(str1.length()==0){
            return true;
        }
        if(str1.charAt(0)!=str2.charAt(0)){
            return false;
        }
        return f04(str1.substring(1),str2.substring(1));
    }

    /**
     * 循环改递归 打印0~n
     */
    @Test
    public void test01(){
        for(int i=0;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        f01(10);
        System.out.println();
        f02(2,7);
        System.out.println();
        int[]arr={1,2,3,6};
        System.out.println(f03(arr,0));
        System.out.println(f04("hello","hello"));

    }
    int sum(int n,int m){
        if(n<m) return 0;
        //如果原来的m和n合法，m不可能大于n
        if(n==m||m==0){
            return 1;
        }
        //n个里有个特殊球x,取法划分:包不包含x
        return sum(n-1,m-1)+sum(n-1,m);
    }
    //求n个元素的全排列
    void c(int []data,int k){
        if(k==data.length){
            System.out.println(Arrays.toString(data));
        }
        for(int i=k;i<data.length;i++){
            //试探  k位置与后面元素交换
            int temp=data[k];
            data[k]=data[i];
            data[i]=temp;
            c(data,k+1);
            //回溯
            temp=data[k];
            data[k]=data[i];
            data[i]=temp;
        }

    }
    int maxSubString(String str1,String str2){
        if(str1.length()==0||str2.length()==0) {
            return 0;
        }
        if(str1.charAt(0)==str2.charAt(0)){
            return 1+maxSubString(str1.substring(1),str2.substring(1));
        }
        return Math.max(maxSubString(str1,str2.substring(1)),maxSubString(str1.substring(1),str2));
    }

    /**
     * 在n个球中,任意取出m个
     * 求有多少种不同取法。
     *
     * 求n个元素的全排列
     *
     * 求两个串的最大公共子序列的长度(不一定连续)
     */
    @Test
    public void test02(){
        System.out.println(sum(14,6));
        int []arr={1,2,3,4,5};
        c(arr,0);
        System.out.println(maxSubString("abcd","aabddfjcgg"));

    }
    //对n进行加法划分
    void equal(int n){
        for(int i=n;i>=1;i--){
            
        }
    }

    /**
     * 对n进行加法划分
     */
    @Test
    public void test03(){

    }

}
