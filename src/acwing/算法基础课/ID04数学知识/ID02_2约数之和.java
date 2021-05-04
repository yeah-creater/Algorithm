package acwing.算法基础课.ID04数学知识;

import java.util.*;

/**
 * @author Yeah
 * @date 2021/3/3 - 21:02
 */
public class ID02_2约数之和 {
    static final int N=1000000007;
    static HashMap<Integer,Integer> hm=new HashMap<>();
    static void divide(int n){
        for(int i=2;i<=n/i;i++){
            if(n%i==0){
                while (n%i==0){
                    n/=i;
                    hm.put(i,hm.getOrDefault(i,0)+1);
                }
            }
        }
        if(n>1){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int x=in.nextInt();
            divide(x);
        }
        Set<Map.Entry<Integer, Integer>> entries = hm.entrySet();
        Set<Integer> keys= hm.keySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        long res=1;
        while (iterator.hasNext()){
            Integer p = iterator.next().getKey();
            Integer a = hm.get(p);
            long t=1;
            while (a-->0) t=(t*p+1)%N;
            res=res*t%N;
        }
        System.out.println(res);
    }
}
