package acw.春季每日一题_已完结;

/**
 * @author:
 */
public class Day20零到n_1中缺失的数 {
    public int getMissingNumber(int[] nums) {
        int l=0,r=nums.length-1;
        if(r==-1) return 0;
        while(l<r){
            int mid=l+r>>1;
            if(mid!=nums[mid]) r=mid;
            else l=mid+1;
        }
        if(nums[r]==r) r++;
        return r;
    }
}
