package acwing.蓝桥杯._10届蓝桥杯国赛;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author: yeah
 */
public class E {
    static int res;
    static int ok;
    static boolean []isOk=new boolean[61];
    static long qmi(long a,long b){
        long res=1;
        while (b>0){
            if((b&1)==1){
                res=res*a;
            }
            a=a*a;
            b>>=1;
        }
        return res;
    }
    static void check(int x){
        int cnt=0;
        for(int i=1;i<=x/i;i++){
            if(x%i==0) {
                cnt++;
                if(x/i!=i){
                    cnt++;
                }
            }
        }

        if(cnt<=60) {
            if (!isOk[cnt]) {
                System.out.println(x + ":" + cnt);
                isOk[cnt] = true;
                res += x;
                ok++;
            }
        }
    }

    public static void main(String[] args) {
//        check(805306368);
//        for(int i=1;ok<51;i++){
//            check(i);
//        }
//        for(int i=1;i<=60;i++){
//            if(!isOk[i]){
//                System.out.println(i);
//            }
//        }
//
//        System.out.println(res);
        System.out.println(qmi(2, 58)
                +qmi(2,52)+qmi(2,46)+qmi(2,42)
        +qmi(2,40)+qmi(2,36)+qmi(2,30)+qmi(2,28)+21358481+805306368);

    }
}
