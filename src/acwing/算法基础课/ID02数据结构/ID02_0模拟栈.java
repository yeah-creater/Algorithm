package acwing.算法基础课.ID02数据结构;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/25 - 14:38
 *
 * 数组模拟栈
 */
public class ID02_0模拟栈 {
    static int[]stack=new int[100010];
    static int top=-1;//栈顶元素下标
    static void push(int x){
        stack[++top]=x;
    }
    static void pop(){
        top--;
    }
    static int query(){
        return stack[top];
    }
    static String empty(){
        return top==-1?"YES":"NO";
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String key=in.next();
            if(key.equals("push")){
                int x=in.nextInt();
                push(x);
            }
            else if(key.equals("pop"))
                pop();
            else if(key.equals("query"))
                System.out.println(query());
            else
                System.out.println(empty());
        }
    }
}
