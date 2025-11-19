package solution.slidingWindow;

public class Solutionh3258 {
    /**
     * 3258. 统计满足 K 约束的子字符串数量 I

     * 给你一个 二进制 字符串 s 和一个整数 k。
     *
     * 如果一个 二进制字符串 满足以下任一条件，则认为该字符串满足 k 约束：
     *
     * 字符串中 0 的数量最多为 k。
     * 字符串中 1 的数量最多为 k。
     * 返回一个整数，表示 s 的所有满足 k 约束 的子字符串的数量。
     */
    public int countKConstraintSubstrings(String S, int k) {
        char[] s = S.toCharArray();
        int[] cnt = new int[2];
        int ans=0,left=0;

        for (int right=0;right<s.length;right++){
            cnt[s[right]-'0']++;

            while (cnt[0] >k && cnt[1] >k) {
                cnt[(int)s[left++]-'0']--;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}
