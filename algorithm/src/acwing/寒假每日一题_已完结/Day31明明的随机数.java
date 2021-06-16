package acwing.寒假每日一题_已完结;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Yeah
 * @date 2021/3/16 - 10:47
 */
public class Day31明明的随机数 {
    static TreeSet<Integer> set=new TreeSet<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            set.add(x);
        }
        System.out.println(set.size());
        while (!set.isEmpty()) System.out.print(set.pollFirst()+" ");
    }
}
