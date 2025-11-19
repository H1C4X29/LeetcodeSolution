package solution.slidingwindow;

public class Solution209 {
    /**
     *

     209. 长度最小的子数组

     给定一个含有 n 个正整数的数组和一个正整数 target 。

     找出该数组中满足其总和大于等于 target 的长度最小的 子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
     */
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE,left = 0;
        int tmp = 0;

        for (int right = 0;right<nums.length;right++){
            tmp += nums[right];

            if (tmp < target){
                continue;
            }
            ans = Math.min(ans,right - left + 1);
            while(tmp >= target){
                ans = Math.min(ans,right - left + 1);
                tmp -= nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
