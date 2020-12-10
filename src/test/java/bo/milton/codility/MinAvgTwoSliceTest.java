package bo.milton.codility;

import org.junit.Assert;
import org.junit.Test;

public class MinAvgTwoSliceTest {

    private final MinAvgTwoSlice code = new MinAvgTwoSlice();

    @Test
    public void test() {
        Assert.assertEquals( 2, code.solution(new int[] { 5, 6, 3, 4, 9 }));
        Assert.assertEquals(1, code.solution(new int[] { 4, 2, 2, 5, 1, 5, 8 }));
        Assert.assertEquals( 0, code.solution(new int[] { 10000, -10000 }));
    }

}
