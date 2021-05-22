package leetcode.每日一题;

/**
 * @author: yeah
 * 博弈论
 */
class Solution5 {
    public boolean xorGame(int[] nums) {
        int n = nums.length;
        //偶数先手必赢  偶数 总会回到 2个偶数 两个偶数 00  05  44 34 都是先手赢
        if (n % 2 == 0) return true;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= nums[i];
        }
        return res == 0;
    }
}

public class ID810黑板异或游戏 {

}
