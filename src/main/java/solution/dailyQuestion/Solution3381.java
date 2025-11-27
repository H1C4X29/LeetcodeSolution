package solution.dailyQuestion;

import java.util.Arrays;

/**
 * 3381. 长度可被 K 整除的子数组的最大元素和

 * 给你一个整数数组 nums 和一个整数 k 。

 * 返回 nums 中一个 非空子数组 的 最大 和，要求该子数组的长度可以 被 k 整除。

 */
public class Solution3381 {

    /**
     * 一边历遍一边枚举，空间复杂度O(k)
     * @param nums
     * @param k
     * @return
     */
    public long maxSubarraySum(int[] nums, int k) {
        long[] minS = new long[k];
        Arrays.fill(minS,0,k-1,Long.MAX_VALUE / 2);

        long s = 0;
        long ans = Long.MIN_VALUE;
        for (int j = 0;j<nums.length;j++){
            s += nums[j];
            int i = j % k;
            ans = Math.max(ans,s - minS[i]);
            minS[i] = Math.min(minS[i],s);
        }
        return ans;
    }


    /**
     * 子数组求和用前缀和，枚举右维护左
     * @param nums
     * @param k
     * @return
     */
    public long maxSubarraySum_1(int[] nums, int k) {
        int n = nums.length;
        long[] sum = new long[n+1];
        for (int i =0; i<n;i++){
            sum[i+1] = sum[i] + nums[i];
        }

        long[] minS = new long[k];
        Arrays.fill(minS,Long.MAX_VALUE / 2);

        long ans = Long.MIN_VALUE;
        for (int j=0;j<sum.length;j++){
            int i = j % k;
            ans = Math.max(ans,sum[j]-minS[i]);
            minS[i] = Math.min(minS[i],sum[j]);
        }
        return ans;
    }
}
