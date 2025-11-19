package solution.slidingwindow;

import org.junit.Test;
import org.junit.Assert;

public class Solution2461Test {

    @Test
    public void Test(){
        Solution2461 solution = new Solution2461();

        Assert.assertEquals(15L,solution.maximumSubarraySum(new int[]{1,5,4,2,9,9,9},3));
        Assert.assertEquals(0L,solution.maximumSubarraySum(new int[]{4,4,4},3));
    }
}
