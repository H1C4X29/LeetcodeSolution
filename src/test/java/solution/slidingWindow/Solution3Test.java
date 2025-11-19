package solution.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class Solution3Test {

    @Test
    public void Test(){
        Solution3 solution = new Solution3();

        Assert.assertEquals(3,solution.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1,solution.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3,solution.lengthOfLongestSubstring("pwwkew"));
    }
}
