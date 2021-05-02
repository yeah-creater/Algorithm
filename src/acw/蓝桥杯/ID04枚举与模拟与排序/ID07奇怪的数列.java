package acw.蓝桥杯.ID04枚举与模拟与排序;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/12 - 12:16
 */
public class ID07奇怪的数列 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(in.next());
        StringBuilder tmp=new StringBuilder(sb);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            sb=tmp;
            tmp=new StringBuilder("");
            for(int j=0;j<sb.length();){
                int cnt=j+1;
                for(;cnt<sb.length();cnt++){
                    if(sb.charAt(j)!=sb.charAt(cnt))
                        break;
                }
                tmp.append(cnt-j+""+sb.charAt(j));
                j+=cnt-j;
            }
        }
        sb=tmp;
        System.out.println(sb);
    }

}
