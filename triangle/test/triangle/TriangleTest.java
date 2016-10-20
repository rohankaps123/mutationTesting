package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

    /*
     * Test the classification of an equilateral triangle.
     */
    @Test
    public void test1() {
        Type actual = Triangle.classify(1, 1, 1);
        Type expected = EQUILATERAL;
        assertEquals (expected, actual);
    }

    /*
     * Test the classification of an ISOSCELES triangle.
     */
    @Test
    public void test2() {
        Type actual = Triangle.classify(1, 2, 2);
        Type expected = ISOSCELES;
        assertEquals (expected, actual);
    }

    @Test
    public void test3() {
        Type actual = Triangle.classify(2, 3, 2);
        Type expected = ISOSCELES;
        assertEquals (expected, actual);
    }

    @Test
    public void test4() {
        Type actual = Triangle.classify(2, 2, 1);
        Type expected = ISOSCELES;
        assertEquals (expected, actual);
    }
    /*
     * Test the classification of an SCALENE triangle.
     */

     @Test
     public void test5() {
         Type actual = Triangle.classify(5, 12, 13);
         Type expected = SCALENE;
         assertEquals (expected, actual);
     }

    /*
     * Test Different Conditionals for INVALID triangle.
     */
    @Test
    public void test6() {
        Type actual = Triangle.classify(1, 2, 3);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void test7() {
        Type actual = Triangle.classify(0, 1, 2);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void test8() {
        Type actual = Triangle.classify(1, 0, 2);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void test9() {
        Type actual = Triangle.classify(1, 2, 0);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void test10() {
        Type actual = Triangle.classify(3, 2, 1);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void test11() {
        Type actual = Triangle.classify(2, 3, 1);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }


    @Test
    public void test12() {
        Type actual = Triangle.classify(2, 2, 5);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void test13() {
        Type actual = Triangle.classify(5, 2, 2);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void test14() {
        Type actual = Triangle.classify(2, 5, 2);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

   /*
    * Test the constructor to show if it throws any errors
    */
    @Test(expected = Exception.class)
    public void test15() {
    Triangle t1 = new Triangle();
  }
}
