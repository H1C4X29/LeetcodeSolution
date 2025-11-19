package solution.hot100.array;

/**
 * 238. 除自身以外数组的乘积

 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。

 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。

 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
public class Solution238 {
    /**
     * 前缀和优化版本
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans = 1;
        int[] suf = new int[n];
        suf[n-1] = 1;
        for(int i = n-2;i>=0;i--){
            suf[i] = suf[i+1] * nums[i+1];
        }

        for(int i=0;i<n;i++){
            suf[i] *= ans;
            ans *= nums[i];
        }
        return suf;
    }
}
