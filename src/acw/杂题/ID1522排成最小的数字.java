package acw.杂题;

import javax.sound.midi.Soundbank;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @purpose:
 */
public class ID1522排成最小的数字 {
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            list.add(in.next());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                StringBuilder sb1=new StringBuilder(s1);
                sb1.append(s2);
                StringBuilder sb2=new StringBuilder(s2);
                sb2.append(s1);
                return sb1.toString().compareTo(sb2.toString());
            }
        });
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++)
            sb.append(list.get(i));
        String s = sb.toString();
        while (s.startsWith("0"))
            s=s.substring(1,s.length());
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        br.write(s);
        br.flush();
    }
}
