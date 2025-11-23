package solution.dailyQuestion;

import java.util.Arrays;

/**
 * 1262. 可被三整除的最大和

 * 给你一个整数数组 nums，请你找出并返回能被三整除的元素 最大和。

 */
public class Solution1262 {

    /**
     * 记忆化搜索 dfs
     * @param nums
     * @return
     */
    public int maxSumDivThree_dfs(int[] nums){
        int n = nums.length;
        int[][] memo = new int[n][3];
        for (int i=0;i<n;i++){
            Arrays.fill(memo[i],-1);
        }
        return dfs(memo,nums,n-1,0);
    }

    private int dfs(int[][] memo,int[] nums, int i,int j){
        if (i < 0) return j ==0 ? 0 : Integer.MIN_VALUE;
        if (memo[i][j] != -1) return memo[i][j];
        return memo[i][j] = Math.max(
                dfs(memo,nums,i-1,j),
                dfs(memo,nums,i-1,(j+nums[i])%3) + nums[i]
        );
    }

    /**
     * 动态规划，每次记录出当前索引下模 0 1 2的最大值
     * @param nums
     * @return
     */
    public int maxSumDivThree_dp(int[] nums){
        int n = nums.length;
        int[][] dp = new int[n+1][3];
        dp[0][0] = 0;
        dp[0][1] = dp[0][2] = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for (int j=0;j<3;j++){
                dp[i+1][j] = Math.max(dp[i][j] , dp[i][(j+nums[i])%3] + nums[i]);
            }
        }
        return dp[n][0];
    }
}
