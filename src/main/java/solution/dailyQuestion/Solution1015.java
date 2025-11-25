package solution.dailyQuestion;

/**
 * 1015. 可被 K 整除的最小整数

 * 给定正整数 k ，你需要找出可以被 k 整除的、仅包含数字 1 的最 小 正整数 n 的长度。
 *
 * 返回 n 的长度。如果不存在这样的 n ，就返回-1。
 *
 * 注意： n 可能不符合 64 位带符号整数。
 */
public class Solution1015 {
    public int smallestRepunitDivByK(int k) {
        if (k == 2 || k == 5){
            return -1;
        }
        int x = 1 % k;
        for (int i=1;i<=k;i++){
            if (x == 0){
                return i;
            }
            x = (x * 10 + 1) % k;
        }
        return -1;
    }
}
