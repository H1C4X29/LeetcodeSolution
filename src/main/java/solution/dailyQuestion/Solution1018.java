package solution.dailyQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * 1018. 可被 5 整除的二进制前缀

 * 给定一个二进制数组 nums ( 索引从0开始 )。
 *
 * 我们将xi 定义为其二进制表示形式为子数组 nums[0..i] (从最高有效位到最低有效位)。
 *
 * 例如，如果 nums =[1,0,1] ，那么 x0 = 1, x1 = 2, 和 x2 = 5。
 * 返回布尔值列表 answer，只有当 xi 可以被 5 整除时，答案 answer[i] 为 true，否则为 fal
 */
public class Solution1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n = nums.length;
        List<Boolean> ans = new ArrayList<>(n);
        int x = 0;
        for (int num:nums){
            x = (2*x + num) %5;         //必须每次对结果取余，否则会发生溢出
            ans.add(x == 0);
        }
        return ans;
    }
}
