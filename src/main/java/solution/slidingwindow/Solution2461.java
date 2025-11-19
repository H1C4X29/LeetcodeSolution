package solution.slidingwindow;

import java.util.HashMap;

public class Solution2461 {
    /**
    2461. 长度为 K 子数组中的最大和

    给你一个整数数组 nums 和一个整数 k 。请你从 nums 中满足下述条件的全部子数组中找出最大子数组和：

    子数组的长度是 k，且
    子数组中的所有元素 各不相同 。
    返回满足题面要求的最大子数组和。如果不存在子数组满足这些条件，返回 0 。

    子数组 是数组中一段连续非空的元素序列。

    * */
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0, s = 0;
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (i < k - 1) {
                continue;
            }

            if (map.size() == k) {
                ans = Math.max(ans, s);
            }

            s -= nums[i - k + 1];
            if (map.getOrDefault(nums[i - k + 1], 0) > 1) {
                map.put(nums[i - k + 1], map.getOrDefault(nums[i - k + 1], 0) - 1);
            } else {
                map.remove(nums[i - k + 1]);
            }
        }
        return ans;
    }
}
