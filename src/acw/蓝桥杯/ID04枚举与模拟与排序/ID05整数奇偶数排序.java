package acw.蓝桥杯.ID04枚举与模拟与排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/11 - 16:26
 */
public class ID05整数奇偶数排序 {
    static ArrayList<Integer> odd=new ArrayList<>();
    static ArrayList<Integer> even=new ArrayList<>();

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int x=in.nextInt();
            if(x%2==1) odd.add(x);
            else even.add(x);
        }
        Collections.sort(odd);
        Collections.sort(even);
        for(int i=odd.size()-1;i>=0;i--)
            System.out.print(odd.get(i)+" ");
        for(int i=0;i<even.size();i++)
            System.out.print(even.get(i)+" ");
    }
}
