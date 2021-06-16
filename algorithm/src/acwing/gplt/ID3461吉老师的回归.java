package acwing.gplt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3461吉老师的回归 {
    static int n,m,cnt;
    static String[]p=new String[40];
    static List<String> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        in.nextLine();
        for(int i=1;i<=n;i++){
            p[i]=in.nextLine();
            if(!(p[i].contains("easy")||p[i].contains("qiandao"))){
                list.add(p[i]);
                cnt++;
            }
        }
        if(m>=cnt) System.out.println("Wo AK le");
        else System.out.println(list.get(m));

    }
}
