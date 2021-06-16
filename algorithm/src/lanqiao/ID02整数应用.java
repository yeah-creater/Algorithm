package lanqiao;

import org.junit.Test;

/**
 * @author Yeah
 * @date 2021/2/19 - 12:04
 * @intention:
 */
public class ID02整数应用 {
    int gcd(int a,int b){
        return a==0?b:gcd(b%a,a);
    }
    //第index个素数
    boolean isPrime(int x){
        if(x==1) return false;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;

    }
    int prime(int index){
        int i=0;
        for(int j=2;;j++){
            if(isPrime(j)){
                i++;
                if(i==index){
                    return j;
                }
            }
        }

    }
    @Test
    public void test01(){

    }
}
