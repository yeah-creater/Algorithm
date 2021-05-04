package acw.春季每日一题_已完结;

/**
 * @purpose: 了解与熟悉运用位运算
 * 思路：利用全加器加法 但是是不进位加法
 * sum=num1^num2  不进位的结果
 * carry=num1&num2 进位的结果
 */
public class Day05不用加减乘除做加法 {
    public int add(int num1, int num2) {
        while (num2 != 0) {
            int sum = num1 ^ num2;
            int carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
