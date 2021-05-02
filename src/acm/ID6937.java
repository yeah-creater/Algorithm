package acm;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/3 - 14:11
 */
public class ID6937 {
    static HashSet<Integer> hashSet=new HashSet<>();
    static void init(){
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addLast(1);
        hashSet.add(1);
        while (!deque.isEmpty()){
            Integer i = deque.pollFirst();
            int a=5*i+13;
            int b=13*i+5;
            int c=13*i-5;
            int d=5*i-13;
            if (a > 0 && !hashSet.contains(a)&&a<=1000000) {
                deque.add(a);
                hashSet.add(a);
            }
            if (b > 0 && !hashSet.contains(b)&&b<=1000000) {
                deque.add(b);
                hashSet.add(b);
            }
            if (c > 0 && !hashSet.contains(c)&&c<=1000000) {
                deque.add(c);
                hashSet.add(c);
            }
            if (d > 0 && !hashSet.contains(d)&&d<=1000000) {
                deque.add(d);
                hashSet.add(d);
            }

        }
    }
    public static void main(String[] args) {
        init();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int x=in.nextInt();
            String res=hashSet.contains(x)?"Yes":"No";
            System.out.println(res);
        }
    }
}
