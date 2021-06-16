package acwing.寒假每日一题_已完结;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/16 - 16:44
 */
public class Day33拼写正确 {
    static HashMap<Integer,String> map=new HashMap<>();
    static {
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
    }
    static int getSum(String num){
        int sum=0;
        for(int i=0;i<num.length();i++)
            sum+=Integer.parseInt(num.charAt(i)+"");
        return sum;
    }
    static void transToE(int x){
        if(x<10)
            System.out.print(map.get(x)+" ");
        else{
            transToE(x/10);
            System.out.print(map.get(x%10)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String num=in.next();
        transToE(getSum(num));
    }
}
