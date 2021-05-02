package acm;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/18 - 10:31
 * @intention:
 */
public class ID1865 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        BigInteger []bigIntegers=new BigInteger[201];
        bigIntegers[1]= BigInteger.valueOf(1);
        bigIntegers[2]= BigInteger.valueOf(2);
        for(int i=3;i<=200;i++){
            bigIntegers[i]=bigIntegers[i-1].add(bigIntegers[i-2]);
        }
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String s=in.next();
            int index=s.length();
            System.out.println(bigIntegers[index]);
        }
    }
}
