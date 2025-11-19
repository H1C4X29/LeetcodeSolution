package solution.dailyQuestion;

import com.sun.crypto.provider.HmacSHA1KeyGenerator;

import java.util.HashSet;
import java.util.Set;

/**
 * 2154. 将找到的值乘以 2

 * 给你一个整数数组 nums ，另给你一个整数 original ，这是需要在 nums 中搜索的第一个数字。

 * 接下来，你需要按下述步骤操作：

 * 如果在 nums 中找到 original ，将 original 乘以 2 ，得到新 original（即，令 original = 2 * original）。
 * 否则，停止这一过程。
 * 只要能在数组中找到新 original ，就对新 original 继续 重复 这一过程。
 * 返回 original 的 最终 值。
 *
 */
public class Solution2154 {
    //简单方法
    public int findFinalValueEasy(int[] nums, int original) {
        Set<Integer> st = new HashSet<>();
        for (int num:nums){
            int k = num / original;
            int r = num % original;
            if (r == 0 && (k&(k-1)) == 0){
                st.add(num);
            }
        }

        while (st.contains(original)){
            original *= 2;
        }
        return original;
    }

    // 位运算版本
    public int findFinalValue(int[] nums, int original) {
        int mask = 0;
        for (int num:nums){
            int k = num / original;
            int r = num % original;
            if (r == 0 && (k&(k-1)) == 0){
                mask |= k;
            }
        }
        return original * ((mask + 1) & ~mask);
    }
}
