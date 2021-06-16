package acwing.finding;

/**
 * @author: yeah
 */
public class Swap {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        //不引入第三方变量交换2个数的值
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
