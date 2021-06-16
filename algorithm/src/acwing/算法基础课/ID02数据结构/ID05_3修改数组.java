package acwing.算法基础课.ID02数据结构;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/1 - 20:53
 */
public class ID05_3修改数组 {
    static int[]p=new int[100010];
    static int find(int x){
        if(x!=p[x]) p[x]=find(p[x]);
        return p[x];
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++) a[i]=in.nextInt();
        for(int i=1;i<100010;i++) p[i]=i;
        for(int i=0;i<n;i++){
            int x=find(a[i]);
            System.out.print(x+" ");
            p[x]=x+1;
        }
    }
}
