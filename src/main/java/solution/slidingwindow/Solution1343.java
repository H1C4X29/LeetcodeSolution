package solution.slidingwindow;

public class Solution1343 {
    /**
    *1343. 大小为 K 且平均值大于等于阈值的子数组数目

    给你一个整数数组 arr 和两个整数 k 和 threshold 。

    请你返回长度为 k 且平均值大于等于 threshold 的子数组数目。
    */
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0,total = 0;
        for(int i =0;i<arr.length;i++){
            total += arr[i];

            if (i < k - 1){
                continue;
            }

            if (total >= k * threshold){
                ans += 1;
            }
            total -= arr[i-k+1];
        }
        return ans;
    }
}
