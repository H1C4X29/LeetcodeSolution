package solution.hot100.array;

/**
 * 53. 最大子数组和

 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

 * 子数组是数组中的一个连续部分。
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        for (int i=1; i<nums.length; i++){
            nums[i] += Math.max(0,nums[i-1]);
            ans = Math.max(ans,nums[i]);
        }
        return ans;
    }
}
