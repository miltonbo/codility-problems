package bo.milton.codility;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibriumTest {

    private final TapeEquilibrium code = new TapeEquilibrium();

    @Test
    public void test() {
        Assert.assertEquals(1, code.solution(new int[] { 3, 1, 2, 4, 3 }));
    }

}
