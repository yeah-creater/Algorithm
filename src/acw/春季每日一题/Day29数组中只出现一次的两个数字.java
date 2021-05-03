package acw.春季每日一题;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: yeah
 */
class Solution8 {
    public int[] findNumsAppearOnce(int[] nums) {
        int[] res = new int[2];
        int idx = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.merge(val, 1, Integer::sum);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1)
                res[idx++] = key;
        }
        return res;
    }
}

public class Day29数组中只出现一次的两个数字 {
}
