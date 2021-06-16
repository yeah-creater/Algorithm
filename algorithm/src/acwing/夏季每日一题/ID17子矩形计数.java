package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 * 统计行和列的连续1长度的数量
 */
public class ID17子矩形计数 {
    static int n, m, k;
    static int N = 40010;
    static long res;
    static int[] a = new int[N], b = new int[N];
    static int[] s1 = new int[N], s2 = new int[N];

    static void add(int[] arr, int[] s, int n) {
        int cnt = 0;
        //差分
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                s[1]++;
                s[cnt + 1]--;
            } else {
                cnt = 0;
            }
        }
        //前缀和
        for (int i = 1; i <= n; i++) {
            s[i] += s[i - 1];
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = in.nextInt();
        }
        add(a, s1, n);
        add(b, s2, m);

        for (int i = 1; i <= n; i++) {
            if (k % i > 0) continue;
            int j = k / i;
            //列长度不够
            if(j > m) continue;
            res += (long) s1[i] * s2[j];
        }
        System.out.println(res);


    }
}
