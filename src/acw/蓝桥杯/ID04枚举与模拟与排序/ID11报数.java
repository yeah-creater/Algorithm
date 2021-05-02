package acw.蓝桥杯.ID04枚举与模拟与排序;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/26 - 22:11
 */
public class ID11报数 {
    static int []skip=new int[4];
    static boolean check(int x){
        if(x%7==0) return false;
        while (x>0){
            if(x%10==7) return false;
            x/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        //报数的人的序号
        int x=0;
        //报的数的数量 及要报的数是啥
        int t=0,idx=1;
        while (t<n){
            if(check(idx)) t++;
            else skip[x]++;
            x=(x+1)%4;
            idx++;
        }
        for(int i=0;i<4;i++) System.out.print(skip[i]+" ");
    }
}
