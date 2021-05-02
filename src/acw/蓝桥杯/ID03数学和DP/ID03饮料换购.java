package acw.蓝桥杯.ID03数学和DP;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/7 - 15:26
 * a/b 上取整 =  a+b-1/b 下取整
 */
public class ID03饮料换购 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int cnt=n;
        //现在可用n个空瓶
        while (n>=3){//因为不允许暂借或赊账)
            cnt+=n/3;
            n=n%3+n/3;
        }
        System.out.println(cnt);
    }
}
