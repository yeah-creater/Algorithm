package acw.算法基础课.ID06贪心;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 1按左端点从小到大进行排序  线段左右端点分别是start end
 * 2从前往后依次遍历 选择能覆盖start的区间中，选择右端点最大的
 *  将start 更新为该区间的左端点
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
        Scanner in=new Scanner(System.in);
        int start=in.nextInt();
        int end=in.nextInt();
        int n=in.nextInt();
        Pair4[] p=new Pair4[n];
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            p[i]=new Pair4(x,y);
        }
        Arrays.parallelSort(p, Comparator.comparingInt(Pair4::getX));
        for(Pair4 pair4:p){

        }
    }
}
