package acwing.夏季每日一题;

import java.util.Scanner;

/**
 * @author: yeah
 * 虽然 有点复杂，但是完全独立写的可还行
 */
public class ID102的幂次方 {
    static int getExp(int x) {
        if (x == 1) return 0;
        int res = 2;
        for (int i = 1; ; i++) {
            if (res == x) return i;
            res *= 2;
        }
    }

    static int highBit(int x) {
        //返回高位二进制1出现的位置
        int res = 0;
        while (x > 0) {
            res = x;
            x -= x & -x;
        }
        return res;
    }

    static StringBuilder log(int x) {
        StringBuilder ans = new StringBuilder("");
        while (x > 0) {
            int exp = getExp(highBit(x));
            if (exp == 2 || exp == 0) {
                ans.append("2(" + exp + ")");
            } else if (exp == 1) {
                ans.append("2");
            } else {
                ans.append("2(" + log(exp) + ")");
            }
            x -= highBit(x);
            ans.append("+");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int x = in.nextInt();
            StringBuilder ans = log(x);
            System.out.println(ans);
        }
    }
}
