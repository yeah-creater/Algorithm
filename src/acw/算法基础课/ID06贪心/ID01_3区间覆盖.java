package acw.算法基础课.ID06贪心;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 1按左端点从小到大进行排序  线段左右端点分别是start end
 * 2从前往后依次遍历 选择能覆盖start的区间中，选择右端点最大的
 * 将start 更新为该区间的左端点
 */
class Pair4 {
    int x;
    int y;

    public Pair4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class ID01_3区间覆盖 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int st = in.nextInt();
        int ed = in.nextInt();
        int n = in.nextInt();
        Pair4[] p = new Pair4[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            p[i] = new Pair4(x, y);
        }
        Arrays.parallelSort(p, Comparator.comparingInt(Pair4::getX));
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int j = i, r = -1000000010;
            while (j < n && p[j].getX() <= st) {
                //更新右端点
                r = Math.max(r, p[j].getY());
                j++;
            }
            cnt++;
            //无法覆盖区间的左端点
            if (r < st) {
                System.out.println("-1");
                return;
            }
            //已经覆盖完区间的右端点
            if (r >= ed) {
                System.out.println(cnt);
                return;
            }
            st = r;
            i = j - 1;
        }
        //跳出循环说明没成功
        System.out.println("-1");
    }
}
