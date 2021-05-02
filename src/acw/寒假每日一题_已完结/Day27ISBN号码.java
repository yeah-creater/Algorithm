package acw.寒假每日一题_已完结;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/15 - 11:29
 */
public class Day27ISBN号码 {
    static int getSum(String code){
        String[] str = code.split("-");
        code=str[0]+str[1]+str[2];
        int sum=0;
        for(int i=0;i<code.length();i++)
            sum+=Integer.parseInt(code.charAt(i)+"")*(i+1);
        return sum%11;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String substring = str.substring(0, str.length() - 2);
        int key = getSum(substring);
        String key2=key+"";
        String value=str.charAt(str.length()-1)+"";
        if(key2.equals("10")) key2="X";
        if(key2.equals(value))
            System.out.println("Right");
        else
            System.out.println(substring +"-"+key2);
    }
}
