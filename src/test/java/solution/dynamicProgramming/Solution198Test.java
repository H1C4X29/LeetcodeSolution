package solution.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

public class Solution198Test {
    @Test
    public void Test(){
        Solution198 solution = new Solution198();

        Assert.assertEquals(4,solution.rob(new int[]{1,2,3,1}));
        Assert.assertEquals(12,solution.rob(new int[]{2,7,9,3,1}));
        Assert.assertEquals(4,solution.rob(new int[]{2,1,1,2}));
    }
}
