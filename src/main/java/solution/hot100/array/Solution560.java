package solution.hot100.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. 和为 K 的子数组

 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。

 * 子数组是数组中元素的连续非空序列。
 */
public class Solution560 {

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int s = 0;
        for (int num:nums){
            s += num;
            ans += map.getOrDefault(s-k,0);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return ans;
    }

}
