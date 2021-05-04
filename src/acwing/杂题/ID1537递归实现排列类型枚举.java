package acwing.杂题;


import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class ID1537递归实现排列类型枚举 {
    static int[] q;
    static int[] path = new int[10];
    static boolean[] used = new boolean[10];//记录那个编号的数字被用过了
    static int n;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void dfs(int u) throws Exception {
        if (u == n) {
            for (int i = 0; i < n; i++)
                bw.write(path[i] + " ");
            bw.write("\n");
            return;
        }
        //记录在某一位还没出栈时用过数字
        boolean[] st = new boolean[10];
        for (int i = 0; i < n; i++) {
            if (!used[i] && !st[q[i]]) {
                path[u] = q[i];
                st[q[i]] = true;
                used[i] = true;
                dfs(u + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        q = new int[n];
        for (int i = 0; i < n; i++) q[i] = in.nextInt();
        Arrays.sort(q);
        dfs(0);
        bw.flush();

    }
}
