package solution.dailyQuestion;

/**
 * 1930. 长度为 3 的不同回文子序列

 * 给你一个字符串 s ，返回 s 中 长度为 3 的不同回文子序列 的个数。
 *
 * 即便存在多种方法来构建相同的子序列，但相同的子序列只计数一次。
 *
 * 回文 是正着读和反着读一样的字符串。
 *
 * 子序列 是由原字符串删除其中部分字符（也可以不删除）且不改变剩余字符之间相对顺序形成的一个新字符串。
 *
 * 例如，"ace" 是 "abcde" 的一个子序列。
 */
public class Solution1930 {
    /**
     * 因为长度限制为3，所以对于每一个字母找到相同的内容对中间位置的字母进行去重统计即可
     * @param s
     * @return
     */
    public int countPalindromicSubsequence(String s){
        int ans = 0;

        // 历遍每个字母
        for (char c = 'a';c <= 'z';c++){
            int left = s.indexOf(c);
            if (c < 0){     //没有对应字母
                continue;
            }
            int right = s.lastIndexOf(c);
            boolean[] has = new boolean[26];    //记录重复字母
            for (int i=left + 1;i < right;i++){
                int k = s.charAt(i) - 'a';
                if (!has[k]){
                    has[k] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
