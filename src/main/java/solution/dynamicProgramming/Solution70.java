package solution.dynamicProgramming;

public class Solution70 {
    /**
     *

     70. 爬楼梯

     假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

     每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     */
    public int climbStairs(int n) {
        int[] ans = new int[50];
        ans[0] = 1;
        ans[1] = 1;
        for (int i=2;i<=n;i++){
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }


    public int climbStairs1(int n) {
        /**
         * 空间优化版本
         */
        int pre = 0;
        int cur = 1;
        while(n > 0 ){
            int tmp = pre + cur;
            pre = cur;
            cur = tmp;
            n--;
        }

        return cur;
    }
}
