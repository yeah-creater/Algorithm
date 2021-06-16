package acwing.算法基础课.ID02数据结构;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/27 - 20:22
 *
 * 哈希(散列):
 * 离散化是一种特殊的哈希方式,因为它需要保序
 */
public class ID07_0模拟散列表 {
    static final int nu=0x3f3f3f3f;//不在数据范围内
    //N取质数冲突会比较少
    static int N=200003;
    static int []h=new int[200010];
    static {
        Arrays.fill(h,nu);
    }
    static int hash(int x){
        return (x%N+N)%N;
    }
    //查找x在的位置,x不存在返回一个空位置
    static int find(int x){
        int k=hash(x);
        while (h[k]!=x&&h[k]!=nu)k=(k+1)%N;
        return k;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String key=in.next();
            int x=in.nextInt();
            int k=find(x);
            if(key.equals("I")) h[k]=x;
            else{
                if(h[k]==nu)
                    System.out.println("No");
                else
                    System.out.println("Yes");
            }

        }
    }
}
