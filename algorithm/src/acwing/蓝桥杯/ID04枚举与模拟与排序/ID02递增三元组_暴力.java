package acwing.蓝桥杯.ID04枚举与模拟与排序;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Yeah
 * @date 2021/3/9 - 10:38
 */
public class ID02递增三元组_暴力 {
    static int []a,b,c;//abc会进行排序
    static int[] fa,fb;//f[a]记录 第一个b>a的下标
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        a=new int[n];b=new int[n];c=new int[n];
        String []str1 = br.readLine().split(" ");
        String []str2 = br.readLine().split(" ");
        String []str3 = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            a[i]=Integer.parseInt(str1[i]);
            b[i]=Integer.parseInt(str2[i]);
            c[i]=Integer.parseInt(str3[i]);
        }
        Arrays.sort(a);Arrays.sort(b);Arrays.sort(c);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        fa=new int[n];fb=new int[n];
        int begin=0;
        for(int i=0;i<n;i++){
            fa[i]=n;
            for(int j=begin;j<n;j++){
                if(a[i]<b[j]){
                    fa[i]=j;
                    begin=j;//更新最小的j
                    break;
                }
                if(j==n-1) {
                    fa[i] = n;
                    begin = n;
                }
            }
        }
        begin=0;
        for(int i=0;i<n;i++){
            fb[i]=n;//默认没有
            for(int j=begin;j<n;j++){
                if(b[i]<c[j]){
                    fb[i]=j;
                    begin=j;//更新最小的j
                    break;
                }
                if(j==n-1) {
                    fb[i] = n;
                    begin = n;
                }
            }
        }
       System.out.println(Arrays.toString(fa));
       System.out.println(Arrays.toString(fb));
        long res=0;
        for(int i=0;i<n;i++){
            if(fa[i]!=n)
                for(int j=fa[i];j<n;j++){
                    res+=n-fb[j];
                }
        }
        System.out.println(res);

    }
}
