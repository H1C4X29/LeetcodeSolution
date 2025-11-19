package solution.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class Solution1493Test {

    @Test
    public void Test(){

        Solution1493 solution = new Solution1493();

        Assert.assertEquals(3,solution.longestSubarray(new int[]{1,1,0,1}));
        Assert.assertEquals(5,solution.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
        Assert.assertEquals(2,solution.longestSubarray(new int[]{1,1,1}));
    }
}
