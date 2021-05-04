package acw.春季每日一题_已完结;

/**
 * @purpose:
 */
class Solution {
    public boolean searchArray(int[][] array, int target) {
        if(array.length==0) return false;
        int i=0,j=array[0].length-1;
        while (i<array.length&&j>=0){
            int x=array[i][j];
            if(x==target) return true;
            else if(x<target) i++;
            else j--;
        }
        return false;

    }
}
public class Day12二维数组中的查找 {

}
