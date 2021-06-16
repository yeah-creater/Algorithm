package acm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Yeah
 * @date 2021/1/17 - 12:51
 * @intention:
 */
public class ID1106 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()) {
            ArrayList<Integer> arrayList=new ArrayList<>();
            String str = in.next();
            String[] split = str.split("5");
            for (int i = 0; i < split.length; i++) {
                if (!split[i].equals("")) {
                    arrayList.add(Integer.parseInt(split[i]));
                }
            }
            Collections.sort(arrayList);
            System.out.print(arrayList.get(0));
            for(int i=1;i<arrayList.size();i++){
                System.out.print(" "+arrayList.get(i));
            }
            System.out.println();
        }

    }
}
