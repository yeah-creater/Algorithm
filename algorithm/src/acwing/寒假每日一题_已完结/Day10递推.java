package acwing.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/28 - 16:18
 * 递推题
 * 扩展题95费解的开关
 */
public class Day10递推 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int cnt=0;
        String src1=in.next();
        String des1=in.next();
        char []src=src1.toCharArray();
        char []des=des1.toCharArray();
        for(int i=0;i<src.length-1;i++){
            if(src[i]!=des[i]){
                cnt++;
                if(src[i+1]=='*'){
                    src[i+1]='o';
                }
                else{
                    src[i+1]='*';
                }
            }

        }
        System.out.print(cnt);
    }
}
