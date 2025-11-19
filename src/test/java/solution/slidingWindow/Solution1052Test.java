package solution.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class Solution1052Test {

    @Test
    public void Test(){

        Solution1052 solution = new Solution1052();

        Assert.assertEquals(17,solution.maxSatisfied(new int[]{2,6,6,9},new int[]{0,0,1,1},1));
        Assert.assertEquals(16,solution.maxSatisfied(new int[]{1,0,1,2,1,1,7,5},new int[]{0,1,0,1,0,1,0,1},3));
        Assert.assertEquals(1,solution.maxSatisfied(new int[]{1},new int[]{0},1));
    }
}
