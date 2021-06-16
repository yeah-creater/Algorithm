package acm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/16 - 10:41
 * @intention:ok
 */
public class ID2000 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            String s=in.next();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            System.out.print(chars[0]);
            for(int i=1;i<chars.length;i++){
                System.out.print(" "+chars[i]);
            }
            System.out.println();
        }
    }
}
