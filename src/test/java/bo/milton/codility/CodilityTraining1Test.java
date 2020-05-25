package bo.milton.codility;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;

public class CodilityTraining1Test {
    CodilityTraining1 code = new CodilityTraining1();

    @Test
    public void test1() {
        Assert.assertEquals(2, code.solution(9));
        Assert.assertEquals(4, code.solution(529));
        Assert.assertEquals(1, code.solution(20));
        Assert.assertEquals(0, code.solution(15));
        Assert.assertEquals(0, code.solution(32));
        Assert.assertEquals(5, code.solution(1041));
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(new int[] {9}, code.solution2(new int[] {9}, 3));
        Assert.assertArrayEquals(new int[] {9, 7, 6, 3, 8}, code.solution2(new int[] {3, 8, 9, 7, 6}, 3));
        Assert.assertArrayEquals(new int[] {0, 0, 0}, code.solution2(new int[] {0, 0, 0}, 3));
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4}, code.solution2(new int[] {1, 2, 3, 4}, 4));
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4}, code.solution2(new int[] {1, 2, 3, 4}, 4));
    }

    @Test
    public void test3() {
        Assert.assertEquals(3, code.solution3(10, 85, 30));
    }

    @Test
    public void test4() {
        Assert.assertEquals(6, code.solution4(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 } ));
        Assert.assertEquals(-1, code.solution4(5, new int[] { 1, 3 } ));
        Assert.assertEquals(-1, code.solution4(100000, new int[] { 1, 3 } ));
    }

    @Test
    public void test5() {
        Assert.assertEquals(3, code.solution5v2(6, 11, 2));
        Assert.assertEquals(1000000001, code.solution5v2(0, 2000000000, 2));
        Assert.assertEquals(5, code.solution5v2(0, 9, 2));
        Assert.assertEquals(10, code.solution5v2(0, 19, 2));
        Assert.assertEquals(1, code.solution5v2(2, 5, 4));
        Assert.assertEquals(1, code.solution5v2(2, 5, 3));
        Assert.assertEquals(4, code.solution5v2(2, 8, 2));
        Assert.assertEquals(2, code.solution5v2(2, 8, 3));
        Assert.assertEquals(1, code.solution5v2(2, 8, 8));
        Assert.assertEquals(1, code.solution5v2(2, 8, 5));
        Assert.assertEquals(1, code.solution5v2(2, 8, 6));
        Assert.assertEquals(1, code.solution5v2(2, 8, 7));
        Assert.assertEquals(1, code.solution5v2(0, 0, 7));
        Assert.assertEquals(1, code.solution5v2(0, 1, 1));
        Assert.assertEquals(2000000001, code.solution5v2(0, 2000000000, 1));
    }

    @Test
    public void test6() {
        Assert.assertEquals(3, code.solution6(new int[] { 2, 1, 1, 2, 3, 1 }) );
        Assert.assertEquals(3, code.solution6(new int[] { 2, 1, 1, 2, 3, 1 }) );
    }

    @Test
    public void test7() {
        Assert.assertEquals(1, code.solution7("{[()()]}"));
        Assert.assertEquals(0, code.solution7("([)()]"));
        Assert.assertEquals(0, code.solution7("(()()()()()()()()()]"));
        Assert.assertEquals(1, code.solution7("(()()()()()()()()())"));
        Assert.assertEquals(1, code.solution7("{[]}{}{()}"));
        Assert.assertEquals(0, code.solution7("}"));
    }

    @Test
    public void test8() {
        int result1 = code.solution8(new int[] { 3,4,3,2,3,-1,3,3 });
        System.out.println("RESULT: " + result1);
        Assert.assertThat(result1,
                anyOf(is(0), is(2), is(4) ,is(6), is(7)));

        result1 = code.solution8(new int[] { });
        System.out.println("RESULT: " + result1);
        Assert.assertThat(result1, anyOf(is(-1)));

        result1 = code.solution8(new int[] { });
        System.out.println("RESULT: " + result1);
        Assert.assertThat(result1, anyOf(is(-1)));

        result1 = code.solution8(new int[] { 1, 2, 3, 4, 4, 4, 4 });
        System.out.println("RESULT: " + result1);
        Assert.assertThat(result1, anyOf(is(3)));
    }

    @Test
    public void test9() {
        Assert.assertEquals(8, code.solution9(24));
        Assert.assertEquals(4, code.solution9(10));
        Assert.assertEquals(4, code.solution9(15));
        Assert.assertEquals(6, code.solution9(32));
        Assert.assertEquals(5, code.solution9(16));
        Assert.assertEquals(9, code.solution9(36));
        Assert.assertEquals(1, code.solution9(1));
        Assert.assertEquals(3, code.solution9(4));
        Assert.assertEquals(3, code.solution9(9));
        Assert.assertEquals(7, code.solution9(64));
        Assert.assertEquals(16, code.solution9(120));
        Assert.assertEquals(30, code.solution9(720));
        Assert.assertEquals(4, code.solution9(1111));
        Assert.assertEquals(4, code.solution9(6));
        Assert.assertEquals(2, code.solution9(2));
        Assert.assertEquals(2, code.solution9(41));
        Assert.assertEquals(8, code.solution9(42));
        Assert.assertEquals(8, code.solution9(42));
    }

    @Test
    public void test10() {
        Assert.assertArrayEquals(new int [] { 2, 4, 3, 2, 0 },
                code.solution10(new int [] {  3, 1, 2, 3, 6 } ) );
    }

}
