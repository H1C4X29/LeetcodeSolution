package solution.hot100.twoPointer;

/**
 * 42. 接雨水

 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。

 */
public class Solution42 {
    public int trapPrefix(int[] height) {
        int ans = 0;
        int n = height.length;

        int[] preSum = new int[n];
        preSum[0] = height[0];

        int[] sufSum = new int[n];
        sufSum[n-1] =  height[n-1];

        for (int i=1;i<n;i++){
            preSum[i] = Math.max(preSum[i-1],height[i]);
            sufSum[n-1-i] =  Math.max(sufSum[n-i],height[n-1-i]);
        }

        for(int i=0;i<n;i++){
            ans += Math.min(preSum[i],sufSum[i]) - height[i];
        }

        return ans;
    }

    public int trapDoublePointer(int[] height) {
        int ans = 0;
        int n = height.length;

        int left = 0, right = n - 1;
        int preMax = 0, sufMax = 0;
        while(left <=right) {
            preMax = Math.max(preMax, height[left]);
            sufMax = Math.max(sufMax, height[right]);

            if (preMax < sufMax) {
                ans += preMax - height[left];
                left++;
            } else {
                ans += sufMax - height[right];
                right--;
            }
        }
        return ans;
    }
}
