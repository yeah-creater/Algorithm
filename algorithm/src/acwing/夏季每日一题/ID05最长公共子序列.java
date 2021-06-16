package acwing.夏季每日一题;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: yeaha
 * 转化成最长上升子序列(NlogN)(贪心+二分)
 * 因为A集合都是不重复的，所以可以开一个B‘ 存放B集合的元素在A集合出现的下标
 * ....
 * 所以求 A和B的最长公共子序列 就是求 B’的最长上升子序列
 * B‘的最长上升子序列用贪心+二分来求
 */
public class ID05最长公共子序列 {
    static int N = 1000010;
    static int[] a = new int[N], b = new int[N], pos = new int[N], q = new int[N];
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(s[i - 1]);
            pos[a[i]] = i;
        }
        String[] s1 = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            b[i] = Integer.parseInt(s1[i - 1]);
            b[i] = pos[b[i]];
        }
        int len = 0;
        q[0]=Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int l = 0, r = len;
            //排除不出现的情况
            if (b[i] == 0) continue;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (q[mid] < pos[b[i]]) l = mid;
                else r = mid - 1;
            }
            len = Math.max(len, l + 1);
            q[l + 1] = b[i];
        }
        System.out.println(len);

    }

}
