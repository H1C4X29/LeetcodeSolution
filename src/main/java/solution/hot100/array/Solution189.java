package solution.hot100.array;

/**
 * 189. 轮转数组

 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。

 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    private void reverse(int[] nums,int i,int j){
        while(i < j){
            int tmp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = tmp;
        }
    }
}
