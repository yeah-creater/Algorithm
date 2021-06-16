package acwing.夏季每日一题;


import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author: yeah
 */
public class ID24数组补全 {

    static int n, k, p, max, min, sum, cnt1, cnt2, cnt;
    static int[] a;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[1]);
        p = Integer.parseInt(s[2]);
        max = Integer.parseInt(s[3]);
        min = Integer.parseInt(s[4]);
        a = new int[n];
        if (k != 0) {
            String[] ss = br.readLine().split(" ");
            for (int i = 0; i < ss.length; i++) {
                a[i] = Integer.parseInt(ss[i]);
                sum += a[i];
                //大于中位数的个数
                if (a[i] > min) {
                    cnt1++;
                }
                //等于中位数的个数
                if (a[i] == min) {
                    cnt2++;
                }
            }
        }
        cnt = cnt1 + cnt2;
        if (sum + (n - k) > max || cnt + n - k <= n / 2) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder("");
        if (cnt >= (n + 1) / 2) {

            for (int i = 0; i < n - k; i++) {
                sb.append("1 ");
            }
            System.out.println(sb);
            return;
        }
        int left = (n + 1) / 2 - cnt;
        if (sum + (left) * min + (n - k - left) > max) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < left; i++) {
                sb.append(min + " ");
            }
            for (int i = 0; i < n - k - left; i++) {
                sb.append(1 + " ");
            }
            System.out.println(sb);
        }


    }
}
//9 7 2 14 1
//2 2 2 1 1 2 2