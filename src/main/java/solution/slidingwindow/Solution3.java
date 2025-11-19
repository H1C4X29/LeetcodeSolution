package solution.slidingwindow;

import java.util.HashMap;

public class Solution3 {
    /**
     *
     3. 无重复字符的最长子串

     给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
     */
    public int lengthOfLongestSubstring(String S) {
        char[] s = S.toCharArray();
        int ans = 0, left = 0, right=0,tmp = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(right < s.length){
            map.put(s[right],map.getOrDefault(s[right],0)+1);

            while (map.getOrDefault(s[right],0) > 1){
                if (map.getOrDefault(s[left],0)>0){
                    map.put(s[left],map.get(s[left])-1);
                }
                else{
                    map.remove(s[left]);
                }
                left++;
            }

            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
