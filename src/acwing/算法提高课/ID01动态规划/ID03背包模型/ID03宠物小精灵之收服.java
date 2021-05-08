package acwing.算法提高课.ID01动态规划.ID03背包模型;

import java.util.Scanner;

/**
 * @author: yeah
 * f[j][k]精灵球数量不超过j,体力不超过k
 * 属性是数量
 * <p>
 * 朴素做法 MLE 了hhh
 */
public class ID03宠物小精灵之收服 {
    static int n, m, K;
    static int[][] f = new int[1010][110];
    static int[] cnt = new int[1010], cost = new int[510];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        K = in.nextInt();
        for (int i = 1; i <= K; i++) {
            cnt[i] = in.nextInt();
            cost[i] = in.nextInt();
        }
        for (int i = 1; i <= K; i++) {
            for (int j = n; j >= cnt[i]; j--) {
                for (int k = m; k >= cost[i]; k--) {
                    f[j][k] = Math.max(f[j][k], f[j - cnt[i]][k - cost[i]] + 1);
                }
            }
        }
        int res = 0;
        int minCost = 0;
        //这里取开区间因为消耗能量要小于初始能量
        for (int i = 1; i < m; i++) {
            if (f[n][i] > res) {
                res = f[n][i];
                minCost = i;
            }
        }
        System.out.println(res + " " + (m - minCost));

    }
}
