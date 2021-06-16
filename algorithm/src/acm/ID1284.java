package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/20 - 13:46
 */
public class ID1284 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()) {
            long cnt=0;
            int n = in.nextInt();
            for (int i = 0; i <= n/3; i++) {
                //用完了3以后剩余的
                int left=n-3*i;
                //n个硬币换成1或2  2的硬币个数可以是0~n/2
                cnt+=left/2+1;
            }
            System.out.println(cnt);
        }
    }
}
