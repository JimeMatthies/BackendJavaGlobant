/*
Guia 9 = Aplicación Calculadora (Videos 3)
@author JimeM
 */
package guia9ejerciciovideocalculadora;

import Entity.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Guia9EjercicioVideoCalculadoraTest {

    public Guia9EjercicioVideoCalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Guia9EjercicioVideoCalculadora.
     */
    @Test
    public void testMain() {
        System.out.println("---------------------------------");
        System.out.println("Main");
        String[] args = null;
        Guia9EjercicioVideoCalculadora.main(args);
    }

    @Test
    public void testAdd() {
        System.out.println("---------------------------------");
        System.out.println("Add test:");
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println(result);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        System.out.println("---------------------------------");
        System.out.println("Subtract test:");
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 2);
        System.out.println(result);
        assertEquals(3, result);
    }

    @Test
    public void testMultiply() {
        System.out.println("---------------------------------");
        System.out.println("Multiply test:");
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 3);
        System.out.println(result);
        assertEquals(15, result);
    }

    @Test
    public void testDivide() {
        System.out.println("---------------------------------");
        System.out.println("Divide test:");
        Calculator calculator = new Calculator();
        int result = calculator.divide(12, 3);
        System.out.println(result);
        assertEquals(4, result);
    }
}
