package bo.milton.codility;

import org.junit.Assert;
import org.junit.Test;

public class CodilityTraining3Test {

    private CodilityTraining3 code = new CodilityTraining3();

    @Test
    public void oddOccurrencesInArray() {
        int[] A = new int[] { 9, 3, 9, 3, 9, 7, 9 };
        Assert.assertEquals(7, code.oddOccurrencesInArray(A));

        A = new int[] { 9, 3, 9 };
        Assert.assertEquals(3, code.oddOccurrencesInArray(A));

        A = new int[] { 1 };
        Assert.assertEquals(1, code.oddOccurrencesInArray(A));
    }

    @Test
    public void permMissingElem() {
        int[] A = new int[] { 2, 3, 1, 5 };
        Assert.assertEquals(4, code.permMissingElem(A));

        A = new int[] { 2, 3, 1, 5, 4 };
        Assert.assertEquals(6, code.permMissingElem(A));

        A = new int[] { 2, 3, 1, 5, 4, 6 };
        Assert.assertEquals(7, code.permMissingElem(A));
    }

    @Test
    public void maxCounters() {
        int[] A = new int[] { 3, 4, 4, 6, 1, 4, 4 };
        int[] result = new int[] { 3, 2, 2, 4, 2 };
        Assert.assertArrayEquals(result, code.maxCounters(5, A));

        A = new int[] { 6, 6, 6 };
        result = new int[] { 0, 0, 0, 0, 0 };
        Assert.assertArrayEquals(result, code.maxCounters(5, A));

        A = new int[] { 1, 2, 3, 4, 5 };
        result = new int[] { 1, 1, 1, 1, 1 };
        Assert.assertArrayEquals(result, code.maxCounters(5, A));
    }

    @Test
    public void genomicRangeQuery() {
        String S = "CAGCCTA";
        int[] P = new int[] { 0, 2, 5, 0 };
        int[] Q = new int[] { 6, 4, 5, 6 };
        int[] result = new int[] { 1, 2, 4, 1 };
        Assert.assertArrayEquals(result, code.genomicRangeQuery(S, P, Q));

        S = "CAGCCTA";
        P = new int[] { 2, 5 };
        Q = new int[] { 4, 5 };
        result = new int[] { 2, 4 };
        Assert.assertArrayEquals(result, code.genomicRangeQuery(S, P, Q));

        S = "CAGCCTA";
        P = new int[] { 2, 5 };
        Q = new int[] { 4, 5 };
        result = new int[] { 2, 4 };
        Assert.assertArrayEquals(result, code.genomicRangeQuery(S, P, Q));
    }

}
