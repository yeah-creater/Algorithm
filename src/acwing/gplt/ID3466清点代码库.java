package acwing.gplt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * @author: yeah
 */
class Pair implements Comparable<Pair> {
    int cnt;
    ArrayList<Integer> list;

    public Pair(int cnt, ArrayList<Integer> list) {
        this.cnt = cnt;
        this.list = list;
    }

    @Override
    public int compareTo(Pair o) {
        if (this.cnt != o.cnt) return o.cnt - cnt;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(o.list.get(i))) {
                return list.get(i) - o.list.get(i);
            }
        }
        return 0;
    }

}

public class ID3466清点代码库 {
    static HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
    static int n, m;
    static ArrayList<Pair> res = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int x = Integer.parseInt(s1[j]);
                list.add(x);
            }
            map.merge(list, 1, Integer::sum);
        }
        Set<ArrayList<Integer>> set = map.keySet();
        for (ArrayList<Integer> l : set) {
            res.add(new Pair(map.get(l), l));
        }
        Collections.sort(res);
        System.out.println(res.size());
        for (Pair p : res) {
            bw.write(p.cnt + "");
            for (int i = 0; i < m; i++) {
                bw.write(" " + p.list.get(i));
            }
            bw.write("\n");
        }
        bw.flush();

    }
}
