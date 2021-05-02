package acw.蓝桥杯.ID03数学和DP;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Yeah
 * @date 2021/3/7 - 13:53
 * 暴力做法：打表找规律  一旦出现大于min(a,b)个连续的数后，之后的数肯定也是连续的，很好证明(加一个n*a就可以了)
 */
public class ID01买不到的数目 {
    static TreeSet<Integer> set=new TreeSet<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        for(int i=0;i<=1000;i++){
            for(int j=0;j<=1000;j++)
                set.add(a*i+b*j);
        }
        int minCnt=Math.min(a,b);
        int index=0;
        Iterator<Integer> iterator = set.iterator();
        Integer val1 = iterator.next();
        int key=0;
        while (iterator.hasNext()){
            Integer val2 = iterator.next();
            if(val2-val1==1){
                index++;
                if(index>=minCnt) {
                    key=val1;
                    break;
                }
            }
            else index=0;
            val1=val2;
        }
        System.out.println(key-minCnt);

    }
}
