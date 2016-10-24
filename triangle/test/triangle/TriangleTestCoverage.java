package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Coverage Adequate Test class for the Triangle implementation.
 */
public class TriangleTestCoverage {

    /*
     * Test the classification of an equilateral triangle.
     */
    @Test
    public void testEquilateralTriangle() {
        Type actual = Triangle.classify(1, 1, 1);
        Type expected = EQUILATERAL;
        assertEquals (expected, actual);
    }

    /*
     * Test 1 of the classification of an ISOSCELES triangle.
     */
    @Test
    public void testIsocelesTriangle1() {
        Type actual = Triangle.classify(1, 2, 2);
        Type expected = ISOSCELES;
        assertEquals (expected, actual);
    }

    /*
     * Test 2 of the classification of an ISOSCELES triangle.
     */
    @Test
    public void testIsocelesTriangle2() {
        Type actual = Triangle.classify(2, 3, 2);
        Type expected = ISOSCELES;
        assertEquals (expected, actual);
    }
    /*
     * Test 1 of the classification of an ISOSCELES triangle.
     */
    @Test
    public void testIsocelesTriangle3() {
        Type actual = Triangle.classify(2, 2, 1);
        Type expected = ISOSCELES;
        assertEquals (expected, actual);
    }

    /*
     * Test the classification of an SCALENE triangle.
     */
     @Test
     public void testScaleneTriangle() {
         Type actual = Triangle.classify(5, 12, 13);
         Type expected = SCALENE;
         assertEquals (expected, actual);
     }

    /*
     * Test Different Conditionals for INVALID triangle.
     */
    @Test
    public void testInvalidTriangle1() {
        Type actual = Triangle.classify(1, 2, 3);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void testInvalidTriangle2() {
        Type actual = Triangle.classify(0, 1, 2);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void testInvalidTriangle3() {
        Type actual = Triangle.classify(1, 0, 2);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void testInvalidTriangle4() {
        Type actual = Triangle.classify(1, 2, 0);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void testInvalidTriangle5() {
        Type actual = Triangle.classify(3, 2, 1);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void testInvalidTriangle6() {
        Type actual = Triangle.classify(2, 3, 1);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }


    @Test
    public void testInvalidTriangle7() {
        Type actual = Triangle.classify(2, 2, 5);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void testInvalidTriangle8() {
        Type actual = Triangle.classify(5, 2, 2);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    @Test
    public void testInvalidTriangle9() {
        Type actual = Triangle.classify(2, 5, 2);
        Type expected = INVALID;
        assertEquals (expected, actual);
    }

    /*
    * Test the constructor to show if it throws any errors
    */
    @Test
    public void testConstructor() {
        try {
          Triangle t1 = new Triangle();
        } catch (Exception e) {
            assertEquals (null,e);
        }
    }

}
