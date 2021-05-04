package acwing.春季每日一题_已完结;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Yeah
 * @date 2021/3/21 - 19:45
 */
public class Day03表达式求值 {
    public static int calc(String s){
        char sign = '+';  //初始符号默认为正
        long num = 0;   //当前数值
        long res = 0;   //最终结果
        Stack<Long> stk = new Stack<>();

        int i = 0;
        while(i < s.length()){
            char t = s.charAt(i);
            if(Character.isDigit(t)){
                num = num *10 + t - '0';
            }else if( t =='('){
                int cnt = 0;
                int j = i;
                for(;i<s.length();i++){
                    if(s.charAt(i) == '(') cnt++;
                    if(s.charAt(i) == ')') cnt--;
                    if(cnt == 0) break;
                }
                num = (long)calc(s.substring(j+1,i+1));
            }

            if (t == '+' || t == '-' || t == '*' || t == '/' || i == s.length() - 1){
                if(sign == '+') stk.push(num);
                else if(sign == '-') stk.push(-num);
                else if(sign == '*'){
                    long tmp=stk.peek();
                    stk.pop();
                    stk.push((long)tmp*num);
                }else if(sign == '/'){
                    long tmp  =stk.peek();
                    stk.pop();
                    stk.push((long)(tmp/num));
                }

                sign = t;
                num = 0;
            }
            i++;
        }

        while(!stk.isEmpty()){
            res += stk.pop();
        }

        return (int)res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(calc(s));
    }
}
