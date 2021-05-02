package acw.算法基础课.ID06贪心;

import javafx.scene.Parent;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 按右端点进行排序
 */
class Pair2 {
    int x;
    int y;

    public Pair2(int x, int y) {
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
public class ID01_1最大不相交区间数量 {
    static Pair2[]p=new Pair2[100010];
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            p[i]=new Pair2(x,y);
        }
        Arrays.parallelSort(p,0,n, Comparator.comparingInt(Pair2::getY));
        int cnt=0;
        for(int i=0;i<n;){
            cnt++;
            int endY=p[i].y;
            while (i<n-1&&p[i+1].x<endY){
                i++;
            }
            i++;
        }
        System.out.println(cnt);

    }
}
