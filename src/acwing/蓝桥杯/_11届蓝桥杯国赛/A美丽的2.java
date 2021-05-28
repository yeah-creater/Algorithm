package acwing.蓝桥杯._11届蓝桥杯国赛;

/**
 * @author: yeah
 */
public class A美丽的2 {
    static boolean check(int x){
        while (x>0){
            if(x%10==2) return true;
            x/=10;
        }
        return false;
    }
    static int solve(){
        int res=0;
        for(int i=1;i<=2020;i++){
            if(check(i)){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}
