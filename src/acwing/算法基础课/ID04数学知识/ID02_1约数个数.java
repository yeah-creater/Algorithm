package acwing.算法基础课.ID04数学知识;

import java.util.*;

/**
 * @author Yeah
 * @date 2021/3/3 - 20:09
 * 约数个数为 各个质因数 （指数+1）*（指数+1）...
 */
public class ID02_1约数个数 {
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
        Collection<Integer> values = hm.values();
        long res=1;
        for(int value:values){
            res=(res*(value+1))%N;
        }
        System.out.println(res);
    }
}
