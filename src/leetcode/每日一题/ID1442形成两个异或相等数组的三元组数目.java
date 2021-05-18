package leetcode.每日一题;

/**
 * @author: yeah
 */
class Solution {
    public int countTriplets(int[] arr) {
        int [][]sum=new int[305][305];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==j) sum[i][j]=arr[i];
                else sum[i][j]=sum[i][j-1]^arr[j];
            }
        }
        int res=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j;k<arr.length;k++){
                    if(sum[i][j-1]==sum[j][k]) {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
public class ID1442形成两个异或相等数组的三元组数目 {

}
