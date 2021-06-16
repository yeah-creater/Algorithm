package acwing.算法提高课.ID05数学知识.ID04约数个数;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID01轻拍牛头 {
    static int N = 1000010;
    //cnt[]为每个数出现的个数，s[]为每个数约数个数
    static int[] cnt = new int[N], s = new int[N], a = new int[N];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            cnt[a[i]]++;
        }
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j += i) {
                s[j] +=cnt[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[a[i]] - 1);
        }

    }

}
