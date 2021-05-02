package acw.算法基础课.ID02数据结构;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/25 - 12:28
 *
 * 静态链表 数组模拟链表：链表的实际顺序不按数组下标的顺序
 * 题目意思关键要弄明白,注意索引值
 */
class Node{
    int val;//存的值
    int next;//下一个结点的下标
}
public class ID01_0单链表 {
    static int index;//可存入的结点下标
    static int head;//指向链表第一个点的下标
    static Node[]nodes=new Node[100010];
    static void init(){
        head=-1;
        index=0;
    }
    //向链表头插入一个数
    static void insertToHead(int x){
        nodes[index]=new Node();
        nodes[index].val=x;
        nodes[index].next=head;
        head=index;
        index++;
    }
    //删除第k个插入的数后面的数 也就是删除下标k-1数的后面一个数
    //题目中第k个插入的数并不是指当前链表的第k个数,而是第k个插入的数。
    static void delete(int k){
        //删除头结点
        if(k==0){
            head=nodes[head].next;
            return ;
        }
        nodes[k-1].next=nodes[nodes[k-1].next].next;
    }
    //将x插到第k个插入的数的后面
    static void add(int k,int x){
        nodes[index]=new Node();
        nodes[index].val=x;
        nodes[index].next=nodes[k-1].next;
        nodes[k-1].next=index;
        index++;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        init();
        for(int i=0;i<n;i++){
            String key=in.next();
            if(key.equals("H")){
                int x=in.nextInt();
                insertToHead(x);
            }
            else if(key.equals("D")){
                int k=in.nextInt();
                delete(k);
            }
            else{
                int k=in.nextInt();
                int x=in.nextInt();
                add(k,x);
            }
        }
        while (head!=-1){
            System.out.print(nodes[head].val+" ");
            head=nodes[head].next;
        }
    }
}
