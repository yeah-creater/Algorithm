package acwing.算法基础课.ID02数据结构;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/25 - 14:40
 * 数组模拟队列
 */
public class ID02_1模拟队列 {
    static int[]queue=new int[100010];
    static int tail=0;//队尾元素的下一个下标
    static int front=0;//队头元素下标,因为输入是合法的队空时不会pop和query
    static void push(int x){
        queue[tail++]=x;
    }
    static void pop(){
        front++;
    }
    static int query(){
        return queue[front];
    }
    static String empty(){
        return tail==front?"YES":"NO";
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
