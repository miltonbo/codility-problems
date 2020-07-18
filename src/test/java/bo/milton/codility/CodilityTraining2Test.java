package bo.milton.codility;

import bo.milton.codility.util.Measure;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.HashMap;

public class CodilityTraining2Test {

    private CodilityTraining2 code = new CodilityTraining2();

    @Test
    public void test1() {
        Assert.assertEquals(5, code.solution(10, 4));
        Assert.assertEquals(4, code.solution(4, 3));
        Assert.assertEquals(13, code.solution(13, 9));
        Assert.assertEquals(10, code.solution(1000000000, 900000000));
        Assert.assertEquals(1, code.solution(1, 1));
    }

    @Test
    public void test2() throws Exception {
        int[] param1 = new int[] { 2, 4, 6, 10, 12, 14, 15, 17, 18, 19, 20, 22, 24, 25, 29, 30, 40, 60, 61, 62, 64, 65, 70, 72, 73, 75, 77, 78, 80, 82, 83, 85, 87, 89, 91, 92, 94, 96, 99, 102, 104, 106, 110, 112, 114, 115, 117, 118, 119, 120, 122, 124, 125, 129, 130, 140, 160, 161, 162, 164, 165, 170, 172, 173, 175, 177, 178, 180, 182, 183, 185, 187, 189, 191, 192, 194, 196, 199  };
        int param2 = 250;
        Class[] parameterTypes = new Class[] { param1.getClass(), int.class } ;
        Method method = CodilityTraining2.class.getMethod("solution2", parameterTypes);
        long average = Measure.timeComplexity(100000, code, method, param1, param2 );
        System.out.println("Time average: " + average);
        Assert.assertEquals(1830, code.solution2( param1, param2 ));
    }

    @Test
    public void test3() {
        Assert.assertEquals(5, code.solution3(new int[] { -5, -3, -1, 0, 3, 6 }));
    }

    @Test
    public void test4() {
        Assert.assertEquals(9, code.solution4(6, new int[] { 3, 4, 5, 5, 2 }));
        Assert.assertEquals(31, code.solution4(6, new int[] { 1, 2, 3, 4, 5, 5, 2, 3, 4, 4, 1, 2 }));
    }

    @Test
    public void test5() {
        int[] A = new int[] { 1, 3, 7, 9, 9 };
        int[] B = new int[] { 5, 6, 8, 9, 10 };
        Assert.assertEquals(true, code.matches(A, B, 0, 1, new HashMap<String, Boolean>()));
        Assert.assertEquals(false, code.matches(A, B, 0, 2, new HashMap<String, Boolean>()));
        Assert.assertEquals(false, code.matches(A, B, 0, 3, new HashMap<String, Boolean>()));
        Assert.assertEquals(false, code.matches(A, B, 0, 4, new HashMap<String, Boolean>()));
        Assert.assertEquals(false, code.matches(A, B, 2, 3, new HashMap<String, Boolean>()));
        Assert.assertEquals(false, code.matches(A, B, 1, 4, new HashMap<String, Boolean>()));
        Assert.assertEquals(false, code.matches(A, B, 3, 4, new HashMap<String, Boolean>()));

        Assert.assertEquals(3, code.solution5(A, B));
    }

    @Test
    public void test6() {
//        int[] A = new int[] { 1, 5, 2, -2 };
        int[] A = new int[] { 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2, 1, 5, 2, -2 };
        Assert.assertEquals(0, code.solution6Sol2(A));

        A = new int[] { 4, -5 };
        Assert.assertEquals(1, code.solution6Sol2(A));

        A = new int[] { 4, -5, 1 };
        Assert.assertEquals(0, code.solution6Sol2(A));

        A = new int[] { };
        Assert.assertEquals(0, code.solution6Sol2(A));

        A = new int[] { 1, 2, 3, 10 };
        Assert.assertEquals(4, code.solution6Sol2(A));

        A = new int[] { 1, 5, -2, 5, 2, 3 };
        Assert.assertEquals(0, code.solution6Sol2(A));

    }

}
