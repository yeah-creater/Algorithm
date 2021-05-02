package acw.蓝桥杯._10届蓝桥杯国赛;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID03调手表 {
    static int []d=new int[100010];
    static boolean []used=new boolean[100010];
    static int n,k;
    static void bfs(){
        Deque<Integer> q=new ArrayDeque<>();
        q.addLast(0);
        used[0]=true;
        while (!q.isEmpty()){
            Integer t = q.pollFirst();
            if(!used[(t+1)%n]){
                d[(t+1)%n]=d[t]+1;
                used[(t+1)%n]=true;
                q.addLast((t+1)%n);
            }
            if(!used[(t+k)%n]){
                d[(t+k)%n]=d[t]+1;
                used[(t+k)%n]=true;
                q.addLast((t+k)%n);
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(d[i]>max)
                max=d[i];
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        k=in.nextInt();
        bfs();
    }
}
