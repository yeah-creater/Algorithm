package acwing.蓝桥杯.ID02二分与前缀和;


import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/6 - 16:08
 * 并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法。
 *  * 即字典序最小的一种
 */
class Pair{
   int c;
   int d;

    public Pair(int c, int d) {
        this.c = c;
        this.d = d;
    }
}
public class ID02四平方和 {
    static HashMap<Integer,Pair> hash=new HashMap<>();
    static int n;
    static void init(){
        //先枚举c和d所有可能的结果
        for(int c=0;c*c<=n;c++){
            for(int d=c;c*c+d*d<=n;d++){
                int sum=c*c+d*d;
                if(!hash.containsKey(sum)){
                    hash.put(sum,new Pair(c,d));
                }
            }
        }
        for(int a=0;a*a<=n;a++){
            for(int b=a;b*b+a*a<=n;b++){
                int sum=n-a*a-b*b;
                if(hash.containsKey(sum)){
                    Pair pair = hash.get(sum);
                    System.out.println(a+" "+b+" "+pair.c+" "+pair.d);
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        init();
    }
}
