package codeforces.EducationalCodeforcesRound110;

import java.util.Scanner;

/**
 * @author: yeah
 */
public class A {
    static int t;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        while (t-->0){
            int s1=in.nextInt();
            int s2=in.nextInt();
            int s3=in.nextInt();
            int s4=in.nextInt();
            int max1=Math.max(s1,s2);
            int max2=Math.max(s3,s4);
            if((max1>s3||max1>s4)&&(max2>s1||max2>s2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
