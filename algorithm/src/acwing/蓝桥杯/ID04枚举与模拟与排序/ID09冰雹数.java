package acwing.蓝桥杯.ID04枚举与模拟与排序;


import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/15 - 14:44
 */
public class ID09冰雹数 {
    static int getTop(int x){
        int max=x;
        while (x!=1){
            if(x%2==0) x/=2;
            else x=x*3+1;
            if(x>max) max=x;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long max=0;
        int x=in.nextInt();
        for(int i=1;i<=x;i++){
            if(getTop(i)>max) max=getTop(i);
        }
        System.out.println(max);
    }
}
