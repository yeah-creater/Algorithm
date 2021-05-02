import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/13 - 16:54
 * @intention:ok
 */
 public class ID1000 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = a + b;
            System.out.println(c);
        }
        in.close();
    }
}
