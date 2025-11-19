package solution.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class Solution713Test {
    @Test
    public void Test(){
        Solution713 solution = new Solution713();

        Assert.assertEquals(8,solution.numSubarrayProductLessThanK(new int[]{10,5,2,6},100));
        Assert.assertEquals(0,solution.numSubarrayProductLessThanK(new int[]{1,2,3},0));
    }
}
