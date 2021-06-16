package acwing.算法基础课.ID02数据结构;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @purpose:
 */
public class ID06_2关于堆的判断 {
    static int n,m;
    static HashMap<Object,Integer> map=new HashMap<>();
    public static void main(String[] args) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        for(int i=0;i<n;i++) heap.add(in.nextInt());
        Integer[] h = new Integer[1010];
        h = heap.toArray(h);
        for(int i=1;i<=n;i++)
            map.put(h[i-1],i);
        in.nextLine();
        for(int i=0;i<m;i++){
            String str=in.nextLine();
            String res="";
            if(str.contains("root")){
                String[] s = str.split(" ");
                Integer x=Integer.parseInt(s[0]);
                res=map.get(x)==1?"T":"F";
            }
            else if(str.contains("siblings")){
                String[] s = str.split(" ");
                int x=Integer.parseInt(s[0]);
                int y=Integer.parseInt(s[2]);
                res=map.get(x)/2==map.get(y)/2?"T":"F";
            }
            else if(str.contains("parent")){
                String[] s = str.split(" ");
                int x=Integer.parseInt(s[0]);
                int y=Integer.parseInt(s[5]);
                res=map.get(y)/2==map.get(x)?"T":"F";
            }
            else if(str.contains("child")){
                String[] s = str.split(" ");
                int x=Integer.parseInt(s[0]);
                int y=Integer.parseInt(s[5]);
                res=map.get(x)/2==map.get(y)?"T":"F";
            }

            System.out.println(res);
        }

    }
}
