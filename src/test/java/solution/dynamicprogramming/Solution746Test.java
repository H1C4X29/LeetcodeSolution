package solution.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;
import solution.slidingwindow.Solution209;

public class Solution746Test {

    @Test
    public void Test(){
        Solution746 solution = new Solution746();

        Assert.assertEquals(6,solution.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
        Assert.assertEquals(15,solution.minCostClimbingStairs(new int[]{10,15,20}));
    }
}
