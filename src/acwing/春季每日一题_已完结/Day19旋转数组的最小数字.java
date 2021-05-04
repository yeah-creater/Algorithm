package acwing.春季每日一题_已完结;

/**
 * @author:
 */

public class Day19旋转数组的最小数字 {
    public int findMin(int[] nums) {
        if(nums.length==0) return -1;
        int key=nums[0];
        //找到第一个小于首位的数
        for(int i=1;i<nums.length;i++)
            if(nums[i]<key)
                return nums[i];
        return key;
    }
}
