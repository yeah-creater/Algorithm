package acm;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Yeah
 * @date 2021/1/17 - 14:29
 * @intention:
 */
public class ID1754 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        TreeMap<Integer,Integer> hashMap=new TreeMap<>();
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=1;i<=n;i++){
            int grade=in.nextInt();
            hashMap.put(i,grade);
        }
        for(int i=0;i<m;i++){
            char kind=in.next().charAt(0);
            int index=in.nextInt();
            int grade=in.nextInt();
            if(kind=='U') {
                hashMap.remove(index);
                hashMap.put(index, grade);
            }
            else{
                int max=0;
                for(int j=index;j<=grade;j++){
                    if(hashMap.get(j)>max){
                        max=hashMap.get(j);
                    }
                }
                System.out.println(max);
            }
        }
    }
}
