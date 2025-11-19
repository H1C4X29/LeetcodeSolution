package solution.slidingWindow;

import org.junit.Test;
import org.junit.Assert;


public class Solution1343Test {

    @Test
    public void Test(){
        Solution1343 solution = new Solution1343();

        Assert.assertEquals(3,solution.numOfSubarrays(new int[]{2,2,2,2,5,5,5,8},3,4));
        Assert.assertEquals(6,solution.numOfSubarrays(new int[]{11,13,17,23,29,31,7,5,2,3},3,5));
    }
}
