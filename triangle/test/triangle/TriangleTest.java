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

  // Mutation ??
  @Test
	public void test16() {
	    Type actual = Triangle.classify(-10, -10, -10);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// Mutation 2, ??
	@Test
	public void test17() {
	    Type actual = Triangle.classify(0, 5, 5);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// Mutation ??
	@Test
	public void test18() {
	    Type actual = Triangle.classify(10, 5, 5);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// Mutation 4
	@Test
	public void test19() {
	    Type actual = Triangle.classify(-10, 5, 5);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// Mutation 9, ??
	@Test
	public void test20() {
	    Type actual = Triangle.classify(5, -10, 5);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// Mutation 7, 8
	@Test
	public void test21() {
	    Type actual = Triangle.classify(5, 0, 5);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// Mutation 16, ??
	@Test
	public void test22() {
	    Type actual = Triangle.classify(5, 5, -10);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// Mutation 16, ??
	@Test
	public void test23() {
	    Type actual = Triangle.classify(5, 5, 0);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// Mutation 63
	@Test
	public void test25() {
	    Type actual = Triangle.classify(2, 5 , 7);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// ??
	@Test
	public void test26() {
	    Type actual = Triangle.classify(7, 2, 5);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// 70 
	@Test
	public void test27() {
	    Type actual = Triangle.classify(2, 7, 5);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// 67
	@Test
	public void test28() {
	    Type actual = Triangle.classify(3, 5, 9);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// 74
	@Test
	public void test29() {
	    Type actual = Triangle.classify(5, 9, 3);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// 80
	@Test
	public void test30() {
	    Type actual = Triangle.classify(9, 8, 13);
	    Type expected = SCALENE;
	    assertEquals (expected, actual);
	}

	// 85
	@Test
	public void test31() {
	    Type actual = Triangle.classify(4, 1, 2);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// 109
	@Test
	public void test32() {
	    Type actual = Triangle.classify(4, 4, 8);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// 105
	@Test
	public void test33() {
	    Type actual = Triangle.classify(4, 4, 10);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// 122
	@Test
	public void test34() {
	    Type actual = Triangle.classify(4, 10, 4);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	@Test
	public void test35() {
	    Type actual = Triangle.classify(4, 8, 4);
	    Type expected = INVALID;
	    assertEquals (expected, actual);
	}

	// @Test
	// public void test36() {
	//     Type actual = Triangle.classify(4, 8, 4);
	//     Type expected = INVALID;
	//     assertEquals (expected, actual);
	// }

}
