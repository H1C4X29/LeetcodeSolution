package solution.slidingWindow;

public class Solution1493 {
    /**
     *

     1493. 删掉一个元素以后全为 1 的最长子数组

     给你一个二进制数组 nums ，你需要从中删掉一个元素。

     请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。

     如果不存在这样的子数组，请返回 0 。
     */
    public int longestSubarray(int[] nums) {
        int ans=0,left=0;
        int cnt = 0;
        for (int right=0;right<nums.length;right++){
            if (nums[right]==0){
                cnt++;
            }
            while (cnt>1){
                if (nums[left++]==0){
                    cnt--;
                }
            }
            ans = Math.max(ans,right-left+1-cnt);

        }
        return cnt == 0 ? ans - 1 : ans;
    }
}
