package solution.hot100.twoPointer;

/**
 * 283. 移动零

 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length,left = 0,right = 0;
        while(right < n){
            if(nums[right] != 0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums,int left,int right){
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
