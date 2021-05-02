package acm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/17 - 12:35
 * @intention:
 */
public class ID1201 {
    public static void main(String[] args) throws Exception{
        Scanner in =new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String str=in.next();
            Date date = sdf.parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DATE);
            if(day==29){
                System.out.println(-1);
                continue;
            }
            calendar.add(Calendar.YEAR,18);
            Date time = calendar.getTime();
            System.out.println((time.getTime()-date.getTime())/86400000);

        }
    }
}
