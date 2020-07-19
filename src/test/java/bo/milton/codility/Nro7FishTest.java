package bo.milton.codility;

import org.junit.Assert;
import org.junit.Test;

public class Nro7FishTest {

    private Nro7StacksAndQueuesFish code = new Nro7StacksAndQueuesFish();

    @Test
    public void test() {
        int[] A = new int[] { 4, 3, 2, 1, 5 };
        int[] B = new int[] { 0, 1, 0, 0, 0 };
        Assert.assertEquals(2, code.solution(A, B));

        A = new int[] { 4, 3, 2, 1, 5 };
        B = new int[] { 0, 1, 1, 0, 0 };
        Assert.assertEquals(2, code.solution(A, B));

        A = new int[] { 4, 3, 2, 1, 5 };
        B = new int[] { 1, 0, 0, 0, 0 };
        Assert.assertEquals(1, code.solution(A, B));

        A = new int[] { 0, 1 };
        B = new int[] { 1, 1 };
        Assert.assertEquals(2, code.solution(A, B));
    }

}