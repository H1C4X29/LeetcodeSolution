package solution.hot100.subString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**

 * 438. 找到字符串中所有字母异位词

 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 */

public class Solution438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] cntP = new int[26];
        int[] cnt = new int[26];
        for (char c: p.toCharArray()){
            cntP[c - 'a']++;
        }
        for(int right=0;right<s.length();right++){
            cnt[s.charAt(right)-'a']++;
            int left = right - p.length() + 1;
            if (left < 0){
                continue;
            }
            if(Arrays.equals(cntP,cnt)){
                ans.add(left);
            }
            cnt[s.charAt(left)-'a']--;
        }
        return ans;
    }

}
