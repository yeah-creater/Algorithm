package acwing.寒假每日一题_已完结;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/2 - 11:47
 */
public class Day12十三号星期五 {
    static int[]res=new int[10];
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd");
        Date date = sdf.parse("1900-01-13");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int end=1900+n;
        while (cal.get(Calendar.YEAR)<end){
            //周日是1 周六是7
            int i = cal.get(Calendar.DAY_OF_WEEK);
            res[i]++;
            cal.add(Calendar.MONTH,1);
        }
        System.out.print(res[7]+" ");
        for(int i=1;i<7;i++)
            System.out.print(res[i]+" ");

    }
}
