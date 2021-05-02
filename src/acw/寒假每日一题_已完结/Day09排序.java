package acw.寒假每日一题_已完结;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/27 - 14:59
 */
class Grade implements Comparable{
    int id;
    int a;
    int b;
    int c;
    int sum;
    public Grade(int id,int a, int b, int c) {
        this.id=id;
        this.a = a;
        this.b = b;
        this.c = c;
        this.sum=a+b+c;
    }

    @Override
    public int compareTo(Object o) {
        Grade g=(Grade)o;
        if(g.sum==this.sum){
            if(g.a==this.a){
                return g.id<this.id?1:-1;
            }
            return g.a>this.a?1:-1;
        }
        return g.sum>this.sum?1:-1;
    }
}
public class Day09排序 {
    public static void main(String[] args) {
        ArrayList<Grade> list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            list.add(new Grade(i,a,b,c));
        }
        Collections.sort(list);
        for(int i=0;i<5;i++)
            System.out.println(list.get(i).id+" "+list.get(i).sum);
    }
}
