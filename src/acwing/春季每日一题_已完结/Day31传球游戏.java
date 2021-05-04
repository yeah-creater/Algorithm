package acwing.春季每日一题_已完结;

import java.util.Scanner;

/**
 * @author: yeah
 * 不妨设小蛮在0号，所有人的编号是 0∼n−10∼n−1。
 *
 * 状态表示 f[i, j]：
 *
 * 集合：所有已经传了i次球，且最后球在编号是j的小朋友手上的方案；
 * 属性：集合中元素的数量；
 * 状态计算：
 *
 * f[i, j]所表示的集合可以划分成两个子集：
 * 从左边传过来的集合大小是f[i, j - 1]；
 * 从右边传过来的集合大小是f[i, j + 1]；
 * f[i, j]等于两个子集的元素数之和。
 * 注意当j = 0或j = n - 1时需要特殊处理边界。
 *
 * 最终答案就是f[[m][0]。
 */
public class Day31传球游戏 {
    static int n,m;
    static int [][]f=new int[40][40];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        f[0][0]=1;
        for(int i=1;i<=m;i++){
            for(int j=0;j<n;j++){
                f[i][j]=f[i-1][(j+1+n)%n]+f[i-1][(j-1+n)%n];
            }
        }
        System.out.println(f[m][0]);

    }
}
