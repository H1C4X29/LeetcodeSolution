package solution.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class Solution1652Test {
    @Test
    public void Test(){
        Solution1652 solution = new Solution1652();

        Assert.assertArrayEquals(new int[]{12,10,16,13},solution.decrypt(new int[]{5,7,1,4},3));
        Assert.assertArrayEquals(new int[]{0,0,0,0},solution.decrypt(new int[]{1,2,3,4},0));
        Assert.assertArrayEquals(new int[]{12,5,6,13},solution.decrypt(new int[]{2,4,9,3},-2));
        Assert.assertArrayEquals(new int[]{22,26,22,28,29,22,19,22,18,21,28,19},solution.decrypt(new int[]{10,5,7,7,3,2,10,3,6,9,1,6},-4));

    }
}
