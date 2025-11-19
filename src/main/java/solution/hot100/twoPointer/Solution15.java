package solution.hot100.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution15 {

    public static void main(String[] args) {
        System.out.println(new Solution15().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<nums.length - 2;i++){
            int x = nums[i];
            if (i>0 && nums[i] == nums[i-1]) continue;
            if (x + nums[i+1] + nums[i+2] > 0) break;
            if (x + nums[nums.length-1] + nums[nums.length - 2] < 0) continue;

            int j = i + 1;
            int k = nums.length - 1;
            while(j<k){
                int sum = x + nums[j] + nums[k];
                if (sum == 0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    for(j++ ; j<k && nums[j]==nums[j-1];j++);
                    for(k-- ; j<k && nums[k]==nums[k+1];k--);
                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return res;
    }
}
