package solution.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class Solution3258Test {
    @Test
    public void Test(){
        Solutionh3258 solution = new Solutionh3258();

        Assert.assertEquals(12,solution.countKConstraintSubstrings("10101",1));
        Assert.assertEquals(25,solution.countKConstraintSubstrings("1010101",2));
        Assert.assertEquals(15,solution.countKConstraintSubstrings("11111",1));
    }
}
