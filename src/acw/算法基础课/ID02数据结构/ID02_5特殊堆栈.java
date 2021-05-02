package acw.算法基础课.ID02数据结构;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @purpose:
 */
public class ID02_5特殊堆栈 {
    static int[]stack=new int[100010];
    static ArrayList<Integer> list=new ArrayList<>();
    static int tt=-1;//尾下标
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        while (n-->0){

            String str=in.nextLine();
            if(str.contains("Push")){
                String[] s = str.split(" ");
                int x=Integer.parseInt(s[1]);
                stack[++tt]=x;
                list.add(x);
            }
            else if(str.contains("Pop")){
                if(tt==-1){
                    System.out.println("Invalid");
                }
                else{
                    list.remove(new Integer(stack[tt]));
                    System.out.println(stack[tt--]);
                }
            }
            else{
                if(tt==-1){
                    System.out.println("Invalid");
                }
                else{
                    int size=tt;
                    Collections.sort(list);
                    System.out.println(list.get(size/2));
                }
            }
        }
    }
}
