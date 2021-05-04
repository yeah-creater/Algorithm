package acwing.寒假每日一题_已完结;

/**
 * @author Yeah
 * @date 2021/2/23 - 13:16
 *
 * 其他进制转为十进制->位权展开(不太好) 用秦九韶算法
 * 或者用Java的Integer.parseInt(s,b) 把b进制的a变为十进制
 */
public class Day05S {
    static int get(char ch){
        if(ch>='0'&&ch<='9')
            return Integer.parseInt(ch+"");
        return ch-'a'+10;
    }
    //其他进制转为十进制  (有字母传入小写字母)
    static int base10(String val,int radix){
        int base10=0;
        for(int i=0;i<val.length();i++){
            base10=base10*radix+ get(val.charAt(i));
        }
        return base10;
    }
    public static void main(String[] args) {
        System.out.println(base10("a",16));
    }
}
