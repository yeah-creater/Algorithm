package acm;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Yeah
 * @date 2021/1/16 - 12:36
 * @intention:
 */
public class ID1087 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            String str=in.next();
            Stack<String> stack=new Stack<>();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='('){
                    stack.push("(");
                }
                else if(str.charAt(i)==')'){
                    stack.pop();
                }
                else if(str.charAt(i)=='B'){
                    System.out.println(stack.size());
                    break;
                }
            }
        }
    }
}
