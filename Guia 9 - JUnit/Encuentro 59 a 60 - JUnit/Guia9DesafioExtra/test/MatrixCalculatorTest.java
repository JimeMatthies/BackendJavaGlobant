/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Services.MatrixCalculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JimeM
 */
public class MatrixCalculatorTest {

    public MatrixCalculatorTest() {
    }

    MatrixCalculator mc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mc = new MatrixCalculator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSumMatrix() {
        System.out.println("---------------------------------");
        System.out.println("Sum matrix test");
        int A[][] = {{10, 20, 30}, {45, 35, 25}, {1, 2, 3}};
        int B[][] = {{40, 30, 20}, {5, 15, 25}, {49, 48, 47}};
        int Result[][] = {{50, 50, 50}, {50, 50, 50}, {50, 50, 50}};
        Assert.assertArrayEquals(Result, mc.sumMatrix(A, B));
    }

    @Test
    public void testSubtractMatrix() {
        System.out.println("---------------------------------");
        System.out.println("Subtract matrix test");
        int A[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int B[][] = {{5, 15, 25}, {35, 45, 55}, {65, 75, 85}};
        int Result[][] = {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};
        Assert.assertArrayEquals(Result, mc.subtractMatrix(A, B));
    }

    @Test
    public void testMultiplyMatrix() {
        System.out.println("---------------------------------");
        System.out.println("Multiply matrix test");
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B[][] = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int Result[][] = {{6, 6, 6}, {15, 15, 15}, {24, 24, 24}};
        Assert.assertArrayEquals(Result, mc.multiplyMatrix(A, B));
    }

    @Test
    public void testDeterminantOfMatrix() {
        System.out.println("---------------------------------");
        System.out.println("Determinant of matrix test");
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B[][] = {{5, 25, 15}, {3, 5, 68}, {4, 12, 56}};
        assertEquals(0, mc.determinantOfMatrix(A, A.length));
        assertEquals(160, mc.determinantOfMatrix(B, B.length));
    }

    @Test
    public void testTransposeMatrix() {
        System.out.println("---------------------------------");
        System.out.println("Transpose matrix test");
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int Result[][] = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Assert.assertArrayEquals(Result, mc.transposeMatrix(A));
    }
    
    @Test
    public void testAdjointMatrix() {
        System.out.println("---------------------------------");
        System.out.println("Adjoint matrix test");
        int A[][] = {{5, -2, 2}, {1, 0, 3}, {-3, 1, 5}};
        int Result[][] = {{-3, 12, -6}, {-14, 31, -13}, {1, 1, 2}};
        int[][] adj = new int[3][3];
        mc.adjoint(A, adj);
        Assert.assertArrayEquals(Result, adj);
    }
            
    @Test
    public void testInverseMatrix() {
        System.out.println("---------------------------------");
        System.out.println("Inverse matrix test");
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B[][] = {{5, -2, 2}, {1, 0, 3}, {-3, 1, 5}};
        float[][] inv = new float[3][3];
        assertFalse(mc.inverse(A, inv));
        assertTrue(mc.inverse(B, inv));
    }
}
