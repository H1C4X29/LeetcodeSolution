package solution.slidingWindow;

public class Solution713 {
    /**
     *
     713. 乘积小于 K 的子数组

     给你一个整数数组 nums 和一个整数 k ，请你返回子数组内所有元素的乘积严格小于 k 的连续子数组的数目。
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1){
            return 0;
        }

        int ans=0,tmp=1,left=0;

        for (int right=0;right<nums.length;right++){
            tmp *= nums[right];

            while( tmp >= k){
                tmp /= nums[left++];
            }
            ans += right - left + 1;
        }
        return ans;

    }
}
