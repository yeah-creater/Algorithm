package leetcode.每日一题;

import java.util.*;

/**
 * @author: yeah
 */
class Solution3 {
    public List<String> topKFrequent(String[] words, int k) {
        ArrayList<String> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            if (!o1.getValue().equals(o2.getValue())) {
                return o2.getValue() - o1.getValue();
            }
            return o1.getKey().compareTo(o2.getKey());
        });
        for (int i = 0; i < k; i++) {
            ans.add(list.get(i).getKey());
        }
        return ans;

    }
}
public class ID692前K个高频单词 {
}
