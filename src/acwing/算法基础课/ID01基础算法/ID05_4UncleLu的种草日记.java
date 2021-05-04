package acwing.算法基础课.ID01基础算法;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/12 - 18:49
 */
public class ID05_4UncleLu的种草日记 {
    static int[] b = new int[100000010];//差分

    static void insert(int l, int r) {
        b[l] += 1;
        b[r + 1] -= 1;
    }

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();
        while (m-- > 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            insert(l, r);
        }
        for(int i=1;i<=n;i++) b[i]+=b[i-1];
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            System.out.println(b[x]);
        }
    }
}
