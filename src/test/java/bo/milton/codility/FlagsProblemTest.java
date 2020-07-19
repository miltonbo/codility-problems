package bo.milton.codility;

import org.junit.Assert;
import org.junit.Test;

public class FlagsProblemTest {

    private FlagsProblem code = new FlagsProblem();

    @Test
    public void test() {
        int[] A = new int[] { 1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };
        Assert.assertEquals(3, code.solution(A));

        A = new int[] { 1, 3, 2 };
        Assert.assertEquals(1, code.solution(A));

        A = new int[] { 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 };
        Assert.assertEquals(2, code.solution(A));
    }

}