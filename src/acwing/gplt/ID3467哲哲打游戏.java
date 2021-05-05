package acwing.gplt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: yeah
 * 模拟
 */
public class ID3467哲哲打游戏 {
    static ArrayList<Integer>[] g = new ArrayList[100010];
    static int n, m;
    static int[] record = new int[110];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        for (int i = 1; i <= n; i++) {
            String[] s1 = br.readLine().split(" ");
            int cnt = Integer.parseInt(s1[0]);
            g[i] = new ArrayList<>();
            for (int j = 1; j <= cnt; j++) {
                g[i].add(Integer.parseInt(s1[j]));
            }
        }
        int p = 1;
        while (m-- > 0) {
            String[] s2 = br.readLine().split(" ");
            int a = Integer.parseInt(s2[0]);
            int b = Integer.parseInt(s2[1]);
            if (a == 0) {
                p = g[p].get(b-1);
            } else if (a == 1) {
                record[b] = p;
                bw.write(p + "\n");
            } else {
                p = record[b];
            }
        }
        bw.write(p + "");
        bw.flush();
    }
}
