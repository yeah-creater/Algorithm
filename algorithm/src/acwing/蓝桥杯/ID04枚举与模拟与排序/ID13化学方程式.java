package acwing.蓝桥杯.ID04枚举与模拟与排序;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/26 - 22:44
 */
public class ID13化学方程式 {
    static boolean isOk(String str){
        String[] str2 = str.split("=");
        if(!str2[0].contains("+")) return str2[0].equals(str2[1]);
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String str=in.next();
            if(isOk(str)) System.out.println("Y");
            else System.out.println("N");
        }
    }
}
