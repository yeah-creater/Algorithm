package acw.春季每日一题_已完结;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: yeah
 */
class Solution6 {
    public List<Integer> getLeastNumbers_Solution(int [] input, int k) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;
    }
}
public class Day28最小的k个数 {
}
