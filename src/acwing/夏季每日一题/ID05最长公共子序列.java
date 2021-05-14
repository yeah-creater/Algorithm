package acwing.夏季每日一题;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: yeah
 * 转化成最长上升子序列(NlogN)(贪心+二分)
 * 因为A集合都是不重复的，所以可以开一个B‘ 存放B集合的元素在A集合出现的下标
 * ....
 * 所以求 A和B的最长公共子序列 就是 B’的最长上升子序列
 */
public class ID05最长公共子序列 {
    static int N=1000010;
    static int[]a=new int[N],b=new int[N],pos=new int[N],q=new int[N];
    static int n;

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for(int i=1;i<=n;i++){
            a[i]=Integer.parseInt(s[i]);
            pos[a[i]]=i;
        }

    }

}
