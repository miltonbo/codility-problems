package bo.milton.codility;

import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {

    private final MissingInteger code = new MissingInteger();

    @Test
    public void test() {
        Assert.assertEquals(5, code.solution(new int[] { 1, 3, 6, 4, 1, 2 }));
        Assert.assertEquals(4, code.solution(new int[] { 1, 2, 3 }));
        Assert.assertEquals(1, code.solution(new int[] { -1, -3 }));
    }

}
