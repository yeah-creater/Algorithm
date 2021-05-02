package acw.寒假每日一题_已完结;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Yeah
 * @date 2021/2/23 - 12:20
 *
 * 思路：利用栈转化为B进制 ,再双指针判断是否回文
 * 其实Integer.toString(a,b) 就能将数值a转为b进制  hhh不知道哎
 *
 * 十进制转为其他进制->短除法
 * 其他进制转为十进制->位权展开(不太好) 用秦九韶算法
 */
public class Day05_进制转换 {
    static int b;
    static String toB(int num){
        Stack<String> s=new Stack<>();
        while (num!=0){
            int val=num%b;
            if(val<=9)
                s.push(Integer.toString(val));
            else {
                char ch=(char)('A'+val-10);
                s.push(ch+"");
            }
            num/=b;
        }
        String str="";
        while (!s.empty()){
            str+=s.pop();
        }
        return str;
    }
    static boolean isPalin(String num){
        int i=0,j=num.length()-1;
        while (i<j){
            if(num.charAt(i++)!=num.charAt(j--))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        b=in.nextInt();
        for(int i=1;i<=300;i++){
            String s = toB(i * i);
            if (isPalin(s))
                System.out.println(toB(i)+" "+s);
        }
    }
}
