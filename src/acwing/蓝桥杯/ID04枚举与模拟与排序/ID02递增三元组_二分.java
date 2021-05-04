package acwing.蓝桥杯.ID04枚举与模拟与排序;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Yeah
 * @date 2021/3/9 - 12:04
 * 将abc排序，枚举b  然后二分找大于b的c和小于b的a的个数
 */
public class ID02递增三元组_二分 {
    static int[] a, b, c;//abc会进行排序

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        a = new int[n];
        b = new int[n];
        c = new int[n];
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        String[] str3 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str1[i]);
            b[i] = Integer.parseInt(str2[i]);
            c[i] = Integer.parseInt(str3[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        long res = 0;
        for (int i = 0; i < n; i++) {
            int x = b[i];
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (a[mid] < x) l = mid;
                else r = mid - 1;
            }
            int cnt1 = a[l]<x?l+1:0;
            System.out.println(cnt1);
            l = 0;
            r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (c[mid] > x) r = mid;
                else l = mid + 1;
            }
            int cnt2 = c[l]>x?n-l:0;
            System.out.println(cnt2);
            //int *int会爆
            res+=(long)(cnt1)*(long)(cnt2);

        }
        System.out.println(res);
    }
}
