package acwing.夏季每日一题;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID06星期几 {
    static HashMap<String,Integer> map=new HashMap<>();
    public static void main(String[] args) {
        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);

        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String date=in.nextLine();
            String[] s = date.split(" ");
            LocalDate l = LocalDate.of(Integer.parseInt(s[2]), map.get(s[1]), Integer.parseInt(s[0]));
            String name = l.getDayOfWeek().name();
            System.out.println(name.charAt(0)+name.substring(1).toLowerCase());
        }
    }
}
