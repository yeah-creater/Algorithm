package acw.蓝桥杯.ID06双指针BFS与图论;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/12 - 12:43
 */
public class ID01最长子序列 {
    static boolean isSubstring(String p,String sub){
        int i,j;
        for( i=0,j=0;i<p.length()&&j<sub.length();i++){
            if(p.charAt(i)==sub.charAt(j))
                j++;
        }
        return j==sub.length();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String t=in.next();

        for(int i=t.length();i>0;i--){
            if(isSubstring(s,t.substring(0,i))){
                System.out.println(t.substring(0,i).length());
                return;
            }
        }
        System.out.println(0);

    }
}
