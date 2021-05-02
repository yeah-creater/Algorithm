package acw.蓝桥杯.ID04枚举与模拟与排序;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/9 - 20:31
 */
public class ID04回文日期 {
    static boolean check(int year,int month,int day){
        int y=0;
        while (year>0){
            y=y*10+year%10;
            year/=10;
        }
        return y == month * 100 + day;
    }
    public static void main(String[] args) throws Exception{
        long res=0;
        Scanner in=new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String begin=in.next();
        String end=in.next();
        Date d1 = sdf.parse(begin);
        Date d2 = sdf.parse(end);
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(d1);
        cal2.setTime(d2);cal2.add(Calendar.DATE,1);
        while (cal1.before(cal2)){
            int year = cal1.get(Calendar.YEAR);
            int month = cal1.get(Calendar.MONTH)+1;
            int day = cal1.get(Calendar.DATE);
            if (check(year,month,day)) res++;
            cal1.add(Calendar.DATE,1);
        }
        System.out.println(res);

    }
}
