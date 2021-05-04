package acwing.算法基础课.ID04数学知识;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/3 - 19:53
 */
public class ID02_0试除法求约数 {
    static ArrayList<Integer> getDivisors(int n){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=1;i<=n/i;i++){
            if(n%i==0){
                arrayList.add(i);
                if(n/i!=i) arrayList.add(n/i);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int x=in.nextInt();
            ArrayList<Integer> divisors = getDivisors(x);
            for(int i=0;i<divisors.size();i++)
                System.out.print(divisors.get(i)+" ");
            System.out.println();
        }
    }
}
