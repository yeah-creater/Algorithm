package acwing.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/24 - 12:40
 *
 * 2个指针指向2个序列
 */
public class ID06_2判断子序列 {
    static int []a=new int[100010];
    static int[]b=new int[100010];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=0;i<n;i++) a[i]=in.nextInt();
        for(int j=0;j<m;j++) b[j]=in.nextInt();
        int i=0;
        for(int j=0;j<m&&i<n;j++){
            if(a[i]==b[j])
                i++;
        }
        String res="";
        res= i==n?"Yes":"No";
        System.out.println(res);

    }
}
