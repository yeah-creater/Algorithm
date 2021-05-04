package acwing.春季每日一题_已完结;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:
 */
public class Day21丑数 {
    public int getUglyNumber(int n) {
        List<Integer> ugly=new ArrayList<>();
        ugly.add(1);
        ugly.add(1);//第一项是1
        int i=1,j=1,k=1;
        while (--n>0){
            int t=Math.min(ugly.get(i)*2,Math.min(ugly.get(j)*3,ugly.get(k)*5));
            ugly.add(t);
            if(t==ugly.get(i)*2) i++;
            if(t==ugly.get(j)*3) j++;
            if(t==ugly.get(k)*5) k++;
        }
        return ugly.get(ugly.size()-1);
    }
}
