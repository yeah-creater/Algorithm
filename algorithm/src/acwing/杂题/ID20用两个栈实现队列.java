package acwing.杂题;

import java.util.Stack;

/**
 * @author Yeah
 * @date 2021/2/22 - 19:13
 */
class MyQueue{
    //s2为辅助栈  (栈可以理解为只能在一端进行插和删除的链表)
    Stack<Integer> s1,s2;
    /** Initialize your data structure here. */
    public MyQueue() {
       s1=new Stack<>();
       s2=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (s1.size()!=1){
            s2.push(s1.pop());
        }
        int val=s1.pop();
        while (!s2.empty()){
            s1.push(s2.pop());
        }
        return val;
    }

    /** Get the front element. */
    public int peek() {
        while (s1.size()!=1){
            s2.push(s1.pop());
        }
        int val=s1.peek();
        while (!s2.empty()){
            s1.push(s2.pop());
        }
        return val;

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty();
    }

}
public class ID20用两个栈实现队列 {
    public static void main(String[] args) {

    }
}
