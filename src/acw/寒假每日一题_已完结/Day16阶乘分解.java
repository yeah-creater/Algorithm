package acw.寒假每日一题_已完结;



import java.util.*;

/**
 * @author Yeah
 * @date 2021/3/4 - 16:16
 */
public class Day16阶乘分解 {
    static TreeMap<Integer,Integer> map=new TreeMap<>();
    static void divide(int n){
        for(int i=2;i<=n/i;i++){
            while (n%i==0){
                n/=i;
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        if(n>1) map.put(n,map.getOrDefault(n,0)+1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=2;i<=n;i++){
            divide(i);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next().getKey();
            Integer value = map.get(key);
            System.out.println(key+" "+value);
        }

    }
}
