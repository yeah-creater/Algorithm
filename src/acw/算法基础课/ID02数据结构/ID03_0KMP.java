package acw.算法基础课.ID02数据结构;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/25 - 19:13
 * KMP:主串单调向前 模板串适当回溯
 */
public class ID03_0KMP {
    static int[]next=new int[100010];
    //p和s都从1开始
    static char []p=new char[100010];
    static char []s=new char[1000010];
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s1 = br.readLine();
        for(int i=1;i<=s1.length();i++) p[i]=s1.charAt(i-1);
        int m=Integer.parseInt(br.readLine());
        String s2 = br.readLine();
        for(int i=1;i<=s2.length();i++) s[i]=s2.charAt(i-1);
        //求next数组  p[1]=0;
        for(int i=2,j=0;i<=n;i++){
            while (j>0&&p[i]!=p[j+1]) j=next[j];
            if(p[i]==p[j+1]) j++;
            next[i]=j;
        }
        //匹配过程
        for(int i=1,j=0;i<=m;i++){
            while (j>0&&s[i]!=p[j+1]) j=next[j];
            if(s[i]==p[j+1]) j++;
            if(j==n){
                System.out.print((i-n)+" ");
                j=next[j];
            }
        }

    }
}
