package solution.hot100.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
347. 前 K 个高频元素

给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 */
public class Solution347 {
    /**
     * Algorithm: 桶排序
     * Time Complexity:
     * Space Complexity:
     *
     * Description:
     *
     */

    public int[] topKFrequent(int[] nums, int k) {
        //第一步：统计每个数字出现的次数，即频率
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        //第二步：找到最高频次数，确定桶的个数
        int maxCnt = 0;
        for (int cnt:map.values()){
            maxCnt = Math.max(maxCnt,cnt);
        }


        //第三步:创建排序桶，索引为频率，值为所有该频率的数字
        List<Integer>[] buckets = new List[maxCnt+1];
        for (int i=0; i<buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
        //将数字添加进桶里面
        for (Map.Entry<Integer, Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            buckets[value].add(key);
        }

        //第四步:倒序历遍桶
        int[] ans = new int[k];
        int idx = 0;
        for (int i = buckets.length-1; i>=0; i--){
            for (int num: buckets[i]){
                ans[idx++] = num;
            }
            if (idx == k) break;
        }
        return ans;
    }
}
