package acw.算法基础课.ID04数学知识;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Yeah
 * @date 2021/3/28 - 9:56
 */
public class ID01_4质因子 {
    static TreeMap<Integer,Integer> map=new TreeMap<>();
    static void divide(int n){
        for(int i=2;i<=n/i;i++){
            if(n%i==0){
                int res=0;
                while (n%i==0){
                    res++;
                    n/=i;
                }
                map.put(i,res);
            }
        }
        if(n>1) map.put(n,1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==1){
            System.out.print("1=1");
            return;
        }
        divide(n);
        System.out.print(n+"=");
        Integer first = map.firstKey();
        if(map.get(first)==1) System.out.print(first);
        else System.out.print(first+"^"+map.get(first));
        map.pollFirstEntry();
        Set<Integer> set = map.keySet();
        for(int i:set){
            if(map.get(i)==1) System.out.print("*"+i);
            else System.out.print("*"+i+"^"+map.get(i));
        }
    }
}
