package acw.杂题;

import sun.plugin.javascript.navig.Link;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Yeah
 * @date 2021/3/23 - 21:00
 * 思路：将每种月饼的平均利润排序
 */
public class ID03月饼 {
    static int kind, n;
    static TreeMap<Double, Integer> map = new TreeMap<>(new Comparator<Double>() {
        @Override
        public int compare(Double o1, Double o2) {
            return o2.compareTo(o1);
        }
    });//平均利润及商品的数量
    static int []num=new int[1010];
    static double res;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        kind = in.nextInt();
        n = in.nextInt();
        for(int i=0;i<kind;i++) num[i]=in.nextInt();
        for(int i=0;i<kind;i++){
            int rate=in.nextInt();
            map.put((double) (rate)/num[i],num[i]);

        }

        Set<Double> set = map.keySet();
        for(double d:set){
            if(n>=map.get(d)){
                res+=d*map.get(d);
                n-=map.get(d);
            }
            else{
                res+=d*n;
                break;
            }
        }
        System.out.printf("%.2f",res);


    }
}
