package acwing.杂题;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author: yeah
 */
class Complex {
    int x;
    int y;

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "+i" + y;
    }
}

public class ID3539复数集合 {
    static TreeSet<Complex> t = new TreeSet<>(new Comparator<Complex>() {
        @Override
        public int compare(Complex o1, Complex o2) {
            if (o1.x * o1.x + o1.y * o1.y == o2.x * o2.x + o2.y * o2.y) {
                return o1.y - o2.y >= 0 ? 1 : -1;
            }
            return (o2.x * o2.x + o2.y * o2.y - o1.x * o1.x - o1.y * o1.y);
        }
    });
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n-- > 0) {
            String op = in.next();
            if (op.equals("Pop")) {
                if (t.size() == 0) {
                    System.out.println("empty");
                } else {
                    System.out.println(t.pollFirst());
                    System.out.println("SIZE = " + t.size());
                }
            } else {
                String val = in.next();
                int end = val.indexOf("+");
                t.add(new Complex(Integer.parseInt(val.substring(0, end)),
                        Integer.parseInt(val.substring(end + 2))));
                System.out.println("SIZE = " + t.size());
            }
        }
    }

}
