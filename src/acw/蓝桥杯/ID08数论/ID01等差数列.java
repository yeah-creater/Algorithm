package acw.蓝桥杯.ID08数论;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/8 - 15:11
 */
public class ID01等差数列 {
    static int[]q;
    static int n;
    static ArrayList<Integer> list=new ArrayList<>();//存储约数
    //传入公差
    static boolean check(int dif){
        for(int i=1;i<n;i++){
            if((q[i]-q[i-1])%dif!=0)
                return false;
        }
        return true;
    }
    //获取一个数的所有约数
    static void getGcd(int x){
        for(int i=1;i<=x/i;i++){
            if(x%i==0) {
                list.add(i);
                list.add(x/i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        q=new int[n];
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        Arrays.sort(q);
        int min=q[0],max=q[n-1];
        getGcd(max-min);
        int d=max-min;
        //公差为0
        if(d==0){
            System.out.println(n);
            return;
        }
        //d为最大公差数
        //an=a1+(n-1)d  n-1=an-a1/d 所以d肯定是an-a1的约数
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--){
            if(check(list.get(i))){
                d=list.get(i);
                break;
            }
        }
        System.out.println((max-min)/d+1);
    }
}
