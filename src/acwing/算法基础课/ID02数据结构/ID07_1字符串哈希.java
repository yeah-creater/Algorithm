package acwing.算法基础课.ID02数据结构;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/28 - 22:37
 * 字符串前缀哈希法：
 *              1.将字符串看出p进制的数
 *              2.将p进制的数转化为十进制  比如YEAH  就是 25*p^3+5*p^2...
 *              3.将转化的十进制mod Q  Q差不多为存储空间的大小
 *              注意 1.不能映射成0 2.p为131或13331 Q为2^64 冲突的概率很小很小
 * 一个字符串 比如ABBBAABBBHGHYBZNNB  前缀A哈希已知 前缀AB... ABB...NNB的哈希都知道了
 *                                  那么中间的子串哈希值也知道了(要注意位数)，就能判断子串是否相等了
 *         类似于前面的前缀和
 */
public class ID07_1字符串哈希 {
    static long []h=new long[100010];//存储前缀哈希值
    static long []p=new long[100010];//存储位权
    static final int P=131;//131进制
    static long getHashCode(int l,int r){
        return h[r]-h[l-1]*p[r-l+1];//l比r多的位数,因为左边是高位  就像1234减去左边的12 是1234-12*100;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        p[0]=1;
        int n=in.nextInt();
        int m=in.nextInt();
        //模式串
        String str=in.next();
        //p和h
        for(int i=1;i<=n;i++) {
            p[i] = p[i - 1] * P;
            h[i] = h[i-1]*P+str.charAt(i-1);
        }
        while ((m--)>0){
            int l1=in.nextInt();
            int r1=in.nextInt();
            int l2=in.nextInt();
            int r2=in.nextInt();
            String res=getHashCode(l1,r1)==getHashCode(l2,r2)?"Yes":"No";
            System.out.println(res);
        }

    }
}
