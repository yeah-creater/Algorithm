package codeforces.EducationalCodeforcesRound109;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int t;
    static int gcd(int a,int b){
        return b==0?a:(gcd(b,a%b));
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        while (t-->0){
            int k=in.nextInt();
            int m=100-k;
            int gcd = gcd(k, m);
            System.out.println(k/gcd+m/gcd);
        }
    }
}
