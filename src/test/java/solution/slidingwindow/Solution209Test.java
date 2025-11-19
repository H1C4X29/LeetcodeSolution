package solution.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class Solution209Test {
    @Test
    public void Test(){
        Solution209 solution = new Solution209();

        Assert.assertEquals(2,solution.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
        Assert.assertEquals(1,solution.minSubArrayLen(4,new int[]{1,4,4}));
        Assert.assertEquals(0,solution.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));
    }
}
