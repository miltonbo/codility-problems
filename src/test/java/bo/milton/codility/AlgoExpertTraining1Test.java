package bo.milton.codility;

import org.junit.Assert;
import org.junit.Test;

public class AlgoExpertTraining1Test {

    private AlgoExpertTraining1 code = new AlgoExpertTraining1();

    @Test
    public void test1() {
        Assert.assertEquals(1, code.getNthFib(2));
        Assert.assertEquals(5, code.getNthFib(6));
        Assert.assertEquals(34, code.getNthFib(10));
        Assert.assertEquals(-889489150, code.getNthFib(100));
    }

}
