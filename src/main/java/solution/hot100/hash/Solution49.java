package solution.hot100.hash;

import java.util.*;

/**

 49. 字母异位词分组

 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。

 */
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if (map.get(s)==null){
                map.put(s,new ArrayList<String>());
            }
            map.get(s).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
