package leetcode.每日一题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: yeah
 */
class Solution2{
    public int kthLargestValue(int[][] matrix, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int[][] sum = new int[1010][1010];
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[i-1].length; j++) {
                sum[i][j] = sum[i - 1][j] ^ sum[i][j - 1] ^ sum[i - 1][j - 1] ^ matrix[i-1][j-1];
                list.add(sum[i][j]);
            }
        }
        Collections.sort(list, Comparator.comparingInt(Integer::intValue).reversed());
        return list.get(k-1);
    }
}
public class ID1738找出第K大的异或坐标值 {
}
