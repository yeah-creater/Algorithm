package acm;



import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/17 - 11:28
 * @intention:
 */
public class ID1008 {
    public static void main(String[] args)  {
        Scanner in =new Scanner(System.in);
        int n;
        while((n=in.nextInt())!=0){
            ArrayList<Integer> requests=new ArrayList<>();
            for(int i=0;i<n;i++){
                int val=in.nextInt();
                requests.add(val);
            }
            int stop=0,time=0;
            for(int i=0;i<requests.size();i++) {
                int floor=requests.get(i);
                if (floor > stop) {
                    time += 6 * (floor - stop) + 5;
                } else {
                    time += 4 * (stop - floor) + 5;
                }
                stop=floor;
            }
            System.out.println(time);
        }
    }
}
